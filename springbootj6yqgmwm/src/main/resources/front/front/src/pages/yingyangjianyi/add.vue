<template>
	<div class="add-update-preview">
		<el-form
			class="add-update-form"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="180px"
			>
			<el-form-item class="add-item" label="标题" prop="biaoti">
				<el-input v-model="ruleForm.biaoti" 
					placeholder="标题" clearable :disabled=" false  ||ro.biaoti"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="封面" v-if="type!='cross' || (type=='cross' && !ro.fengmian)" prop="fengmian">
				<file-upload
					tip="点击上传封面"
					action="file/upload"
					:limit="3"
					:multiple="true"
					:fileUrls="ruleForm.fengmian?ruleForm.fengmian:''"
					@change="fengmianUploadChange"
					></file-upload>
			</el-form-item>
			<el-form-item class="add-item" v-else label="封面" prop="fengmian">
				<img v-if="ruleForm.fengmian.substring(0,4)=='http'" class="upload-img" v-bind:key="index" :src="ruleForm.fengmian.split(',')[0]">
				<img v-else class="upload-img" v-bind:key="index" v-for="(item,index) in ruleForm.fengmian.split(',')" :src="baseUrl+item">
			</el-form-item>
			<el-form-item class="add-item" label="账号" prop="zhanghao">
				<el-input v-model="ruleForm.zhanghao" 
					placeholder="账号" clearable :disabled=" false  ||ro.zhanghao"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="姓名" prop="xingming">
				<el-input v-model="ruleForm.xingming" 
					placeholder="姓名" clearable :disabled=" false  ||ro.xingming"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="性别" prop="xingbie">
				<el-input v-model="ruleForm.xingbie" 
					placeholder="性别" clearable :disabled=" false  ||ro.xingbie"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="年龄" prop="nianling">
				<el-input v-model.number="ruleForm.nianling" 
					placeholder="年龄" clearable :disabled=" false  ||ro.nianling"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="体重kg" prop="tizhongkg">
				<el-input-number v-model="ruleForm.tizhongkg" placeholder="体重kg" :disabled=" false ||ro.tizhongkg"></el-input-number>
			</el-form-item>
			<el-form-item class="add-item" label="身高m" prop="shengaom">
				<el-input-number v-model="ruleForm.shengaom" placeholder="身高m" :disabled=" false ||ro.shengaom"></el-input-number>
			</el-form-item>
			<el-form-item class="add-item" label="bmi" prop="bmi">
				<el-input-number v-model="ruleForm.bmi" placeholder="bmi" :disabled=" false ||ro.bmi"></el-input-number>
			</el-form-item>
			<el-form-item class="add-item" label="血压mmHg" prop="xueya">
				<el-input v-model="ruleForm.xueya" 
					placeholder="血压mmHg" clearable :disabled=" false  ||ro.xueya"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="血糖水平" prop="xuetangshuiping">
				<el-input v-model="ruleForm.xuetangshuiping" 
					placeholder="血糖水平" clearable :disabled=" false  ||ro.xuetangshuiping"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="评估时间" prop="pinggushijian">
				<el-date-picker
					:disabled=" false  ||ro.pinggushijian"
					value-format="yyyy-MM-dd HH:mm:ss"
					v-model="ruleForm.pinggushijian" 
					type="datetime"
					placeholder="评估时间">
				</el-date-picker>
			</el-form-item>
			<el-form-item class="add-item"  label="健康程度" prop="jiankangchengdu">
				<el-select v-model="ruleForm.jiankangchengdu" placeholder="请选择健康程度" :disabled=" false  ||ro.jiankangchengdu" >
					<el-option
						v-for="(item,index) in jiankangchengduOptions"
						:key="index"
						:label="item"
						:value="item">
					</el-option>
				</el-select>
			</el-form-item>
			<el-form-item class="add-item" label="热量参考" prop="reliangcankao">
				<el-input v-model="ruleForm.reliangcankao" 
					placeholder="热量参考" clearable :disabled=" false  ||ro.reliangcankao"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="蛋白质参考" prop="danbaizhicankao">
				<el-input v-model="ruleForm.danbaizhicankao" 
					placeholder="蛋白质参考" clearable :disabled=" false  ||ro.danbaizhicankao"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="脂肪参考" prop="zhifangcankao">
				<el-input v-model="ruleForm.zhifangcankao" 
					placeholder="脂肪参考" clearable :disabled=" false  ||ro.zhifangcankao"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="钙" prop="gai">
				<el-input v-model="ruleForm.gai" 
					placeholder="钙" clearable :disabled=" false  ||ro.gai"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="镁" prop="mei">
				<el-input v-model="ruleForm.mei" 
					placeholder="镁" clearable :disabled=" false  ||ro.mei"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="铁" prop="tie">
				<el-input v-model="ruleForm.tie" 
					placeholder="铁" clearable :disabled=" false  ||ro.tie"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="碘" prop="dian">
				<el-input v-model="ruleForm.dian" 
					placeholder="碘" clearable :disabled=" false  ||ro.dian"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="锌" prop="xin">
				<el-input v-model="ruleForm.xin" 
					placeholder="锌" clearable :disabled=" false  ||ro.xin"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="维生素" prop="weishengsu">
				<el-input
					type="textarea"
					:rows="8"
					placeholder="维生素"
					v-model="ruleForm.weishengsu">
					</el-input>
			</el-form-item>

			<el-form-item class="add-btn-item">
				<el-button class="submitBtn"  type="primary" @click="onSubmit">
					<span class="icon iconfont "></span>
					<span class="text">提交</span>
				</el-button>
				<el-button class="closeBtn" @click="back()">
					<span class="icon iconfont "></span>
					<span class="text">取消</span>
				</el-button>
			</el-form-item>
		</el-form>
	</div>
</template>

<script>
	export default {
		data() {
			return {
				id: '',
				baseUrl: '',
				ro:{
					biaoti : false,
					fengmian : false,
					zhanghao : false,
					xingming : false,
					xingbie : false,
					nianling : false,
					tizhongkg : false,
					shengaom : false,
					bmi : false,
					xueya : false,
					xuetangshuiping : false,
					pinggushijian : false,
					jiankangchengdu : false,
					reliangcankao : false,
					danbaizhicankao : false,
					zhifangcankao : false,
					gai : false,
					mei : false,
					tie : false,
					dian : false,
					xin : false,
					weishengsu : false,
				},
				type: '',
				userTableName: localStorage.getItem('UserTableName'),
				ruleForm: {
					biaoti: '',
					fengmian: '',
					zhanghao: '',
					xingming: '',
					xingbie: '',
					nianling: '',
					tizhongkg: '',
					shengaom: '',
					bmi: '',
					xueya: '',
					xuetangshuiping: '',
					pinggushijian: '',
					jiankangchengdu: '',
					reliangcankao: '',
					danbaizhicankao: '',
					zhifangcankao: '',
					gai: '',
					mei: '',
					tie: '',
					dian: '',
					xin: '',
					weishengsu: '',
				},
				jiankangchengduOptions: [],


				rules: {
					biaoti: [
					],
					fengmian: [
					],
					zhanghao: [
					],
					xingming: [
					],
					xingbie: [
					],
					nianling: [
						{ validator: this.$validate.isIntNumer, trigger: 'blur' },
					],
					tizhongkg: [
						{ validator: this.$validate.isNumber, trigger: 'blur' },
					],
					shengaom: [
						{ validator: this.$validate.isNumber, trigger: 'blur' },
					],
					bmi: [
						{ validator: this.$validate.isNumber, trigger: 'blur' },
					],
					xueya: [
					],
					xuetangshuiping: [
					],
					pinggushijian: [
					],
					jiankangchengdu: [
						{ required: true, message: '健康程度不能为空', trigger: 'blur' },
					],
					reliangcankao: [
					],
					danbaizhicankao: [
					],
					zhifangcankao: [
					],
					gai: [
					],
					mei: [
					],
					tie: [
					],
					dian: [
					],
					xin: [
					],
					weishengsu: [
					],
				},
				centerType: false,
			};
		},
		computed: {



		},
		components: {
		},
		created() {
			if(this.$route.query.centerType){
				this.centerType = true
			}
			//this.bg();
			let type = this.$route.query.type ? this.$route.query.type : '';
			this.init(type);
			this.baseUrl = this.$config.baseUrl;
			this.ruleForm.pinggushijian = this.getCurDateTime()
		},
		methods: {
			getMakeZero(s) {
				return s < 10 ? '0' + s : s;
			},
			// 下载
			download(file){
				window.open(`${file}`)
			},
			// 初始化
			init(type) {
				this.type = type;
				if(type=='cross'){
					var obj = JSON.parse(localStorage.getItem('crossObj'));
					for (var o in obj){
						if(o=='biaoti'){
							this.ruleForm.biaoti = obj[o];
							this.ro.biaoti = true;
							continue;
						}
						if(o=='fengmian'){
							this.ruleForm.fengmian = obj[o]?obj[o].split(",")[0]:'';
							this.ro.fengmian = true;
							continue;
						}
						if(o=='zhanghao'){
							this.ruleForm.zhanghao = obj[o];
							this.ro.zhanghao = true;
							continue;
						}
						if(o=='xingming'){
							this.ruleForm.xingming = obj[o];
							this.ro.xingming = true;
							continue;
						}
						if(o=='xingbie'){
							this.ruleForm.xingbie = obj[o];
							this.ro.xingbie = true;
							continue;
						}
						if(o=='nianling'){
							this.ruleForm.nianling = obj[o];
							this.ro.nianling = true;
							continue;
						}
						if(o=='tizhongkg'){
							this.ruleForm.tizhongkg = obj[o];
							this.ro.tizhongkg = true;
							continue;
						}
						if(o=='shengaom'){
							this.ruleForm.shengaom = obj[o];
							this.ro.shengaom = true;
							continue;
						}
						if(o=='bmi'){
							this.ruleForm.bmi = obj[o];
							this.ro.bmi = true;
							continue;
						}
						if(o=='xueya'){
							this.ruleForm.xueya = obj[o];
							this.ro.xueya = true;
							continue;
						}
						if(o=='xuetangshuiping'){
							this.ruleForm.xuetangshuiping = obj[o];
							this.ro.xuetangshuiping = true;
							continue;
						}
						if(o=='pinggushijian'){
							this.ruleForm.pinggushijian = obj[o];
							this.ro.pinggushijian = true;
							continue;
						}
						if(o=='jiankangchengdu'){
							this.ruleForm.jiankangchengdu = obj[o];
							this.ro.jiankangchengdu = true;
							continue;
						}
						if(o=='reliangcankao'){
							this.ruleForm.reliangcankao = obj[o];
							this.ro.reliangcankao = true;
							continue;
						}
						if(o=='danbaizhicankao'){
							this.ruleForm.danbaizhicankao = obj[o];
							this.ro.danbaizhicankao = true;
							continue;
						}
						if(o=='zhifangcankao'){
							this.ruleForm.zhifangcankao = obj[o];
							this.ro.zhifangcankao = true;
							continue;
						}
						if(o=='gai'){
							this.ruleForm.gai = obj[o];
							this.ro.gai = true;
							continue;
						}
						if(o=='mei'){
							this.ruleForm.mei = obj[o];
							this.ro.mei = true;
							continue;
						}
						if(o=='tie'){
							this.ruleForm.tie = obj[o];
							this.ro.tie = true;
							continue;
						}
						if(o=='dian'){
							this.ruleForm.dian = obj[o];
							this.ro.dian = true;
							continue;
						}
						if(o=='xin'){
							this.ruleForm.xin = obj[o];
							this.ro.xin = true;
							continue;
						}
						if(o=='weishengsu'){
							this.ruleForm.weishengsu = obj[o];
							this.ro.weishengsu = true;
							continue;
						}
					}
				}else if(type=='edit'){
					this.info()
				}
				// 获取用户信息
				this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
					if (res.data.code == 0) {
						var json = res.data.data;
					}
				});
				this.jiankangchengduOptions = "健康,亚健康,较差,疾病".split(',')

				if (localStorage.getItem('raffleType') && localStorage.getItem('raffleType') != null) {
					localStorage.removeItem('raffleType')
					setTimeout(() => {
						this.onSubmit()
					}, 300)
				}
			},

			// 多级联动参数
			// 多级联动参数
			info() {
				this.$http.get(`yingyangjianyi/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
					if (res.data.code == 0) {
						this.ruleForm = res.data.data;
					}
				});
			},
			// 提交
			async onSubmit() {
				if(!this.ruleForm.id) {
					delete this.ruleForm.userid
				}
				await this.$refs["ruleForm"].validate(async valid => {
					if(valid) {
						if(this.type=='cross'){
							var statusColumnName = localStorage.getItem('statusColumnName');
							var statusColumnValue = localStorage.getItem('statusColumnValue');
							if(statusColumnName && statusColumnName!='') {
								var obj = JSON.parse(localStorage.getItem('crossObj'));
								if(!statusColumnName.startsWith("[")) {
									for (var o in obj){
										if(o==statusColumnName){
											obj[o] = statusColumnValue;
										}
									}
									var table = localStorage.getItem('crossTable');
									await this.$http.post(table+'/update', obj).then(res => {});
								}
							}
						}


						await this.$http.post(`yingyangjianyi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(async res => {
							if (res.data.code == 0) {
								this.$message({
									message: '操作成功',
									type: 'success',
									duration: 1500,
									onClose: () => {
										this.$router.go(-1);
										
									}
								});
							} else {
								this.$message({
									message: res.data.msg,
									type: 'error',
									duration: 1500
								});
							}
						});
					}
				});
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 返回
			back() {
				this.$router.go(-1);
			},
			fengmianUploadChange(fileUrls) {
				this.ruleForm.fengmian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
			},
		}
	};
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.add-update-preview {
		padding: 0 0 20px;
		margin: 0px auto;
		color: #666;
		background: #fff;
		width: 1200px;
		font-size: 16px;
		position: relative;
		.add-update-form {
			margin: 20px 0 0;
			width: 100%;
			position: relative;
			.add-item.el-form-item {
				border-radius: 0px;
				padding: 6px 0 0;
				margin: 0 0 20px 0;
				background: none;
				border-color: #475a8310;
				border-width:  0 0 0px;
				border-style: solid;
				/deep/ .el-form-item__label {
					padding: 0 10px 0 0;
					color: #666;
					font-weight: 500;
					width: 180px;
					font-size: inherit;
					line-height: 40px;
					text-align: right;
				}
				/deep/ .el-form-item__content {
					margin-left: 180px;
				}
				.el-input {
					width: auto;
				}
				.el-input /deep/ .el-input__inner {
					border: 1px solid #ddd;
					border-radius: 0px;
					padding: 0 12px;
					box-shadow: none;
					color: inherit;
					width: auto;
					font-size: 16px;
					height: 40px;
				}
				.el-input /deep/ .el-input__inner[readonly="readonly"] {
					border: 0;
					cursor: not-allowed;
					border-radius: 0px;
					padding: 0 12px;
					box-shadow: none;
					color: rgba(85, 85, 127, 1.0);
					background: none;
					width: auto;
					font-size: 16px;
					height: 40px;
				}
				.el-input-number /deep/ .el-input__inner {
					text-align: left;
					border: 1px solid #ddd;
					border-radius: 0px;
					padding: 0 12px;
					box-shadow: none;
					color: inherit;
					width: auto;
					font-size: 16px;
					height: 40px;
				}
				.el-input-number /deep/ .is-disabled .el-input__inner {
					text-align: left;
					border: 0;
					cursor: not-allowed;
					border-radius: 0px;
					padding: 0 12px;
					box-shadow: none;
					color: rgba(85, 85, 127, 1.0);
					background: none;
					width: auto;
					font-size: 16px;
					height: 40px;
				}
				.el-input-number /deep/ .el-input-number__decrease {
					display: none;
				}
				.el-input-number /deep/ .el-input-number__increase {
					display: none;
				}
				.el-select {
					width: auto;
				}
				.el-select /deep/ .el-input__inner {
					border: 1px solid #ddd;
					border-radius: 0px;
					padding: 0 10px;
					color: inherit;
					width: 100%;
					font-size: 16px;
					min-width: inherit !important;
					height: 40px;
				}
				.el-select /deep/ .is-disabled .el-input__inner {
					border: 0;
					cursor: not-allowed;
					border-radius: 0px;
					padding: 0 10px;
					box-shadow: none;
					color: inherit;
					background: none;
					width: 100%;
					font-size: 16px;
					height: 40px;
				}
				.el-date-editor {
					width: auto;
				}
				.el-date-editor /deep/ .el-input__inner {
					border: 1px solid #ddd;
					border-radius: 0px;
					padding: 0 10px 0 30px;
					box-shadow: none;
					color: inherit;
					width: auto;
					font-size: 16px;
					height: 40px;
				}
				.el-date-editor /deep/ .el-input__inner[readonly="readonly"] {
					border: 0;
					cursor: not-allowed;
					border-radius: 0px;
					padding: 0 10px 0 30px;
					box-shadow: none;
					color: inherit;
					background: none;
					width: auto;
					font-size: 16px;
					height: 40px;
				}
				/deep/ .el-upload--picture-card {
					background: transparent;
					border: 0;
					border-radius: 0;
					width: auto;
					height: auto;
					line-height: initial;
					vertical-align: middle;
				}
				/deep/ .upload .upload-img {
					border: 1px solid #ddd;
					cursor: pointer;
					border-radius: 0px;
					color: #999;
					background: #fff;
					width: 80px;
					font-size: 26px;
					line-height: 60px;
					text-align: center;
					height: 60px;
				}
				/deep/ .el-upload-list .el-upload-list__item {
					border: 1px solid #ddd;
					cursor: pointer;
					border-radius: 0px;
					color: #999;
					background: #fff;
					width: 80px;
					font-size: 26px;
					line-height: 60px;
					text-align: center;
					height: 60px;
					font-size: 14px;
					line-height: 1.8;
				}
				/deep/ .el-upload .el-icon-plus {
					border: 1px solid #ddd;
					cursor: pointer;
					border-radius: 0px;
					color: #999;
					background: #fff;
					width: 80px;
					font-size: 26px;
					line-height: 60px;
					text-align: center;
					height: 60px;
				}
				/deep/ .el-upload__tip {
					color: #888;
					font-size: 16px;
				}
				.el-textarea /deep/ .el-textarea__inner {
					border: 1px solid #ddd;
					border-radius: 0px;
					padding: 12px;
					box-shadow: none;
					color: inherit;
					width: auto;
					font-size: 16px;
					min-height: 150px;
					min-width: 48%;
					height: auto;
				}
				.el-textarea /deep/ .el-textarea__inner[readonly="readonly"] {
					border: 0px solid #ddd;
					cursor: not-allowed;
					border-radius: 0px;
					padding: 12px;
					box-shadow: none;
					color: inherit;
					background: none;
					width: auto;
					font-size: 16px;
					min-height: 150px;
					min-width: 50%;
					height: auto;
				}
				/deep/ .el-input__inner::placeholder {
					color: inherit;
					font-size: inherit;
				}
				/deep/ textarea::placeholder {
					color: inherit;
					font-size: inherit;
				}
				.editor {
					background-color: #fff;
					border-radius: 0;
					padding: 0;
					box-shadow: none;
					margin: 0;
					width: 100%;
					min-height: 350px;
					border-color: #ccc;
					border-width: 1px;
					border-style: solid;
					height: auto;
				}
				.upload-img {
					object-fit: cover;
					width: 100px;
					height: 100px;
				}
				.viewBtn {
					border: 0;
					cursor: pointer;
					border-radius: 4px;
					padding: 0 20px;
					margin: 0;
					color: #333;
					background: #475a8330;
					display: inline-block;
					width: auto;
					font-size: 14px;
					line-height: 34px;
					height: 34px;
				}
				.viewBtn:hover {
				}
				.unviewBtn {
					border: 0;
					cursor: pointer;
					padding: 0 20px;
					margin: 0;
					color: #333;
					display: inline-block;
					font-size: 14px;
					line-height: 34px;
					border-radius: 4px;
					outline: none;
					background: #ddd;
					width: auto;
					height: 34px;
				}
				.unviewBtn:hover {
				}
			}
			.add-btn-item {
				padding: 0;
				margin: 20px 0;
				.submitBtn {
					border: 0;
					cursor: pointer;
					padding: 0 24px 0 30px;
					margin: 0 20px 0 0;
					display: inline-block;
					font-size: 16px;
					line-height: 44px;
					border-radius: 4px;
					background: #0066D4;
					width: auto;
					text-align: center;
					min-width: 120px;
					height: 44px;
					.icon {
						color: #fff;
					}
					.text {
						color: #fff;
					}
				}
				.submitBtn:hover {
					color: #fff;
					.icon {
					}
					.text {
					}
				}
				.closeBtn {
					border: 1px solid #0066D450;
					cursor: pointer;
					padding: 0 24px 0 30px;
					margin: 0 20px 0 0;
					color: #0066D4;
					display: inline-block;
					font-size: 16px;
					line-height: 44px;
					border-radius: 4px;
					background: #fff;
					width: auto;
					text-align: center;
					min-width: 120px;
					height: 44px;
					.icon {
						color: #333;
					}
					.text {
						color: #0066D4;
					}
				}
				.closeBtn:hover {
					color: #80593c;
					.icon {
					}
					.text {
					}
				}
			}
		}
	}
	.el-date-editor.el-input {
		width: auto;
	}
</style>

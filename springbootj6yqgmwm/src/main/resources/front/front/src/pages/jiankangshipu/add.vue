<template>
	<div class="add-update-preview">
		<el-form
			class="add-update-form"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="180px"
			>
			<el-form-item class="add-item" label="食谱名称" prop="shipumingcheng">
				<el-input v-model="ruleForm.shipumingcheng" 
					placeholder="食谱名称" clearable :disabled=" false  ||ro.shipumingcheng"></el-input>
			</el-form-item>
			<el-form-item class="add-item"  label="食谱类型" prop="shipuleixing">
				<el-select v-model="ruleForm.shipuleixing" placeholder="请选择食谱类型" :disabled=" false  ||ro.shipuleixing" >
					<el-option
						v-for="(item,index) in shipuleixingOptions"
						:key="index"
						:label="item"
						:value="item">
					</el-option>
				</el-select>
			</el-form-item>
			<el-form-item class="add-item" label="食谱封面" v-if="type!='cross' || (type=='cross' && !ro.shipufengmian)" prop="shipufengmian">
				<file-upload
					tip="点击上传食谱封面"
					action="file/upload"
					:limit="3"
					:multiple="true"
					:fileUrls="ruleForm.shipufengmian?ruleForm.shipufengmian:''"
					@change="shipufengmianUploadChange"
					></file-upload>
			</el-form-item>
			<el-form-item class="add-item" v-else label="食谱封面" prop="shipufengmian">
				<img v-if="ruleForm.shipufengmian.substring(0,4)=='http'" class="upload-img" v-bind:key="index" :src="ruleForm.shipufengmian.split(',')[0]">
				<img v-else class="upload-img" v-bind:key="index" v-for="(item,index) in ruleForm.shipufengmian.split(',')" :src="baseUrl+item">
			</el-form-item>
			<el-form-item class="add-item" label="能量" prop="nengliang">
				<el-input v-model="ruleForm.nengliang" 
					placeholder="能量" clearable :disabled=" false  ||ro.nengliang"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="蛋白质" prop="danbaizhi">
				<el-input v-model="ruleForm.danbaizhi" 
					placeholder="蛋白质" clearable :disabled=" false  ||ro.danbaizhi"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="脂肪" prop="zhifang">
				<el-input v-model="ruleForm.zhifang" 
					placeholder="脂肪" clearable :disabled=" false  ||ro.zhifang"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="碳水化合物" prop="tanshuihuahewu">
				<el-input v-model="ruleForm.tanshuihuahewu" 
					placeholder="碳水化合物" clearable :disabled=" false  ||ro.tanshuihuahewu"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="账号" prop="zhanghao">
				<el-input v-model="ruleForm.zhanghao" 
					placeholder="账号" clearable :disabled=" false  ||ro.zhanghao"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="姓名" prop="xingming">
				<el-input v-model="ruleForm.xingming" 
					placeholder="姓名" clearable :disabled=" false  ||ro.xingming"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="制作流程" prop="zhizuoliucheng">
				<el-input
					type="textarea"
					:rows="8"
					placeholder="制作流程"
					v-model="ruleForm.zhizuoliucheng">
					</el-input>
			</el-form-item>
			<el-form-item class="add-item" label="食材搭配" prop="shicaidapei">
				<el-input
					type="textarea"
					:rows="8"
					placeholder="食材搭配"
					v-model="ruleForm.shicaidapei">
					</el-input>
			</el-form-item>
			<el-form-item class="add-item" label="营养信息" prop="yingyangxinxi">
				<editor 
					v-model="ruleForm.yingyangxinxi" 
					class="editor" 
					myQuillEditor="yingyangxinxi"
					action="file/upload">
				</editor>
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
					shipumingcheng : false,
					shipuleixing : false,
					shipufengmian : false,
					nengliang : false,
					danbaizhi : false,
					zhifang : false,
					tanshuihuahewu : false,
					zhizuoliucheng : false,
					shicaidapei : false,
					yingyangxinxi : false,
					zhanghao : false,
					xingming : false,
					clicktime : false,
					clicknum : false,
					discussnum : false,
					totalscore : false,
					storeupnum : false,
				},
				type: '',
				userTableName: localStorage.getItem('UserTableName'),
				ruleForm: {
					shipumingcheng: '',
					shipuleixing: '',
					shipufengmian: '',
					nengliang: '',
					danbaizhi: '',
					zhifang: '',
					tanshuihuahewu: '',
					zhizuoliucheng: '',
					shicaidapei: '',
					yingyangxinxi: '',
					zhanghao: '',
					xingming: '',
					clicktime: '',
					clicknum: '',
					discussnum: '',
					totalscore: '',
					storeupnum: '',
				},
				shipuleixingOptions: [],


				rules: {
					shipumingcheng: [
					],
					shipuleixing: [
					],
					shipufengmian: [
					],
					nengliang: [
					],
					danbaizhi: [
					],
					zhifang: [
					],
					tanshuihuahewu: [
					],
					zhizuoliucheng: [
					],
					shicaidapei: [
					],
					yingyangxinxi: [
					],
					zhanghao: [
					],
					xingming: [
					],
					clicktime: [
					],
					clicknum: [
						{ validator: this.$validate.isIntNumer, trigger: 'blur' },
					],
					discussnum: [
						{ validator: this.$validate.isIntNumer, trigger: 'blur' },
					],
					totalscore: [
						{ validator: this.$validate.isNumber, trigger: 'blur' },
					],
					storeupnum: [
						{ validator: this.$validate.isIntNumer, trigger: 'blur' },
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
						if(o=='shipumingcheng'){
							this.ruleForm.shipumingcheng = obj[o];
							this.ro.shipumingcheng = true;
							continue;
						}
						if(o=='shipuleixing'){
							this.ruleForm.shipuleixing = obj[o];
							this.ro.shipuleixing = true;
							continue;
						}
						if(o=='shipufengmian'){
							this.ruleForm.shipufengmian = obj[o]?obj[o].split(",")[0]:'';
							this.ro.shipufengmian = true;
							continue;
						}
						if(o=='nengliang'){
							this.ruleForm.nengliang = obj[o];
							this.ro.nengliang = true;
							continue;
						}
						if(o=='danbaizhi'){
							this.ruleForm.danbaizhi = obj[o];
							this.ro.danbaizhi = true;
							continue;
						}
						if(o=='zhifang'){
							this.ruleForm.zhifang = obj[o];
							this.ro.zhifang = true;
							continue;
						}
						if(o=='tanshuihuahewu'){
							this.ruleForm.tanshuihuahewu = obj[o];
							this.ro.tanshuihuahewu = true;
							continue;
						}
						if(o=='zhizuoliucheng'){
							this.ruleForm.zhizuoliucheng = obj[o];
							this.ro.zhizuoliucheng = true;
							continue;
						}
						if(o=='shicaidapei'){
							this.ruleForm.shicaidapei = obj[o];
							this.ro.shicaidapei = true;
							continue;
						}
						if(o=='yingyangxinxi'){
							this.ruleForm.yingyangxinxi = obj[o];
							this.ro.yingyangxinxi = true;
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
						if(o=='clicktime'){
							this.ruleForm.clicktime = obj[o];
							this.ro.clicktime = true;
							continue;
						}
						if(o=='clicknum'){
							this.ruleForm.clicknum = obj[o];
							this.ro.clicknum = true;
							continue;
						}
						if(o=='discussnum'){
							this.ruleForm.discussnum = obj[o];
							this.ro.discussnum = true;
							continue;
						}
						if(o=='totalscore'){
							this.ruleForm.totalscore = obj[o];
							this.ro.totalscore = true;
							continue;
						}
						if(o=='storeupnum'){
							this.ruleForm.storeupnum = obj[o];
							this.ro.storeupnum = true;
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
						if((json.zhanghao!=''&&json.zhanghao) || json.zhanghao==0){
							this.ruleForm.zhanghao = json.zhanghao;
							this.ro.zhanghao = true;
						}
						if((json.xingming!=''&&json.xingming) || json.xingming==0){
							this.ruleForm.xingming = json.xingming;
							this.ro.xingming = true;
						}
					}
				});
				this.shipuleixingOptions = "早餐,午餐,晚餐,点心".split(',')

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
				this.$http.get(`jiankangshipu/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
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


						await this.$http.post(`jiankangshipu/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(async res => {
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
			shipufengmianUploadChange(fileUrls) {
				this.ruleForm.shipufengmian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
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

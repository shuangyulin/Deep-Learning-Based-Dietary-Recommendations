<template>
	<div class="add-update-preview">
		<el-form
			class="add-update-form"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="180px"
			>
			<el-form-item class="add-item" label="食物名称" prop="shiwumingcheng">
				<el-input v-model="ruleForm.shiwumingcheng" 
					placeholder="食物名称" clearable :disabled=" false  ||ro.shiwumingcheng"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="食物图片" v-if="type!='cross' || (type=='cross' && !ro.shiwutupian)" prop="shiwutupian">
				<file-upload
					tip="点击上传食物图片"
					action="file/upload"
					:limit="3"
					:multiple="true"
					:fileUrls="ruleForm.shiwutupian?ruleForm.shiwutupian:''"
					@change="shiwutupianUploadChange"
					></file-upload>
			</el-form-item>
			<el-form-item class="add-item" v-else label="食物图片" prop="shiwutupian">
				<img v-if="ruleForm.shiwutupian.substring(0,4)=='http'" class="upload-img" v-bind:key="index" :src="ruleForm.shiwutupian.split(',')[0]">
				<img v-else class="upload-img" v-bind:key="index" v-for="(item,index) in ruleForm.shiwutupian.split(',')" :src="baseUrl+item">
			</el-form-item>
			<el-form-item class="add-item" label="烹饪时间" prop="pengrenshijian">
				<el-input v-model="ruleForm.pengrenshijian" 
					placeholder="烹饪时间" clearable :disabled=" false  ||ro.pengrenshijian"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="食材" prop="shicai">
				<el-input v-model="ruleForm.shicai" 
					placeholder="食材" clearable :disabled=" false  ||ro.shicai"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="烹饪方式" prop="pengrenfangshi">
				<el-input v-model="ruleForm.pengrenfangshi" 
					placeholder="烹饪方式" clearable :disabled=" false  ||ro.pengrenfangshi"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="能量" prop="nengliang">
				<el-input-number v-model="ruleForm.nengliang" placeholder="能量" :disabled=" false ||ro.nengliang"></el-input-number>
			</el-form-item>
			<el-form-item class="add-item" label="蛋白质g" prop="danbaizhig">
				<el-input-number v-model="ruleForm.danbaizhig" placeholder="蛋白质g" :disabled=" false ||ro.danbaizhig"></el-input-number>
			</el-form-item>
			<el-form-item class="add-item" label="脂肪g" prop="zhifangg">
				<el-input-number v-model="ruleForm.zhifangg" placeholder="脂肪g" :disabled=" false ||ro.zhifangg"></el-input-number>
			</el-form-item>
			<el-form-item class="add-item" label="钙mg" prop="gaimg">
				<el-input-number v-model="ruleForm.gaimg" placeholder="钙mg" :disabled=" false ||ro.gaimg"></el-input-number>
			</el-form-item>
			<el-form-item class="add-item" label="铁mg" prop="tiemg">
				<el-input-number v-model="ruleForm.tiemg" placeholder="铁mg" :disabled=" false ||ro.tiemg"></el-input-number>
			</el-form-item>
			<el-form-item class="add-item" label="锌mg" prop="xinmg">
				<el-input-number v-model="ruleForm.xinmg" placeholder="锌mg" :disabled=" false ||ro.xinmg"></el-input-number>
			</el-form-item>
			<el-form-item class="add-item" label="碳水化合物g" prop="tanshuihuahewug">
				<el-input-number v-model="ruleForm.tanshuihuahewug" placeholder="碳水化合物g" :disabled=" false ||ro.tanshuihuahewug"></el-input-number>
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
					shiwumingcheng : false,
					shiwutupian : false,
					pengrenshijian : false,
					shicai : false,
					pengrenfangshi : false,
					nengliang : false,
					danbaizhig : false,
					zhifangg : false,
					gaimg : false,
					tiemg : false,
					xinmg : false,
					weishengsu : false,
					tanshuihuahewug : false,
					thumbsupnum : false,
					crazilynum : false,
					clicknum : false,
					discussnum : false,
					totalscore : false,
					storeupnum : false,
				},
				type: '',
				userTableName: localStorage.getItem('UserTableName'),
				ruleForm: {
					shiwumingcheng: '',
					shiwutupian: '',
					pengrenshijian: '',
					shicai: '',
					pengrenfangshi: '',
					nengliang: '',
					danbaizhig: '',
					zhifangg: '',
					gaimg: '',
					tiemg: '',
					xinmg: '',
					weishengsu: '',
					tanshuihuahewug: '',
					thumbsupnum: '',
					crazilynum: '',
					clicknum: '',
					discussnum: '',
					totalscore: '',
					storeupnum: '',
				},


				rules: {
					shiwumingcheng: [
						{ required: true, message: '食物名称不能为空', trigger: 'blur' },
					],
					shiwutupian: [
					],
					pengrenshijian: [
					],
					shicai: [
					],
					pengrenfangshi: [
					],
					nengliang: [
						{ validator: this.$validate.isNumber, trigger: 'blur' },
					],
					danbaizhig: [
						{ validator: this.$validate.isNumber, trigger: 'blur' },
					],
					zhifangg: [
						{ validator: this.$validate.isNumber, trigger: 'blur' },
					],
					gaimg: [
						{ validator: this.$validate.isNumber, trigger: 'blur' },
					],
					tiemg: [
						{ validator: this.$validate.isNumber, trigger: 'blur' },
					],
					xinmg: [
						{ validator: this.$validate.isNumber, trigger: 'blur' },
					],
					weishengsu: [
					],
					tanshuihuahewug: [
						{ validator: this.$validate.isNumber, trigger: 'blur' },
					],
					thumbsupnum: [
						{ validator: this.$validate.isIntNumer, trigger: 'blur' },
					],
					crazilynum: [
						{ validator: this.$validate.isIntNumer, trigger: 'blur' },
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
						if(o=='shiwumingcheng'){
							this.ruleForm.shiwumingcheng = obj[o];
							this.ro.shiwumingcheng = true;
							continue;
						}
						if(o=='shiwutupian'){
							this.ruleForm.shiwutupian = obj[o]?obj[o].split(",")[0]:'';
							this.ro.shiwutupian = true;
							continue;
						}
						if(o=='pengrenshijian'){
							this.ruleForm.pengrenshijian = obj[o];
							this.ro.pengrenshijian = true;
							continue;
						}
						if(o=='shicai'){
							this.ruleForm.shicai = obj[o];
							this.ro.shicai = true;
							continue;
						}
						if(o=='pengrenfangshi'){
							this.ruleForm.pengrenfangshi = obj[o];
							this.ro.pengrenfangshi = true;
							continue;
						}
						if(o=='nengliang'){
							this.ruleForm.nengliang = obj[o];
							this.ro.nengliang = true;
							continue;
						}
						if(o=='danbaizhig'){
							this.ruleForm.danbaizhig = obj[o];
							this.ro.danbaizhig = true;
							continue;
						}
						if(o=='zhifangg'){
							this.ruleForm.zhifangg = obj[o];
							this.ro.zhifangg = true;
							continue;
						}
						if(o=='gaimg'){
							this.ruleForm.gaimg = obj[o];
							this.ro.gaimg = true;
							continue;
						}
						if(o=='tiemg'){
							this.ruleForm.tiemg = obj[o];
							this.ro.tiemg = true;
							continue;
						}
						if(o=='xinmg'){
							this.ruleForm.xinmg = obj[o];
							this.ro.xinmg = true;
							continue;
						}
						if(o=='weishengsu'){
							this.ruleForm.weishengsu = obj[o];
							this.ro.weishengsu = true;
							continue;
						}
						if(o=='tanshuihuahewug'){
							this.ruleForm.tanshuihuahewug = obj[o];
							this.ro.tanshuihuahewug = true;
							continue;
						}
						if(o=='thumbsupnum'){
							this.ruleForm.thumbsupnum = obj[o];
							this.ro.thumbsupnum = true;
							continue;
						}
						if(o=='crazilynum'){
							this.ruleForm.crazilynum = obj[o];
							this.ro.crazilynum = true;
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
					}
				});

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
				this.$http.get(`shiwuxinxi/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
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


						await this.$http.post(`shiwuxinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(async res => {
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
			shiwutupianUploadChange(fileUrls) {
				this.ruleForm.shiwutupian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
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

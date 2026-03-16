<template>
	<div class="add-update-preview">
		<el-form
			class="add-update-form"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="180px"
			>
			<el-form-item class="add-item" label="食物名称" prop="foodnames">
				<el-input v-model="ruleForm.foodnames" 
					placeholder="食物名称" clearable :disabled=" false  ||ro.foodnames"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="食物类别" prop="foodcategory">
				<el-input v-model="ruleForm.foodcategory" 
					placeholder="食物类别" clearable :disabled=" false  ||ro.foodcategory"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="食谱步骤" prop="recipesteps">
				<el-input v-model="ruleForm.recipesteps" 
					placeholder="食谱步骤" clearable :disabled=" false  ||ro.recipesteps"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="所需食材" prop="requiredingredients">
				<el-input v-model="ruleForm.requiredingredients" 
					placeholder="所需食材" clearable :disabled=" false  ||ro.requiredingredients"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="所需调料" prop="requiredseasonings">
				<el-input v-model="ruleForm.requiredseasonings" 
					placeholder="所需调料" clearable :disabled=" false  ||ro.requiredseasonings"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="烹饪时间" prop="cooking">
				<el-input v-model="ruleForm.cooking" 
					placeholder="烹饪时间" clearable :disabled=" false  ||ro.cooking"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="烹饪难度" prop="cookingdifficulty">
				<el-input v-model="ruleForm.cookingdifficulty" 
					placeholder="烹饪难度" clearable :disabled=" false  ||ro.cookingdifficulty"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="热量（每100克）" prop="heat">
				<el-input-number v-model="ruleForm.heat" placeholder="热量（每100克）" :disabled=" false ||ro.heat"></el-input-number>
			</el-form-item>
			<el-form-item class="add-item" label="蛋白质（每100克）" prop="protein">
				<el-input-number v-model="ruleForm.protein" placeholder="蛋白质（每100克）" :disabled=" false ||ro.protein"></el-input-number>
			</el-form-item>
			<el-form-item class="add-item" label="脂肪（每100克）" prop="fat">
				<el-input-number v-model="ruleForm.fat" placeholder="脂肪（每100克）" :disabled=" false ||ro.fat"></el-input-number>
			</el-form-item>
			<el-form-item class="add-item" label="碳水化合物（每100克）" prop="carbohydrate">
				<el-input-number v-model="ruleForm.carbohydrate" placeholder="碳水化合物（每100克）" :disabled=" false ||ro.carbohydrate"></el-input-number>
			</el-form-item>
			<el-form-item class="add-item" label="维生素（每100克）" prop="vitamin">
				<el-input v-model="ruleForm.vitamin" 
					placeholder="维生素（每100克）" clearable :disabled=" false  ||ro.vitamin"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="矿物质（每100克）" prop="mineral">
				<el-input v-model="ruleForm.mineral" 
					placeholder="矿物质（每100克）" clearable :disabled=" false  ||ro.mineral"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="用户" prop="user">
				<el-input v-model="ruleForm.user" 
					placeholder="用户" clearable :disabled=" false  ||ro.user"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="用户评论" prop="usercomments">
				<el-input v-model="ruleForm.usercomments" 
					placeholder="用户评论" clearable :disabled=" false  ||ro.usercomments"></el-input>
			</el-form-item>
			<el-form-item class="add-item" label="用户评分" prop="userrating">
				<el-input-number v-model="ruleForm.userrating" placeholder="用户评分" :disabled=" false ||ro.userrating"></el-input-number>
			</el-form-item>
			<el-form-item class="add-item" label="关键词" prop="keyword">
				<el-input v-model="ruleForm.keyword" 
					placeholder="关键词" clearable :disabled=" false  ||ro.keyword"></el-input>
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
					foodnames : false,
					foodcategory : false,
					recipesteps : false,
					requiredingredients : false,
					requiredseasonings : false,
					cooking : false,
					cookingdifficulty : false,
					heat : false,
					protein : false,
					fat : false,
					carbohydrate : false,
					vitamin : false,
					mineral : false,
					user : false,
					usercomments : false,
					userrating : false,
					keyword : false,
				},
				type: '',
				userTableName: localStorage.getItem('UserTableName'),
				ruleForm: {
					foodnames: '',
					foodcategory: '',
					recipesteps: '',
					requiredingredients: '',
					requiredseasonings: '',
					cooking: '',
					cookingdifficulty: '',
					heat: '',
					protein: '',
					fat: '',
					carbohydrate: '',
					vitamin: '',
					mineral: '',
					user: '',
					usercomments: '',
					userrating: '',
					keyword: '',
				},


				rules: {
					foodnames: [
						{ required: true, message: '食物名称不能为空', trigger: 'blur' },
					],
					foodcategory: [
						{ required: true, message: '食物类别不能为空', trigger: 'blur' },
					],
					recipesteps: [
					],
					requiredingredients: [
					],
					requiredseasonings: [
					],
					cooking: [
					],
					cookingdifficulty: [
					],
					heat: [
						{ validator: this.$validate.isNumber, trigger: 'blur' },
					],
					protein: [
						{ validator: this.$validate.isNumber, trigger: 'blur' },
					],
					fat: [
						{ validator: this.$validate.isNumber, trigger: 'blur' },
					],
					carbohydrate: [
						{ validator: this.$validate.isNumber, trigger: 'blur' },
					],
					vitamin: [
					],
					mineral: [
					],
					user: [
					],
					usercomments: [
					],
					userrating: [
						{ validator: this.$validate.isNumber, trigger: 'blur' },
					],
					keyword: [
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
						if(o=='foodnames'){
							this.ruleForm.foodnames = obj[o];
							this.ro.foodnames = true;
							continue;
						}
						if(o=='foodcategory'){
							this.ruleForm.foodcategory = obj[o];
							this.ro.foodcategory = true;
							continue;
						}
						if(o=='recipesteps'){
							this.ruleForm.recipesteps = obj[o];
							this.ro.recipesteps = true;
							continue;
						}
						if(o=='requiredingredients'){
							this.ruleForm.requiredingredients = obj[o];
							this.ro.requiredingredients = true;
							continue;
						}
						if(o=='requiredseasonings'){
							this.ruleForm.requiredseasonings = obj[o];
							this.ro.requiredseasonings = true;
							continue;
						}
						if(o=='cooking'){
							this.ruleForm.cooking = obj[o];
							this.ro.cooking = true;
							continue;
						}
						if(o=='cookingdifficulty'){
							this.ruleForm.cookingdifficulty = obj[o];
							this.ro.cookingdifficulty = true;
							continue;
						}
						if(o=='heat'){
							this.ruleForm.heat = obj[o];
							this.ro.heat = true;
							continue;
						}
						if(o=='protein'){
							this.ruleForm.protein = obj[o];
							this.ro.protein = true;
							continue;
						}
						if(o=='fat'){
							this.ruleForm.fat = obj[o];
							this.ro.fat = true;
							continue;
						}
						if(o=='carbohydrate'){
							this.ruleForm.carbohydrate = obj[o];
							this.ro.carbohydrate = true;
							continue;
						}
						if(o=='vitamin'){
							this.ruleForm.vitamin = obj[o];
							this.ro.vitamin = true;
							continue;
						}
						if(o=='mineral'){
							this.ruleForm.mineral = obj[o];
							this.ro.mineral = true;
							continue;
						}
						if(o=='user'){
							this.ruleForm.user = obj[o];
							this.ro.user = true;
							continue;
						}
						if(o=='usercomments'){
							this.ruleForm.usercomments = obj[o];
							this.ro.usercomments = true;
							continue;
						}
						if(o=='userrating'){
							this.ruleForm.userrating = obj[o];
							this.ro.userrating = true;
							continue;
						}
						if(o=='keyword'){
							this.ruleForm.keyword = obj[o];
							this.ro.keyword = true;
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
				this.$http.get(`dietplan/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
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


						await this.$http.post(`dietplan/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(async res => {
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

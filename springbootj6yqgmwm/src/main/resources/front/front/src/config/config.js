export default {
	baseUrl: 'http://localhost:8080/springbootj6yqgmwm/',
	name: '/springbootj6yqgmwm',
	indexNav: [
		{
			name: '食物信息',
			url: '/index/shiwuxinxi',
		},
		{
			name: '饮食计划',
			url: '/index/yinshijihua',
		},
		{
			name: '健康食谱',
			url: '/index/jiankangshipu',
		},
		{
			name: '排行榜',
			url: '/index/paixingbang',
		},
		{
			name: '科普知识',
			url: '/index/news'
		},
	],
	cateList: [
		{
			name: '科普知识',
			refTable: 'newstype',
			refColumn: 'typename',
		},
	]
}

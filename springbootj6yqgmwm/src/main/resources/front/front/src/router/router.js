import VueRouter from 'vue-router'
//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import shiwuxinxiList from '../pages/shiwuxinxi/list'
import shiwuxinxiDetail from '../pages/shiwuxinxi/detail'
import shiwuxinxiAdd from '../pages/shiwuxinxi/add'
import yinshijihuaList from '../pages/yinshijihua/list'
import yinshijihuaDetail from '../pages/yinshijihua/detail'
import yinshijihuaAdd from '../pages/yinshijihua/add'
import jiankangshujuList from '../pages/jiankangshuju/list'
import jiankangshujuDetail from '../pages/jiankangshuju/detail'
import jiankangshujuAdd from '../pages/jiankangshuju/add'
import yingyangjianyiList from '../pages/yingyangjianyi/list'
import yingyangjianyiDetail from '../pages/yingyangjianyi/detail'
import yingyangjianyiAdd from '../pages/yingyangjianyi/add'
import jiankangmubiaoList from '../pages/jiankangmubiao/list'
import jiankangmubiaoDetail from '../pages/jiankangmubiao/detail'
import jiankangmubiaoAdd from '../pages/jiankangmubiao/add'
import jiankangshipuList from '../pages/jiankangshipu/list'
import jiankangshipuDetail from '../pages/jiankangshipu/detail'
import jiankangshipuAdd from '../pages/jiankangshipu/add'
import paixingbangList from '../pages/paixingbang/list'
import paixingbangDetail from '../pages/paixingbang/detail'
import paixingbangAdd from '../pages/paixingbang/add'
import dietplanList from '../pages/dietplan/list'
import dietplanDetail from '../pages/dietplan/detail'
import dietplanAdd from '../pages/dietplan/add'
import dietplanforecastList from '../pages/dietplanforecast/list'
import dietplanforecastDetail from '../pages/dietplanforecast/detail'
import dietplanforecastAdd from '../pages/dietplanforecast/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import discussshiwuxinxiList from '../pages/discussshiwuxinxi/list'
import discussshiwuxinxiDetail from '../pages/discussshiwuxinxi/detail'
import discussshiwuxinxiAdd from '../pages/discussshiwuxinxi/add'
import discussyinshijihuaList from '../pages/discussyinshijihua/list'
import discussyinshijihuaDetail from '../pages/discussyinshijihua/detail'
import discussyinshijihuaAdd from '../pages/discussyinshijihua/add'
import discussjiankangshipuList from '../pages/discussjiankangshipu/list'
import discussjiankangshipuDetail from '../pages/discussjiankangshipu/detail'
import discussjiankangshipuAdd from '../pages/discussjiankangshipu/add'
import discusspaixingbangList from '../pages/discusspaixingbang/list'
import discusspaixingbangDetail from '../pages/discusspaixingbang/detail'
import discusspaixingbangAdd from '../pages/discusspaixingbang/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'shiwuxinxi',
					component: shiwuxinxiList
				},
				{
					path: 'shiwuxinxiDetail',
					component: shiwuxinxiDetail
				},
				{
					path: 'shiwuxinxiAdd',
					component: shiwuxinxiAdd
				},
				{
					path: 'yinshijihua',
					component: yinshijihuaList
				},
				{
					path: 'yinshijihuaDetail',
					component: yinshijihuaDetail
				},
				{
					path: 'yinshijihuaAdd',
					component: yinshijihuaAdd
				},
				{
					path: 'jiankangshuju',
					component: jiankangshujuList
				},
				{
					path: 'jiankangshujuDetail',
					component: jiankangshujuDetail
				},
				{
					path: 'jiankangshujuAdd',
					component: jiankangshujuAdd
				},
				{
					path: 'yingyangjianyi',
					component: yingyangjianyiList
				},
				{
					path: 'yingyangjianyiDetail',
					component: yingyangjianyiDetail
				},
				{
					path: 'yingyangjianyiAdd',
					component: yingyangjianyiAdd
				},
				{
					path: 'jiankangmubiao',
					component: jiankangmubiaoList
				},
				{
					path: 'jiankangmubiaoDetail',
					component: jiankangmubiaoDetail
				},
				{
					path: 'jiankangmubiaoAdd',
					component: jiankangmubiaoAdd
				},
				{
					path: 'jiankangshipu',
					component: jiankangshipuList
				},
				{
					path: 'jiankangshipuDetail',
					component: jiankangshipuDetail
				},
				{
					path: 'jiankangshipuAdd',
					component: jiankangshipuAdd
				},
				{
					path: 'paixingbang',
					component: paixingbangList
				},
				{
					path: 'paixingbangDetail',
					component: paixingbangDetail
				},
				{
					path: 'paixingbangAdd',
					component: paixingbangAdd
				},
				{
					path: 'dietplan',
					component: dietplanList
				},
				{
					path: 'dietplanDetail',
					component: dietplanDetail
				},
				{
					path: 'dietplanAdd',
					component: dietplanAdd
				},
				{
					path: 'dietplanforecast',
					component: dietplanforecastList
				},
				{
					path: 'dietplanforecastDetail',
					component: dietplanforecastDetail
				},
				{
					path: 'dietplanforecastAdd',
					component: dietplanforecastAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'discussshiwuxinxi',
					component: discussshiwuxinxiList
				},
				{
					path: 'discussshiwuxinxiDetail',
					component: discussshiwuxinxiDetail
				},
				{
					path: 'discussshiwuxinxiAdd',
					component: discussshiwuxinxiAdd
				},
				{
					path: 'discussyinshijihua',
					component: discussyinshijihuaList
				},
				{
					path: 'discussyinshijihuaDetail',
					component: discussyinshijihuaDetail
				},
				{
					path: 'discussyinshijihuaAdd',
					component: discussyinshijihuaAdd
				},
				{
					path: 'discussjiankangshipu',
					component: discussjiankangshipuList
				},
				{
					path: 'discussjiankangshipuDetail',
					component: discussjiankangshipuDetail
				},
				{
					path: 'discussjiankangshipuAdd',
					component: discussjiankangshipuAdd
				},
				{
					path: 'discusspaixingbang',
					component: discusspaixingbangList
				},
				{
					path: 'discusspaixingbangDetail',
					component: discusspaixingbangDetail
				},
				{
					path: 'discusspaixingbangAdd',
					component: discusspaixingbangAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})

package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussjiankangshipuDao;
import com.entity.DiscussjiankangshipuEntity;
import com.service.DiscussjiankangshipuService;
import com.entity.vo.DiscussjiankangshipuVO;
import com.entity.view.DiscussjiankangshipuView;

@Service("discussjiankangshipuService")
public class DiscussjiankangshipuServiceImpl extends ServiceImpl<DiscussjiankangshipuDao, DiscussjiankangshipuEntity> implements DiscussjiankangshipuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiankangshipuEntity> page = this.selectPage(
                new Query<DiscussjiankangshipuEntity>(params).getPage(),
                new EntityWrapper<DiscussjiankangshipuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiankangshipuEntity> wrapper) {
		  Page<DiscussjiankangshipuView> page =new Query<DiscussjiankangshipuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussjiankangshipuVO> selectListVO(Wrapper<DiscussjiankangshipuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiankangshipuVO selectVO(Wrapper<DiscussjiankangshipuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiankangshipuView> selectListView(Wrapper<DiscussjiankangshipuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiankangshipuView selectView(Wrapper<DiscussjiankangshipuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

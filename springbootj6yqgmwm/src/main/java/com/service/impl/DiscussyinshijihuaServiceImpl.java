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


import com.dao.DiscussyinshijihuaDao;
import com.entity.DiscussyinshijihuaEntity;
import com.service.DiscussyinshijihuaService;
import com.entity.vo.DiscussyinshijihuaVO;
import com.entity.view.DiscussyinshijihuaView;

@Service("discussyinshijihuaService")
public class DiscussyinshijihuaServiceImpl extends ServiceImpl<DiscussyinshijihuaDao, DiscussyinshijihuaEntity> implements DiscussyinshijihuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyinshijihuaEntity> page = this.selectPage(
                new Query<DiscussyinshijihuaEntity>(params).getPage(),
                new EntityWrapper<DiscussyinshijihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyinshijihuaEntity> wrapper) {
		  Page<DiscussyinshijihuaView> page =new Query<DiscussyinshijihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussyinshijihuaVO> selectListVO(Wrapper<DiscussyinshijihuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyinshijihuaVO selectVO(Wrapper<DiscussyinshijihuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyinshijihuaView> selectListView(Wrapper<DiscussyinshijihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyinshijihuaView selectView(Wrapper<DiscussyinshijihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

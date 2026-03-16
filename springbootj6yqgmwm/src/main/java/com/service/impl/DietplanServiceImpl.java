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


import com.dao.DietplanDao;
import com.entity.DietplanEntity;
import com.service.DietplanService;
import com.entity.vo.DietplanVO;
import com.entity.view.DietplanView;

@Service("dietplanService")
public class DietplanServiceImpl extends ServiceImpl<DietplanDao, DietplanEntity> implements DietplanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DietplanEntity> page = this.selectPage(
                new Query<DietplanEntity>(params).getPage(),
                new EntityWrapper<DietplanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DietplanEntity> wrapper) {
		  Page<DietplanView> page =new Query<DietplanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DietplanVO> selectListVO(Wrapper<DietplanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DietplanVO selectVO(Wrapper<DietplanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DietplanView> selectListView(Wrapper<DietplanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DietplanView selectView(Wrapper<DietplanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<DietplanEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<DietplanEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<DietplanEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> heatSectionStat(Map<String, Object> params, Wrapper<DietplanEntity> wrapper) {
        return baseMapper.heatSectionStat(params, wrapper);
    }
    @Override
    public List<Map<String, Object>> proteinSectionStat(Map<String, Object> params, Wrapper<DietplanEntity> wrapper) {
        return baseMapper.proteinSectionStat(params, wrapper);
    }
    @Override
    public List<Map<String, Object>> fatSectionStat(Map<String, Object> params, Wrapper<DietplanEntity> wrapper) {
        return baseMapper.fatSectionStat(params, wrapper);
    }
    @Override
    public List<Map<String, Object>> carbohydrateSectionStat(Map<String, Object> params, Wrapper<DietplanEntity> wrapper) {
        return baseMapper.carbohydrateSectionStat(params, wrapper);
    }



}

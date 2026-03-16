package com.dao;

import com.entity.YingyangjianyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingyangjianyiVO;
import com.entity.view.YingyangjianyiView;


/**
 * 营养建议
 * 
 * @author 
 * @email 
 * @date 2025-03-21 08:53:18
 */
public interface YingyangjianyiDao extends BaseMapper<YingyangjianyiEntity> {
	
	List<YingyangjianyiVO> selectListVO(@Param("ew") Wrapper<YingyangjianyiEntity> wrapper);
	
	YingyangjianyiVO selectVO(@Param("ew") Wrapper<YingyangjianyiEntity> wrapper);
	
	List<YingyangjianyiView> selectListView(@Param("ew") Wrapper<YingyangjianyiEntity> wrapper);

	List<YingyangjianyiView> selectListView(Pagination page,@Param("ew") Wrapper<YingyangjianyiEntity> wrapper);

	
	YingyangjianyiView selectView(@Param("ew") Wrapper<YingyangjianyiEntity> wrapper);
	

}

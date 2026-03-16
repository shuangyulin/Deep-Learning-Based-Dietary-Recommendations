package com.dao;

import com.entity.DietplanforecastEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DietplanforecastVO;
import com.entity.view.DietplanforecastView;


/**
 * 食物类别预测
 * 
 * @author 
 * @email 
 * @date 2025-03-21 08:53:19
 */
public interface DietplanforecastDao extends BaseMapper<DietplanforecastEntity> {
	
	List<DietplanforecastVO> selectListVO(@Param("ew") Wrapper<DietplanforecastEntity> wrapper);
	
	DietplanforecastVO selectVO(@Param("ew") Wrapper<DietplanforecastEntity> wrapper);
	
	List<DietplanforecastView> selectListView(@Param("ew") Wrapper<DietplanforecastEntity> wrapper);

	List<DietplanforecastView> selectListView(Pagination page,@Param("ew") Wrapper<DietplanforecastEntity> wrapper);

	
	DietplanforecastView selectView(@Param("ew") Wrapper<DietplanforecastEntity> wrapper);
	

}

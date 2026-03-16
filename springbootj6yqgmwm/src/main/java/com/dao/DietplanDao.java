package com.dao;

import com.entity.DietplanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DietplanVO;
import com.entity.view.DietplanView;


/**
 * 饮食计划数据
 * 
 * @author 
 * @email 
 * @date 2025-03-21 08:53:19
 */
public interface DietplanDao extends BaseMapper<DietplanEntity> {
	
	List<DietplanVO> selectListVO(@Param("ew") Wrapper<DietplanEntity> wrapper);
	
	DietplanVO selectVO(@Param("ew") Wrapper<DietplanEntity> wrapper);
	
	List<DietplanView> selectListView(@Param("ew") Wrapper<DietplanEntity> wrapper);

	List<DietplanView> selectListView(Pagination page,@Param("ew") Wrapper<DietplanEntity> wrapper);

	
	DietplanView selectView(@Param("ew") Wrapper<DietplanEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DietplanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DietplanEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DietplanEntity> wrapper);

    List<Map<String, Object>> heatSectionStat(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DietplanEntity> wrapper);
    List<Map<String, Object>> proteinSectionStat(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DietplanEntity> wrapper);
    List<Map<String, Object>> fatSectionStat(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DietplanEntity> wrapper);
    List<Map<String, Object>> carbohydrateSectionStat(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DietplanEntity> wrapper);


}

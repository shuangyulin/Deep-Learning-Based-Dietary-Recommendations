package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DietplanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DietplanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DietplanView;


/**
 * 饮食计划数据
 *
 * @author 
 * @email 
 * @date 2025-03-21 08:53:19
 */
public interface DietplanService extends IService<DietplanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DietplanVO> selectListVO(Wrapper<DietplanEntity> wrapper);
   	
   	DietplanVO selectVO(@Param("ew") Wrapper<DietplanEntity> wrapper);
   	
   	List<DietplanView> selectListView(Wrapper<DietplanEntity> wrapper);
   	
   	DietplanView selectView(@Param("ew") Wrapper<DietplanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DietplanEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<DietplanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<DietplanEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<DietplanEntity> wrapper);

    List<Map<String, Object>> heatSectionStat(Map<String, Object> params,Wrapper<DietplanEntity> wrapper);
    List<Map<String, Object>> proteinSectionStat(Map<String, Object> params,Wrapper<DietplanEntity> wrapper);
    List<Map<String, Object>> fatSectionStat(Map<String, Object> params,Wrapper<DietplanEntity> wrapper);
    List<Map<String, Object>> carbohydrateSectionStat(Map<String, Object> params,Wrapper<DietplanEntity> wrapper);


}


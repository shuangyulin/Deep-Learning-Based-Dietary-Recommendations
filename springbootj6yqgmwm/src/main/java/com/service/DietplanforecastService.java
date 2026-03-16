package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DietplanforecastEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DietplanforecastVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DietplanforecastView;


/**
 * 食物类别预测
 *
 * @author 
 * @email 
 * @date 2025-03-21 08:53:19
 */
public interface DietplanforecastService extends IService<DietplanforecastEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DietplanforecastVO> selectListVO(Wrapper<DietplanforecastEntity> wrapper);
   	
   	DietplanforecastVO selectVO(@Param("ew") Wrapper<DietplanforecastEntity> wrapper);
   	
   	List<DietplanforecastView> selectListView(Wrapper<DietplanforecastEntity> wrapper);
   	
   	DietplanforecastView selectView(@Param("ew") Wrapper<DietplanforecastEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DietplanforecastEntity> wrapper);

   	

}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangshipuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangshipuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangshipuView;


/**
 * 健康食谱
 *
 * @author 
 * @email 
 * @date 2025-03-21 08:53:19
 */
public interface JiankangshipuService extends IService<JiankangshipuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangshipuVO> selectListVO(Wrapper<JiankangshipuEntity> wrapper);
   	
   	JiankangshipuVO selectVO(@Param("ew") Wrapper<JiankangshipuEntity> wrapper);
   	
   	List<JiankangshipuView> selectListView(Wrapper<JiankangshipuEntity> wrapper);
   	
   	JiankangshipuView selectView(@Param("ew") Wrapper<JiankangshipuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangshipuEntity> wrapper);

   	

}


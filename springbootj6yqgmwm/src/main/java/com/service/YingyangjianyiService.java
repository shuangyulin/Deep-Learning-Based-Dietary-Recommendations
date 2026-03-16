package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingyangjianyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingyangjianyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingyangjianyiView;


/**
 * 营养建议
 *
 * @author 
 * @email 
 * @date 2025-03-21 08:53:18
 */
public interface YingyangjianyiService extends IService<YingyangjianyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingyangjianyiVO> selectListVO(Wrapper<YingyangjianyiEntity> wrapper);
   	
   	YingyangjianyiVO selectVO(@Param("ew") Wrapper<YingyangjianyiEntity> wrapper);
   	
   	List<YingyangjianyiView> selectListView(Wrapper<YingyangjianyiEntity> wrapper);
   	
   	YingyangjianyiView selectView(@Param("ew") Wrapper<YingyangjianyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingyangjianyiEntity> wrapper);

   	

}


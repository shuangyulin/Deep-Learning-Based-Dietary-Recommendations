package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyinshijihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyinshijihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyinshijihuaView;


/**
 * 饮食计划评论表
 *
 * @author 
 * @email 
 * @date 2025-03-21 08:53:20
 */
public interface DiscussyinshijihuaService extends IService<DiscussyinshijihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyinshijihuaVO> selectListVO(Wrapper<DiscussyinshijihuaEntity> wrapper);
   	
   	DiscussyinshijihuaVO selectVO(@Param("ew") Wrapper<DiscussyinshijihuaEntity> wrapper);
   	
   	List<DiscussyinshijihuaView> selectListView(Wrapper<DiscussyinshijihuaEntity> wrapper);
   	
   	DiscussyinshijihuaView selectView(@Param("ew") Wrapper<DiscussyinshijihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyinshijihuaEntity> wrapper);

   	

}


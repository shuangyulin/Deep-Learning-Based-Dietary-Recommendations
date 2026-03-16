package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiankangshipuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiankangshipuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiankangshipuView;


/**
 * 健康食谱评论表
 *
 * @author 
 * @email 
 * @date 2025-03-21 08:53:20
 */
public interface DiscussjiankangshipuService extends IService<DiscussjiankangshipuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiankangshipuVO> selectListVO(Wrapper<DiscussjiankangshipuEntity> wrapper);
   	
   	DiscussjiankangshipuVO selectVO(@Param("ew") Wrapper<DiscussjiankangshipuEntity> wrapper);
   	
   	List<DiscussjiankangshipuView> selectListView(Wrapper<DiscussjiankangshipuEntity> wrapper);
   	
   	DiscussjiankangshipuView selectView(@Param("ew") Wrapper<DiscussjiankangshipuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiankangshipuEntity> wrapper);

   	

}


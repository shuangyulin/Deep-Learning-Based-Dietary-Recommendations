package com.dao;

import com.entity.DiscussjiankangshipuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiankangshipuVO;
import com.entity.view.DiscussjiankangshipuView;


/**
 * 健康食谱评论表
 * 
 * @author 
 * @email 
 * @date 2025-03-21 08:53:20
 */
public interface DiscussjiankangshipuDao extends BaseMapper<DiscussjiankangshipuEntity> {
	
	List<DiscussjiankangshipuVO> selectListVO(@Param("ew") Wrapper<DiscussjiankangshipuEntity> wrapper);
	
	DiscussjiankangshipuVO selectVO(@Param("ew") Wrapper<DiscussjiankangshipuEntity> wrapper);
	
	List<DiscussjiankangshipuView> selectListView(@Param("ew") Wrapper<DiscussjiankangshipuEntity> wrapper);

	List<DiscussjiankangshipuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiankangshipuEntity> wrapper);

	
	DiscussjiankangshipuView selectView(@Param("ew") Wrapper<DiscussjiankangshipuEntity> wrapper);
	

}

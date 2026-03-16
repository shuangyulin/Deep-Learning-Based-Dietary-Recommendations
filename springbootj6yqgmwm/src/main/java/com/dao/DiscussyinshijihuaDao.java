package com.dao;

import com.entity.DiscussyinshijihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyinshijihuaVO;
import com.entity.view.DiscussyinshijihuaView;


/**
 * 饮食计划评论表
 * 
 * @author 
 * @email 
 * @date 2025-03-21 08:53:20
 */
public interface DiscussyinshijihuaDao extends BaseMapper<DiscussyinshijihuaEntity> {
	
	List<DiscussyinshijihuaVO> selectListVO(@Param("ew") Wrapper<DiscussyinshijihuaEntity> wrapper);
	
	DiscussyinshijihuaVO selectVO(@Param("ew") Wrapper<DiscussyinshijihuaEntity> wrapper);
	
	List<DiscussyinshijihuaView> selectListView(@Param("ew") Wrapper<DiscussyinshijihuaEntity> wrapper);

	List<DiscussyinshijihuaView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyinshijihuaEntity> wrapper);

	
	DiscussyinshijihuaView selectView(@Param("ew") Wrapper<DiscussyinshijihuaEntity> wrapper);
	

}

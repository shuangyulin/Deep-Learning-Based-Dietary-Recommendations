package com.dao;

import com.entity.JiankangshipuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangshipuVO;
import com.entity.view.JiankangshipuView;


/**
 * 健康食谱
 * 
 * @author 
 * @email 
 * @date 2025-03-21 08:53:19
 */
public interface JiankangshipuDao extends BaseMapper<JiankangshipuEntity> {
	
	List<JiankangshipuVO> selectListVO(@Param("ew") Wrapper<JiankangshipuEntity> wrapper);
	
	JiankangshipuVO selectVO(@Param("ew") Wrapper<JiankangshipuEntity> wrapper);
	
	List<JiankangshipuView> selectListView(@Param("ew") Wrapper<JiankangshipuEntity> wrapper);

	List<JiankangshipuView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangshipuEntity> wrapper);

	
	JiankangshipuView selectView(@Param("ew") Wrapper<JiankangshipuEntity> wrapper);
	

}

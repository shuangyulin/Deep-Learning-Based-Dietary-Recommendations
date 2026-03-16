package com.dao;

import com.entity.YinshijihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YinshijihuaVO;
import com.entity.view.YinshijihuaView;


/**
 * 饮食计划
 * 
 * @author 
 * @email 
 * @date 2025-03-21 08:53:18
 */
public interface YinshijihuaDao extends BaseMapper<YinshijihuaEntity> {
	
	List<YinshijihuaVO> selectListVO(@Param("ew") Wrapper<YinshijihuaEntity> wrapper);
	
	YinshijihuaVO selectVO(@Param("ew") Wrapper<YinshijihuaEntity> wrapper);
	
	List<YinshijihuaView> selectListView(@Param("ew") Wrapper<YinshijihuaEntity> wrapper);

	List<YinshijihuaView> selectListView(Pagination page,@Param("ew") Wrapper<YinshijihuaEntity> wrapper);

	
	YinshijihuaView selectView(@Param("ew") Wrapper<YinshijihuaEntity> wrapper);
	

}

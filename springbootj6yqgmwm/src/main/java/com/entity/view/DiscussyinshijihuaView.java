package com.entity.view;

import com.entity.DiscussyinshijihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 饮食计划评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-03-21 08:53:20
 */
@TableName("discussyinshijihua")
public class DiscussyinshijihuaView  extends DiscussyinshijihuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyinshijihuaView(){
	}
 
 	public DiscussyinshijihuaView(DiscussyinshijihuaEntity discussyinshijihuaEntity){
 	try {
			BeanUtils.copyProperties(this, discussyinshijihuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}

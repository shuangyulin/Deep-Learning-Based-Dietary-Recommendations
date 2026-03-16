package com.entity.view;

import com.entity.DietplanforecastEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 食物类别预测
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-03-21 08:53:19
 */
@TableName("dietplanforecast")
public class DietplanforecastView  extends DietplanforecastEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DietplanforecastView(){
	}
 
 	public DietplanforecastView(DietplanforecastEntity dietplanforecastEntity){
 	try {
			BeanUtils.copyProperties(this, dietplanforecastEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}

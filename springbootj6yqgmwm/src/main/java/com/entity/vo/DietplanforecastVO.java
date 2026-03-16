package com.entity.vo;

import com.entity.DietplanforecastEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 食物类别预测
 * @author 
 * @email 
 * @date 2025-03-21 08:53:19
 */
public class DietplanforecastVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 热量（每100克）
	 */
	
	private Double heat;
		
	/**
	 * 蛋白质（每100克）
	 */
	
	private Double protein;
		
	/**
	 * 脂肪（每100克）
	 */
	
	private Double fat;
		
	/**
	 * 碳水化合物（每100克）
	 */
	
	private Double carbohydrate;
				
	
	/**
	 * 设置：热量（每100克）
	 */
	 
	public void setHeat(Double heat) {
		this.heat = heat;
	}
	
	/**
	 * 获取：热量（每100克）
	 */
	public Double getHeat() {
		return heat;
	}
				
	
	/**
	 * 设置：蛋白质（每100克）
	 */
	 
	public void setProtein(Double protein) {
		this.protein = protein;
	}
	
	/**
	 * 获取：蛋白质（每100克）
	 */
	public Double getProtein() {
		return protein;
	}
				
	
	/**
	 * 设置：脂肪（每100克）
	 */
	 
	public void setFat(Double fat) {
		this.fat = fat;
	}
	
	/**
	 * 获取：脂肪（每100克）
	 */
	public Double getFat() {
		return fat;
	}
				
	
	/**
	 * 设置：碳水化合物（每100克）
	 */
	 
	public void setCarbohydrate(Double carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
	
	/**
	 * 获取：碳水化合物（每100克）
	 */
	public Double getCarbohydrate() {
		return carbohydrate;
	}
			
}

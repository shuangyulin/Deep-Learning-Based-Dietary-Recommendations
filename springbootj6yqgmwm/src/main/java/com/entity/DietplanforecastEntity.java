package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 食物类别预测
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2025-03-21 08:53:19
 */
@TableName("dietplanforecast")
public class DietplanforecastEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DietplanforecastEntity() {
		
	}
	
	public DietplanforecastEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
	private Long id;
	/**
	 * 食物类别
	 */
					
	private String foodcategory;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：食物类别
	 */
	public void setFoodcategory(String foodcategory) {
		this.foodcategory = foodcategory;
	}
	/**
	 * 获取：食物类别
	 */
	public String getFoodcategory() {
		return foodcategory;
	}
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

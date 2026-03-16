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
 * 饮食计划数据
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2025-03-21 08:53:19
 */
@TableName("dietplan")
public class DietplanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DietplanEntity() {
		
	}
	
	public DietplanEntity(T t) {
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
	 * 食物名称
	 */
					
	private String foodnames;
	
	/**
	 * 食物类别
	 */
					
	private String foodcategory;
	
	/**
	 * 食谱步骤
	 */
					
	private String recipesteps;
	
	/**
	 * 所需食材
	 */
					
	private String requiredingredients;
	
	/**
	 * 所需调料
	 */
					
	private String requiredseasonings;
	
	/**
	 * 烹饪时间
	 */
					
	private String cooking;
	
	/**
	 * 烹饪难度
	 */
					
	private String cookingdifficulty;
	
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
	 * 维生素（每100克）
	 */
					
	private String vitamin;
	
	/**
	 * 矿物质（每100克）
	 */
					
	private String mineral;
	
	/**
	 * 用户
	 */
					
	private String user;
	
	/**
	 * 用户评论
	 */
					
	private String usercomments;
	
	/**
	 * 用户评分
	 */
					
	private Double userrating;
	
	/**
	 * 关键词
	 */
					
	private String keyword;
	
	
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
	 * 设置：食物名称
	 */
	public void setFoodnames(String foodnames) {
		this.foodnames = foodnames;
	}
	/**
	 * 获取：食物名称
	 */
	public String getFoodnames() {
		return foodnames;
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
	 * 设置：食谱步骤
	 */
	public void setRecipesteps(String recipesteps) {
		this.recipesteps = recipesteps;
	}
	/**
	 * 获取：食谱步骤
	 */
	public String getRecipesteps() {
		return recipesteps;
	}
	/**
	 * 设置：所需食材
	 */
	public void setRequiredingredients(String requiredingredients) {
		this.requiredingredients = requiredingredients;
	}
	/**
	 * 获取：所需食材
	 */
	public String getRequiredingredients() {
		return requiredingredients;
	}
	/**
	 * 设置：所需调料
	 */
	public void setRequiredseasonings(String requiredseasonings) {
		this.requiredseasonings = requiredseasonings;
	}
	/**
	 * 获取：所需调料
	 */
	public String getRequiredseasonings() {
		return requiredseasonings;
	}
	/**
	 * 设置：烹饪时间
	 */
	public void setCooking(String cooking) {
		this.cooking = cooking;
	}
	/**
	 * 获取：烹饪时间
	 */
	public String getCooking() {
		return cooking;
	}
	/**
	 * 设置：烹饪难度
	 */
	public void setCookingdifficulty(String cookingdifficulty) {
		this.cookingdifficulty = cookingdifficulty;
	}
	/**
	 * 获取：烹饪难度
	 */
	public String getCookingdifficulty() {
		return cookingdifficulty;
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
	/**
	 * 设置：维生素（每100克）
	 */
	public void setVitamin(String vitamin) {
		this.vitamin = vitamin;
	}
	/**
	 * 获取：维生素（每100克）
	 */
	public String getVitamin() {
		return vitamin;
	}
	/**
	 * 设置：矿物质（每100克）
	 */
	public void setMineral(String mineral) {
		this.mineral = mineral;
	}
	/**
	 * 获取：矿物质（每100克）
	 */
	public String getMineral() {
		return mineral;
	}
	/**
	 * 设置：用户
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * 获取：用户
	 */
	public String getUser() {
		return user;
	}
	/**
	 * 设置：用户评论
	 */
	public void setUsercomments(String usercomments) {
		this.usercomments = usercomments;
	}
	/**
	 * 获取：用户评论
	 */
	public String getUsercomments() {
		return usercomments;
	}
	/**
	 * 设置：用户评分
	 */
	public void setUserrating(Double userrating) {
		this.userrating = userrating;
	}
	/**
	 * 获取：用户评分
	 */
	public Double getUserrating() {
		return userrating;
	}
	/**
	 * 设置：关键词
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	/**
	 * 获取：关键词
	 */
	public String getKeyword() {
		return keyword;
	}

}

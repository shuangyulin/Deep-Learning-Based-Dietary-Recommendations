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
 * 排行榜
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2025-03-21 08:53:19
 */
@TableName("paixingbang")
public class PaixingbangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PaixingbangEntity() {
		
	}
	
	public PaixingbangEntity(T t) {
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
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 更新日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date gengxinriqi;
	
	/**
	 * 第一名
	 */
					
	private String diyiming;
	
	/**
	 * 使用次数
	 */
					
	private Integer shiyongcishu;
	
	/**
	 * 链接
	 */
					
	private String lianjie;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
	/**
	 * 评论数
	 */
					
	private Integer discussnum;
	
	/**
	 * 收藏数
	 */
					
	private Integer storeupnum;
	
	
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
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：更新日期
	 */
	public void setGengxinriqi(Date gengxinriqi) {
		this.gengxinriqi = gengxinriqi;
	}
	/**
	 * 获取：更新日期
	 */
	public Date getGengxinriqi() {
		return gengxinriqi;
	}
	/**
	 * 设置：第一名
	 */
	public void setDiyiming(String diyiming) {
		this.diyiming = diyiming;
	}
	/**
	 * 获取：第一名
	 */
	public String getDiyiming() {
		return diyiming;
	}
	/**
	 * 设置：使用次数
	 */
	public void setShiyongcishu(Integer shiyongcishu) {
		this.shiyongcishu = shiyongcishu;
	}
	/**
	 * 获取：使用次数
	 */
	public Integer getShiyongcishu() {
		return shiyongcishu;
	}
	/**
	 * 设置：链接
	 */
	public void setLianjie(String lianjie) {
		this.lianjie = lianjie;
	}
	/**
	 * 获取：链接
	 */
	public String getLianjie() {
		return lianjie;
	}
	/**
	 * 设置：详情
	 */
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
	/**
	 * 设置：评论数
	 */
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
	/**
	 * 设置：收藏数
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}

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
 * 健康目标
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2025-03-21 08:53:18
 */
@TableName("jiankangmubiao")
public class JiankangmubiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangmubiaoEntity() {
		
	}
	
	public JiankangmubiaoEntity(T t) {
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
	 * 健康目标
	 */
					
	private String jiankangmubiao;
	
	/**
	 * 目标内容
	 */
					
	private String mubiaoneirong;
	
	/**
	 * 制定时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date zhidingshijian;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 年龄
	 */
					
	private Integer nianling;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	
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
	 * 设置：健康目标
	 */
	public void setJiankangmubiao(String jiankangmubiao) {
		this.jiankangmubiao = jiankangmubiao;
	}
	/**
	 * 获取：健康目标
	 */
	public String getJiankangmubiao() {
		return jiankangmubiao;
	}
	/**
	 * 设置：目标内容
	 */
	public void setMubiaoneirong(String mubiaoneirong) {
		this.mubiaoneirong = mubiaoneirong;
	}
	/**
	 * 获取：目标内容
	 */
	public String getMubiaoneirong() {
		return mubiaoneirong;
	}
	/**
	 * 设置：制定时间
	 */
	public void setZhidingshijian(Date zhidingshijian) {
		this.zhidingshijian = zhidingshijian;
	}
	/**
	 * 获取：制定时间
	 */
	public Date getZhidingshijian() {
		return zhidingshijian;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}

}

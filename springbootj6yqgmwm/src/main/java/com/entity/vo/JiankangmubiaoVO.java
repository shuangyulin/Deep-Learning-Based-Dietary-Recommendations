package com.entity.vo;

import com.entity.JiankangmubiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康目标
 * @author 
 * @email 
 * @date 2025-03-21 08:53:18
 */
public class JiankangmubiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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

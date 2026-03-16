package com.entity.model;

import com.entity.JiankangshujuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康数据
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2025-03-21 08:53:18
 */
public class JiankangshujuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
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
	 * 体重kg
	 */
	
	private Double tizhongkg;
		
	/**
	 * 身高m
	 */
	
	private Double shengaom;
		
	/**
	 * bmi
	 */
	
	private Double bmi;
		
	/**
	 * 血压mmHg
	 */
	
	private String xueya;
		
	/**
	 * 血糖水平
	 */
	
	private String xuetangshuiping;
		
	/**
	 * 家族病史
	 */
	
	private String jiazubingshi;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
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
	 * 设置：体重kg
	 */
	 
	public void setTizhongkg(Double tizhongkg) {
		this.tizhongkg = tizhongkg;
	}
	
	/**
	 * 获取：体重kg
	 */
	public Double getTizhongkg() {
		return tizhongkg;
	}
				
	
	/**
	 * 设置：身高m
	 */
	 
	public void setShengaom(Double shengaom) {
		this.shengaom = shengaom;
	}
	
	/**
	 * 获取：身高m
	 */
	public Double getShengaom() {
		return shengaom;
	}
				
	
	/**
	 * 设置：bmi
	 */
	 
	public void setBmi(Double bmi) {
		this.bmi = bmi;
	}
	
	/**
	 * 获取：bmi
	 */
	public Double getBmi() {
		return bmi;
	}
				
	
	/**
	 * 设置：血压mmHg
	 */
	 
	public void setXueya(String xueya) {
		this.xueya = xueya;
	}
	
	/**
	 * 获取：血压mmHg
	 */
	public String getXueya() {
		return xueya;
	}
				
	
	/**
	 * 设置：血糖水平
	 */
	 
	public void setXuetangshuiping(String xuetangshuiping) {
		this.xuetangshuiping = xuetangshuiping;
	}
	
	/**
	 * 获取：血糖水平
	 */
	public String getXuetangshuiping() {
		return xuetangshuiping;
	}
				
	
	/**
	 * 设置：家族病史
	 */
	 
	public void setJiazubingshi(String jiazubingshi) {
		this.jiazubingshi = jiazubingshi;
	}
	
	/**
	 * 获取：家族病史
	 */
	public String getJiazubingshi() {
		return jiazubingshi;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
			
}

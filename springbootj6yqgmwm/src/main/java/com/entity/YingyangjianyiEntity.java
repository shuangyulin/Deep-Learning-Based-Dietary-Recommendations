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
 * 营养建议
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2025-03-21 08:53:18
 */
@TableName("yingyangjianyi")
public class YingyangjianyiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YingyangjianyiEntity() {
		
	}
	
	public YingyangjianyiEntity(T t) {
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
	 * 标题
	 */
					
	private String biaoti;
	
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
	 * 评估时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date pinggushijian;
	
	/**
	 * 健康程度
	 */
					
	private String jiankangchengdu;
	
	/**
	 * 热量参考
	 */
					
	private String reliangcankao;
	
	/**
	 * 蛋白质参考
	 */
					
	private String danbaizhicankao;
	
	/**
	 * 脂肪参考
	 */
					
	private String zhifangcankao;
	
	/**
	 * 钙
	 */
					
	private String gai;
	
	/**
	 * 镁
	 */
					
	private String mei;
	
	/**
	 * 铁
	 */
					
	private String tie;
	
	/**
	 * 碘
	 */
					
	private String dian;
	
	/**
	 * 锌
	 */
					
	private String xin;
	
	/**
	 * 维生素
	 */
					
	private String weishengsu;
	
	
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
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
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
	 * 设置：评估时间
	 */
	public void setPinggushijian(Date pinggushijian) {
		this.pinggushijian = pinggushijian;
	}
	/**
	 * 获取：评估时间
	 */
	public Date getPinggushijian() {
		return pinggushijian;
	}
	/**
	 * 设置：健康程度
	 */
	public void setJiankangchengdu(String jiankangchengdu) {
		this.jiankangchengdu = jiankangchengdu;
	}
	/**
	 * 获取：健康程度
	 */
	public String getJiankangchengdu() {
		return jiankangchengdu;
	}
	/**
	 * 设置：热量参考
	 */
	public void setReliangcankao(String reliangcankao) {
		this.reliangcankao = reliangcankao;
	}
	/**
	 * 获取：热量参考
	 */
	public String getReliangcankao() {
		return reliangcankao;
	}
	/**
	 * 设置：蛋白质参考
	 */
	public void setDanbaizhicankao(String danbaizhicankao) {
		this.danbaizhicankao = danbaizhicankao;
	}
	/**
	 * 获取：蛋白质参考
	 */
	public String getDanbaizhicankao() {
		return danbaizhicankao;
	}
	/**
	 * 设置：脂肪参考
	 */
	public void setZhifangcankao(String zhifangcankao) {
		this.zhifangcankao = zhifangcankao;
	}
	/**
	 * 获取：脂肪参考
	 */
	public String getZhifangcankao() {
		return zhifangcankao;
	}
	/**
	 * 设置：钙
	 */
	public void setGai(String gai) {
		this.gai = gai;
	}
	/**
	 * 获取：钙
	 */
	public String getGai() {
		return gai;
	}
	/**
	 * 设置：镁
	 */
	public void setMei(String mei) {
		this.mei = mei;
	}
	/**
	 * 获取：镁
	 */
	public String getMei() {
		return mei;
	}
	/**
	 * 设置：铁
	 */
	public void setTie(String tie) {
		this.tie = tie;
	}
	/**
	 * 获取：铁
	 */
	public String getTie() {
		return tie;
	}
	/**
	 * 设置：碘
	 */
	public void setDian(String dian) {
		this.dian = dian;
	}
	/**
	 * 获取：碘
	 */
	public String getDian() {
		return dian;
	}
	/**
	 * 设置：锌
	 */
	public void setXin(String xin) {
		this.xin = xin;
	}
	/**
	 * 获取：锌
	 */
	public String getXin() {
		return xin;
	}
	/**
	 * 设置：维生素
	 */
	public void setWeishengsu(String weishengsu) {
		this.weishengsu = weishengsu;
	}
	/**
	 * 获取：维生素
	 */
	public String getWeishengsu() {
		return weishengsu;
	}

}

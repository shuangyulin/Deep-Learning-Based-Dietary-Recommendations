package com.entity.vo;

import com.entity.JiankangshipuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康食谱
 * @author 
 * @email 
 * @date 2025-03-21 08:53:19
 */
public class JiankangshipuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 食谱类型
	 */
	
	private String shipuleixing;
		
	/**
	 * 食谱封面
	 */
	
	private String shipufengmian;
		
	/**
	 * 能量
	 */
	
	private String nengliang;
		
	/**
	 * 蛋白质
	 */
	
	private String danbaizhi;
		
	/**
	 * 脂肪
	 */
	
	private String zhifang;
		
	/**
	 * 碳水化合物
	 */
	
	private String tanshuihuahewu;
		
	/**
	 * 制作流程
	 */
	
	private String zhizuoliucheng;
		
	/**
	 * 食材搭配
	 */
	
	private String shicaidapei;
		
	/**
	 * 营养信息
	 */
	
	private String yingyangxinxi;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 评论数
	 */
	
	private Integer discussnum;
		
	/**
	 * 评分
	 */
	
	private Double totalscore;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：食谱类型
	 */
	 
	public void setShipuleixing(String shipuleixing) {
		this.shipuleixing = shipuleixing;
	}
	
	/**
	 * 获取：食谱类型
	 */
	public String getShipuleixing() {
		return shipuleixing;
	}
				
	
	/**
	 * 设置：食谱封面
	 */
	 
	public void setShipufengmian(String shipufengmian) {
		this.shipufengmian = shipufengmian;
	}
	
	/**
	 * 获取：食谱封面
	 */
	public String getShipufengmian() {
		return shipufengmian;
	}
				
	
	/**
	 * 设置：能量
	 */
	 
	public void setNengliang(String nengliang) {
		this.nengliang = nengliang;
	}
	
	/**
	 * 获取：能量
	 */
	public String getNengliang() {
		return nengliang;
	}
				
	
	/**
	 * 设置：蛋白质
	 */
	 
	public void setDanbaizhi(String danbaizhi) {
		this.danbaizhi = danbaizhi;
	}
	
	/**
	 * 获取：蛋白质
	 */
	public String getDanbaizhi() {
		return danbaizhi;
	}
				
	
	/**
	 * 设置：脂肪
	 */
	 
	public void setZhifang(String zhifang) {
		this.zhifang = zhifang;
	}
	
	/**
	 * 获取：脂肪
	 */
	public String getZhifang() {
		return zhifang;
	}
				
	
	/**
	 * 设置：碳水化合物
	 */
	 
	public void setTanshuihuahewu(String tanshuihuahewu) {
		this.tanshuihuahewu = tanshuihuahewu;
	}
	
	/**
	 * 获取：碳水化合物
	 */
	public String getTanshuihuahewu() {
		return tanshuihuahewu;
	}
				
	
	/**
	 * 设置：制作流程
	 */
	 
	public void setZhizuoliucheng(String zhizuoliucheng) {
		this.zhizuoliucheng = zhizuoliucheng;
	}
	
	/**
	 * 获取：制作流程
	 */
	public String getZhizuoliucheng() {
		return zhizuoliucheng;
	}
				
	
	/**
	 * 设置：食材搭配
	 */
	 
	public void setShicaidapei(String shicaidapei) {
		this.shicaidapei = shicaidapei;
	}
	
	/**
	 * 获取：食材搭配
	 */
	public String getShicaidapei() {
		return shicaidapei;
	}
				
	
	/**
	 * 设置：营养信息
	 */
	 
	public void setYingyangxinxi(String yingyangxinxi) {
		this.yingyangxinxi = yingyangxinxi;
	}
	
	/**
	 * 获取：营养信息
	 */
	public String getYingyangxinxi() {
		return yingyangxinxi;
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
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
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
	 * 设置：评分
	 */
	 
	public void setTotalscore(Double totalscore) {
		this.totalscore = totalscore;
	}
	
	/**
	 * 获取：评分
	 */
	public Double getTotalscore() {
		return totalscore;
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

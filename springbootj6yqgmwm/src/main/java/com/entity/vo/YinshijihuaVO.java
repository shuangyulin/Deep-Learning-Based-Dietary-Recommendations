package com.entity.vo;

import com.entity.YinshijihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 饮食计划
 * @author 
 * @email 
 * @date 2025-03-21 08:53:18
 */
public class YinshijihuaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 适用人群
	 */
	
	private String shiyongrenqun;
		
	/**
	 * 每日摄入热量
	 */
	
	private String meirisherureliang;
		
	/**
	 * 烹饪方式
	 */
	
	private String pengrenfangshi;
		
	/**
	 * 制作时长
	 */
	
	private String zhizuoshizhang;
		
	/**
	 * 食材清单
	 */
	
	private String shicaiqingdan;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
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
	 * 设置：适用人群
	 */
	 
	public void setShiyongrenqun(String shiyongrenqun) {
		this.shiyongrenqun = shiyongrenqun;
	}
	
	/**
	 * 获取：适用人群
	 */
	public String getShiyongrenqun() {
		return shiyongrenqun;
	}
				
	
	/**
	 * 设置：每日摄入热量
	 */
	 
	public void setMeirisherureliang(String meirisherureliang) {
		this.meirisherureliang = meirisherureliang;
	}
	
	/**
	 * 获取：每日摄入热量
	 */
	public String getMeirisherureliang() {
		return meirisherureliang;
	}
				
	
	/**
	 * 设置：烹饪方式
	 */
	 
	public void setPengrenfangshi(String pengrenfangshi) {
		this.pengrenfangshi = pengrenfangshi;
	}
	
	/**
	 * 获取：烹饪方式
	 */
	public String getPengrenfangshi() {
		return pengrenfangshi;
	}
				
	
	/**
	 * 设置：制作时长
	 */
	 
	public void setZhizuoshizhang(String zhizuoshizhang) {
		this.zhizuoshizhang = zhizuoshizhang;
	}
	
	/**
	 * 获取：制作时长
	 */
	public String getZhizuoshizhang() {
		return zhizuoshizhang;
	}
				
	
	/**
	 * 设置：食材清单
	 */
	 
	public void setShicaiqingdan(String shicaiqingdan) {
		this.shicaiqingdan = shicaiqingdan;
	}
	
	/**
	 * 获取：食材清单
	 */
	public String getShicaiqingdan() {
		return shicaiqingdan;
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
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
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

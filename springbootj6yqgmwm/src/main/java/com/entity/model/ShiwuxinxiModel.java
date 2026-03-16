package com.entity.model;

import com.entity.ShiwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 食物信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2025-03-21 08:53:18
 */
public class ShiwuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 食物图片
	 */
	
	private String shiwutupian;
		
	/**
	 * 烹饪时间
	 */
	
	private String pengrenshijian;
		
	/**
	 * 食材
	 */
	
	private String shicai;
		
	/**
	 * 烹饪方式
	 */
	
	private String pengrenfangshi;
		
	/**
	 * 能量
	 */
	
	private Double nengliang;
		
	/**
	 * 蛋白质g
	 */
	
	private Double danbaizhig;
		
	/**
	 * 脂肪g
	 */
	
	private Double zhifangg;
		
	/**
	 * 钙mg
	 */
	
	private Double gaimg;
		
	/**
	 * 铁mg
	 */
	
	private Double tiemg;
		
	/**
	 * 锌mg
	 */
	
	private Double xinmg;
		
	/**
	 * 维生素
	 */
	
	private String weishengsu;
		
	/**
	 * 碳水化合物g
	 */
	
	private Double tanshuihuahewug;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
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
	 * 设置：食物图片
	 */
	 
	public void setShiwutupian(String shiwutupian) {
		this.shiwutupian = shiwutupian;
	}
	
	/**
	 * 获取：食物图片
	 */
	public String getShiwutupian() {
		return shiwutupian;
	}
				
	
	/**
	 * 设置：烹饪时间
	 */
	 
	public void setPengrenshijian(String pengrenshijian) {
		this.pengrenshijian = pengrenshijian;
	}
	
	/**
	 * 获取：烹饪时间
	 */
	public String getPengrenshijian() {
		return pengrenshijian;
	}
				
	
	/**
	 * 设置：食材
	 */
	 
	public void setShicai(String shicai) {
		this.shicai = shicai;
	}
	
	/**
	 * 获取：食材
	 */
	public String getShicai() {
		return shicai;
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
	 * 设置：能量
	 */
	 
	public void setNengliang(Double nengliang) {
		this.nengliang = nengliang;
	}
	
	/**
	 * 获取：能量
	 */
	public Double getNengliang() {
		return nengliang;
	}
				
	
	/**
	 * 设置：蛋白质g
	 */
	 
	public void setDanbaizhig(Double danbaizhig) {
		this.danbaizhig = danbaizhig;
	}
	
	/**
	 * 获取：蛋白质g
	 */
	public Double getDanbaizhig() {
		return danbaizhig;
	}
				
	
	/**
	 * 设置：脂肪g
	 */
	 
	public void setZhifangg(Double zhifangg) {
		this.zhifangg = zhifangg;
	}
	
	/**
	 * 获取：脂肪g
	 */
	public Double getZhifangg() {
		return zhifangg;
	}
				
	
	/**
	 * 设置：钙mg
	 */
	 
	public void setGaimg(Double gaimg) {
		this.gaimg = gaimg;
	}
	
	/**
	 * 获取：钙mg
	 */
	public Double getGaimg() {
		return gaimg;
	}
				
	
	/**
	 * 设置：铁mg
	 */
	 
	public void setTiemg(Double tiemg) {
		this.tiemg = tiemg;
	}
	
	/**
	 * 获取：铁mg
	 */
	public Double getTiemg() {
		return tiemg;
	}
				
	
	/**
	 * 设置：锌mg
	 */
	 
	public void setXinmg(Double xinmg) {
		this.xinmg = xinmg;
	}
	
	/**
	 * 获取：锌mg
	 */
	public Double getXinmg() {
		return xinmg;
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
				
	
	/**
	 * 设置：碳水化合物g
	 */
	 
	public void setTanshuihuahewug(Double tanshuihuahewug) {
		this.tanshuihuahewug = tanshuihuahewug;
	}
	
	/**
	 * 获取：碳水化合物g
	 */
	public Double getTanshuihuahewug() {
		return tanshuihuahewug;
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

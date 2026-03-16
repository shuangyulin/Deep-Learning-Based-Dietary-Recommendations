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
 * 食物信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2025-03-21 08:53:18
 */
@TableName("shiwuxinxi")
public class ShiwuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShiwuxinxiEntity() {
		
	}
	
	public ShiwuxinxiEntity(T t) {
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
					
	private String shiwumingcheng;
	
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
	public void setShiwumingcheng(String shiwumingcheng) {
		this.shiwumingcheng = shiwumingcheng;
	}
	/**
	 * 获取：食物名称
	 */
	public String getShiwumingcheng() {
		return shiwumingcheng;
	}
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

package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import com.utils.ValidatorUtils;
import com.utils.DeSensUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShiwuxinxiEntity;
import com.entity.view.ShiwuxinxiView;

import com.service.ShiwuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 食物信息
 * 后端接口
 * @author 
 * @email 
 * @date 2025-03-21 08:53:18
 */
@RestController
@RequestMapping("/shiwuxinxi")
public class ShiwuxinxiController {
    @Autowired
    private ShiwuxinxiService shiwuxinxiService;

    @Autowired
    private StoreupService storeupService;





    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiwuxinxiEntity shiwuxinxi,
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<ShiwuxinxiEntity> ew = new EntityWrapper<ShiwuxinxiEntity>();


        //查询结果
		PageUtils page = shiwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiwuxinxi), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShiwuxinxiEntity shiwuxinxi, 
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<ShiwuxinxiEntity> ew = new EntityWrapper<ShiwuxinxiEntity>();

        //查询结果
		PageUtils page = shiwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiwuxinxi), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiwuxinxiEntity shiwuxinxi){
       	EntityWrapper<ShiwuxinxiEntity> ew = new EntityWrapper<ShiwuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiwuxinxi, "shiwuxinxi")); 
        return R.ok().put("data", shiwuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiwuxinxiEntity shiwuxinxi){
        EntityWrapper< ShiwuxinxiEntity> ew = new EntityWrapper< ShiwuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiwuxinxi, "shiwuxinxi")); 
		ShiwuxinxiView shiwuxinxiView =  shiwuxinxiService.selectView(ew);
		return R.ok("查询食物信息成功").put("data", shiwuxinxiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiwuxinxiEntity shiwuxinxi = shiwuxinxiService.selectById(id);
        if(null==shiwuxinxi.getClicknum()){
            shiwuxinxi.setClicknum(0);
        }
		shiwuxinxi.setClicknum(shiwuxinxi.getClicknum()+1);
		shiwuxinxiService.updateById(shiwuxinxi);
        shiwuxinxi = shiwuxinxiService.selectView(new EntityWrapper<ShiwuxinxiEntity>().eq("id", id));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shiwuxinxi,deSens);
        return R.ok().put("data", shiwuxinxi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiwuxinxiEntity shiwuxinxi = shiwuxinxiService.selectById(id);
        if(null==shiwuxinxi.getClicknum()){
            shiwuxinxi.setClicknum(0);
        }
		shiwuxinxi.setClicknum(shiwuxinxi.getClicknum()+1);
		shiwuxinxiService.updateById(shiwuxinxi);
        shiwuxinxi = shiwuxinxiService.selectView(new EntityWrapper<ShiwuxinxiEntity>().eq("id", id));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shiwuxinxi,deSens);
        return R.ok().put("data", shiwuxinxi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        ShiwuxinxiEntity shiwuxinxi = shiwuxinxiService.selectById(id);
        if(type.equals("1")) {
        	shiwuxinxi.setThumbsupnum(shiwuxinxi.getThumbsupnum()+1);
        } else {
        	shiwuxinxi.setCrazilynum(shiwuxinxi.getCrazilynum()+1);
        }
        shiwuxinxiService.updateById(shiwuxinxi);
        return R.ok("投票成功");
    }

    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShiwuxinxiEntity shiwuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiwuxinxi);
        shiwuxinxiService.insert(shiwuxinxi);
        return R.ok().put("data",shiwuxinxi.getId());
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShiwuxinxiEntity shiwuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiwuxinxi);
        shiwuxinxiService.insert(shiwuxinxi);
        return R.ok().put("data",shiwuxinxi.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShiwuxinxiEntity shiwuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiwuxinxi);
        //全部更新
        shiwuxinxiService.updateById(shiwuxinxi);
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shiwuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    








}

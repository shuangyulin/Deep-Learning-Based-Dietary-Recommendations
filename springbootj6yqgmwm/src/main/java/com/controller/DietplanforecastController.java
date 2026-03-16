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

import com.entity.DietplanforecastEntity;
import com.entity.view.DietplanforecastView;

import com.service.DietplanforecastService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.DietplanService;
import com.entity.DietplanEntity;
import java.text.DecimalFormat;
import weka.core.*;
import java.util.*;
import java.util.stream.Stream;
import weka.classifiers.Classifier;
import weka.classifiers.trees.J48;
import weka.classifiers.trees.M5P;

/**
 * 食物类别预测
 * 后端接口
 * @author 
 * @email 
 * @date 2025-03-21 08:53:19
 */
@RestController
@RequestMapping("/dietplanforecast")
public class DietplanforecastController {
    @Autowired
    private DietplanforecastService dietplanforecastService;
    @Autowired
    private DietplanService dietplanService;






    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DietplanforecastEntity dietplanforecast,
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<DietplanforecastEntity> ew = new EntityWrapper<DietplanforecastEntity>();


        //查询结果
		PageUtils page = dietplanforecastService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dietplanforecast), params), params));
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
    public R list(@RequestParam Map<String, Object> params,DietplanforecastEntity dietplanforecast, 
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<DietplanforecastEntity> ew = new EntityWrapper<DietplanforecastEntity>();

        //查询结果
		PageUtils page = dietplanforecastService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dietplanforecast), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DietplanforecastEntity dietplanforecast){
       	EntityWrapper<DietplanforecastEntity> ew = new EntityWrapper<DietplanforecastEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dietplanforecast, "dietplanforecast")); 
        return R.ok().put("data", dietplanforecastService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DietplanforecastEntity dietplanforecast){
        EntityWrapper< DietplanforecastEntity> ew = new EntityWrapper< DietplanforecastEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dietplanforecast, "dietplanforecast")); 
		DietplanforecastView dietplanforecastView =  dietplanforecastService.selectView(ew);
		return R.ok("查询食物类别预测成功").put("data", dietplanforecastView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DietplanforecastEntity dietplanforecast = dietplanforecastService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(dietplanforecast,deSens);
        return R.ok().put("data", dietplanforecast);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DietplanforecastEntity dietplanforecast = dietplanforecastService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(dietplanforecast,deSens);
        return R.ok().put("data", dietplanforecast);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DietplanforecastEntity dietplanforecast, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dietplanforecast);
        dietplanforecastService.insert(dietplanforecast);
        return R.ok().put("data",dietplanforecast.getId());
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DietplanforecastEntity dietplanforecast, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dietplanforecast);
        dietplanforecastService.insert(dietplanforecast);
        return R.ok().put("data",dietplanforecast.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DietplanforecastEntity dietplanforecast, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dietplanforecast);
        //全部更新
        dietplanforecastService.updateById(dietplanforecast);
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dietplanforecastService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    







    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,DietplanforecastEntity dietplanforecast, HttpServletRequest request){
        EntityWrapper<DietplanforecastEntity> ew = new EntityWrapper<DietplanforecastEntity>();
        int count = dietplanforecastService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dietplanforecast), params), params));
        return R.ok().put("data", count);
    }

    /**
    * 预测算法
    */
    @RequestMapping("/forecast")
    public R forecast(@RequestBody Map<String, Object> params) throws Exception {
        // 特征值
        String[] eigenValueArr = "heat,protein,fat,carbohydrate".split(",");
        // 目标值
        String[] targetValueArr = "foodcategory".split(",");
        String[] sqlSelectArr = Stream.of(eigenValueArr, targetValueArr).flatMap(Arrays::stream).toArray(String[]::new);
        // 模型训练
        Wrapper<DietplanEntity> wrapper = new EntityWrapper<>();
        wrapper.setSqlSelect(sqlSelectArr);
        for (String arr : sqlSelectArr) {
            wrapper.isNotNull(arr).ne(arr, "");
        }
        // 从数据库获取需要元数据
        List<Map<String,Object>> list =dietplanService.selectMaps(wrapper);
        // 模型训练
        Instances instances = createInstances(list, sqlSelectArr);

        // 创建一个map来存储预测结果
        Map<String, Object> forecastRes = forecastRes(instances, params, eigenValueArr, targetValueArr);

        // 更新数据库或其他操作
        EntityWrapper<DietplanforecastEntity> ew = new EntityWrapper<>();
        ew.eq("id", params.get("id"));
        for (Map.Entry<String, Object> entry : forecastRes.entrySet()) {
            String updateSet = entry.getKey() + "='" + entry.getValue().toString() + "'";
            dietplanforecastService.updateForSet(updateSet, ew);
        }
        params.putAll(forecastRes);
        return R.ok(params);
    }

    /**
     * 预测结果
     * @param instances
     * @param params
     * @param eigenValueArr
     * @param targetValueArr
     * @return
     * @throws Exception
     */
    private Map<String, Object> forecastRes(Instances instances, Map<String, Object> params, String[] eigenValueArr, String[] targetValueArr) throws Exception {
        Map<String, Object> forecastRes = new HashMap<>();
        // 创建一个新的Instance对象，用于预测
        Instance newInstance = new DenseInstance(instances.numAttributes());
        newInstance.setDataset(instances);

        // 设置特征值
        for (String eigenValue : eigenValueArr) {
            Attribute attribute = instances.attribute(eigenValue);
            String val = params.get(eigenValue).toString();
            if (attribute.isNominal()) {
                if (attribute.indexOfValue(val) > 0) {
                    newInstance.setValue(attribute, val);
                }
            } else {
                newInstance.setValue(attribute, Double.parseDouble(val));
            }
        }

        // 循环遍历每个目标值，并为每个目标值创建一个模型
        for (String targetValue : targetValueArr) {
            // 创建一个新的Instances对象，复制原始数据
            Instances instancesForTarget = new Instances(instances);
            Attribute attribute = instancesForTarget.attribute(targetValue);
            // 设置类属性索引为目标值
            instancesForTarget.setClassIndex(attribute.index());

            // 创建并训练模型，根据目标值类型选择算法
            weka.classifiers.Classifier model;
            if (!attribute.isNominal()) {
                // 对于数值型目标值，使用M5P
                model = new M5P();
            } else {
                // 对于标称型目标值，使用J48
                model = new J48();
            }

            // 训练模型
            model.buildClassifier(instancesForTarget);

            // 使用模型进行预测
            double prediction = model.classifyInstance(newInstance);

            // 获取预测值
            if (instancesForTarget.classAttribute().isNumeric()) {
                DecimalFormat df = new DecimalFormat("#.00");
                // 如果类属性是数值型的，直接使用预测值
                forecastRes.put(targetValue, df.format(prediction));
            } else {
                // 如果类属性是标称型的，使用预测索引来获取对应的字符串值

                String predictedValue = instancesForTarget.classAttribute().value((int) prediction);
                forecastRes.put(targetValue, predictedValue);
            }
        }
        return forecastRes;
    }

    /**
    * 训练模型
    */
    private Instances createInstances(List<Map<String, Object>> dataList, String[] attrs) throws Exception {
        // 遍历数据集以确定每个属性的类型
        Map<String, Set<Object>> uniqueValuesPerAttribute = new HashMap<>();
        for (Map<String, Object> data : dataList) {
            for (String attr : attrs) {
                uniqueValuesPerAttribute.computeIfAbsent(attr, k -> new HashSet<>()).add(data.get(attr));
            }
        }
        FastVector attributes = new FastVector();
        for (String attr : attrs) {
            Set<Object> uniqueValues = uniqueValuesPerAttribute.get(attr);
            if (isNominal(uniqueValues)) {
                // 如果是分类属性，创建分类属性
                FastVector nominalValues = new FastVector();
                uniqueValues.forEach(value -> nominalValues.addElement(value));
                nominalValues.add("unknown");
                attributes.addElement(new Attribute(attr, nominalValues));
            } else {
                attributes.addElement(new Attribute(attr));
            }
        }

        // 创建 Instances 对象
        Instances dataset = new Instances("dataset-name", attributes, dataList.size());
        dataset.setClassIndex(dataset.numAttributes() - 1); // 设置类属性索引
        // 填充数据
        for (Map<String, Object> data : dataList) {
            double[] instanceValue = new double[dataset.numAttributes()];
            int i = 0;
            for (String attr : attrs) {
                Attribute attribute = dataset.attribute(attr);
                if (attribute.isNominal()) {
                    instanceValue[i++] = attribute.indexOfValue(data.get(attr).toString());
                } else {
                    instanceValue[i++] = Double.parseDouble(data.get(attr).toString());
                }
            }
            Instance instance = new DenseInstance(1.0, instanceValue);
            dataset.add(instance);
        }
        return dataset;
    }

    /**
    * 检测数据类型是否为字符串
    */
    private boolean isNominal(Set<Object> values) {
        // 检查是否所有的值都是字符串，并且数量是否超过某个阈值（例如，如果超过50%的值是唯一的，则可能是分类属性）
        return values.stream().allMatch(v -> v instanceof String);
    }
}

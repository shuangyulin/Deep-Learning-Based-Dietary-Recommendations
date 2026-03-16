package com.controller;

import com.annotation.IgnoreAuth;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import com.service.DietplanService;
import com.entity.DietplanEntity;
import com.config.HadoopGroup;
import com.utils.R;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/hadoop")
public class HadoopController {
    @Autowired
    private DietplanService dietplanService;
    @Autowired
    private HadoopGroup hadoopGroup;

    @IgnoreAuth
    @RequestMapping("/analyze")
    public R analyze(HttpServletRequest request) throws Exception {
        value(request);
        valueMul(request);
        group(request);
        return R.ok();
    }

    /**
    * （按值统计）
    */
    private void value(HttpServletRequest request) throws Exception {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                        }

    /**
     * （按值统计(多)）
     */
    private void valueMul(HttpServletRequest request) throws Exception {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                        }

    /**
    * （按类统计）
    */
    private void group(HttpServletRequest request) throws Exception {
                                                                                                                                                                                                                                                                            HadoopGroup.setClassName("dietplan");
                            HadoopGroup.setColumnName("foodnames");
                            hadoopGroup.run(Collections.singletonList(dietplanService.selectList(new EntityWrapper<DietplanEntity>())));
                                                                                                                                    HadoopGroup.setClassName("dietplan");
                            HadoopGroup.setColumnName("foodcategory");
                            hadoopGroup.run(Collections.singletonList(dietplanService.selectList(new EntityWrapper<DietplanEntity>())));
                                                                                                                                                                                                                                                                                    HadoopGroup.setClassName("dietplan");
                            HadoopGroup.setColumnName("cookingdifficulty");
                            hadoopGroup.run(Collections.singletonList(dietplanService.selectList(new EntityWrapper<DietplanEntity>())));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }

}

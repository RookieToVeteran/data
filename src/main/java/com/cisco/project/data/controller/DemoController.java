package com.cisco.project.data.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.cisco.project.data.entity.ClientEntity;
import com.cisco.project.data.service.DemoService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @description
 * @Author 狂风飞我
 * @Date 2020/8/15 9:10
 */

@RequestMapping("/cisco/view")
@RestController
public class DemoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private DemoService demoService;

    @GetMapping("/query/list")
    public PageInfo<ClientEntity> queryClientList(@RequestParam Map map){
        LOGGER.info("请求参数【{}】", JSONUtils.toJSONString(map));
        PageInfo<ClientEntity> resultList = demoService.queryClientList(map);
        return resultList;
    }
}

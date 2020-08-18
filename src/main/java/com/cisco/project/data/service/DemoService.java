package com.cisco.project.data.service;

import com.cisco.project.data.entity.ClientEntity;
import com.github.pagehelper.PageInfo;

import java.util.Map;

/**
 * @description
 * @Author 狂风飞我
 * @Date 2020/8/15 9:12
 */
public interface DemoService {
    PageInfo<ClientEntity> queryClientList(Map map);
}

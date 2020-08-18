package com.cisco.project.data.service;

import com.cisco.project.data.dao.postgres.PostgresDao;
import com.cisco.project.data.entity.ClientEntity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @description
 * @Author 狂风飞我
 * @Date 2020/8/15 9:15
 */
@Service
public class DemoServiceImpl implements DemoService{

    @Autowired
    private PostgresDao postgresDao;

    @Override
    public  PageInfo<ClientEntity> queryClientList(Map map) {
        Integer page = 1;
        Integer rows = 20;
        if (map.get("rows")!=null){
            rows = Integer.parseInt(map.get("rows").toString());
        }
        if (map.get("offset")!=null){
            String offset = map.get("offset").toString();
            Integer value = Integer.valueOf(offset);
            page = value;
        }

        PageHelper.startPage(page,rows);
        List<ClientEntity> result = postgresDao.queryClientList(map);
        PageInfo<ClientEntity> pageInfo = new PageInfo<>(result);

        return pageInfo;
    }

}

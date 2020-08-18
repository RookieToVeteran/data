package com.cisco.project.data.dao.postgres;

import com.cisco.project.data.entity.ClientEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @description
 * @Author 狂风飞我
 * @Date 2020/8/15 9:16
 */

public interface PostgresDao {

    List<ClientEntity> queryClientList(@Param("param") Map map);
}

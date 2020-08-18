//package com.cisco.project.data.config.factory;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
///**
// * @description
// * @Author 狂风飞我
// * @Date 2020/8/15 14:09
// */
//@Component
//public class MysqlDataSourceFactory {
//
//    @Value("${spring.datasource.pulse.initialSize}")
//    private int initialSize;
//
//    @Value("${spring.datasource.pulse.minIdle}")
//    private int minIdle;
//
//    @Value("${spring.datasource.pulse.maxActive}")
//    private int maxActive;
//
//    @Value("${spring.datasource.pulse.maxWait}")
//    private int maxWait;
//
//    @Value("${spring.datasource.pulse.time-between-eviction-runs-millis}")
//    private int timeBetweenEvictionRunsMillis;
//
//    @Value("${spring.datasource.pulse.min-evictable-idle-time-millis}")
//    private int minEvictableIdleTimeMillis;
//
//    @Value("${spring.datasource.pulse.test-while-idle}")
//    private boolean testWhileIdle;
//
//
//    public DruidDataSource create(){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setTestWhileIdle(testWhileIdle);
//        dataSource.setInitialSize(initialSize);
//        dataSource.setMinIdle(minIdle);
//        dataSource.setMaxActive(maxActive);
//        dataSource.setMaxWait(maxWait);
//        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
//        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
//        return dataSource;
//    }
//
//
//}

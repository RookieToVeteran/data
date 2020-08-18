//package com.cisco.project.data.config;
//
//import com.cisco.project.data.config.factory.MysqlDataSourceFactory;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//
//import javax.annotation.Resource;
//import javax.sql.DataSource;
//
///**
// * @description:数据源配置
// * @Author 狂风飞我
// * @Date 2020/8/15 9:33
// */
//@Configuration
//@MapperScan(basePackages = MysqlDataSourceConfig.PACKAGE ,sqlSessionTemplateRef = "sqlSessionTemplate")
//public class MysqlDataSourceConfig {
//
//    @Resource
//    private MysqlDataSourceFactory mysqlDataSourceFactory;
//
//    public static final String PACKAGE = "com.cisco.project.data.dao.mysql";
//
//    public static final String MAPPER_LOCATION = "classpath:mybatis/mapper/mysql/*.xml";
//
//    @Bean(name="mysqlDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.pulse")
//    public DataSource createDataSource(){
//        return mysqlDataSourceFactory.create();
//    }
//
//
//    @Bean(name = "sqlSessionFactory")
//    public SqlSessionFactory createSqlSessionFactory(@Qualifier("mysqlDataSource") DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATION));
//        return bean.getObject();
//    }
//
//    @Bean(name = "mysqlTransactionManager")
//    public DataSourceTransactionManager createTransactionManager(@Qualifier("mysqlDataSource") DataSource dataSource){
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//    @Bean(name = "sqlSessionTemplate")
//    public SqlSessionTemplate createSqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory){
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//
//}

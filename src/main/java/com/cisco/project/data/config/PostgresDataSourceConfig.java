package com.cisco.project.data.config;

import com.cisco.project.data.config.factory.PostgresDataSourceFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @description
 * @Author 狂风飞我
 * @Date 2020/8/15 15:56
 */

@Configuration
@MapperScan(basePackages = PostgresDataSourceConfig.PACKAGE ,sqlSessionTemplateRef = "postgresSessionTemplate")
public class PostgresDataSourceConfig {

    public static final String PACKAGE = "com.cisco.project.data.dao.postgres";

    public static final String MAPPER_LOCATION = "classpath:mybatis/mapper/postgres/*.xml";

    @Resource
    private PostgresDataSourceFactory postgresDataSourceFactory;

    @Bean(name="postgresDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.postgres")
    public DataSource createDataSource(){
        return postgresDataSourceFactory.create();
    }


    @Bean(name = "postgresSqlSessionFactory")
    public SqlSessionFactory createSqlSessionFactory(@Qualifier("postgresDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATION));
        return bean.getObject();
    }

    @Bean(name = "postgresTransactionManager")
    public DataSourceTransactionManager createTransactionManager(@Qualifier("postgresDataSource") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "postgresSessionTemplate")
    public SqlSessionTemplate createSqlSessionTemplate(@Qualifier("postgresSqlSessionFactory") SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}

package com.ssm.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 *
 * @author e1hax
 * @date 2022-08-31
 */
public class MybatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        //获取 SqlSessionFactoryBean 对象
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        //设置包的名称类型
        ssfb.setTypeAliasesPackage("com.ssm.domain");
        ssfb.setDataSource(dataSource);
        return ssfb;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.ssm.dao");
        return  msc;
    }

}

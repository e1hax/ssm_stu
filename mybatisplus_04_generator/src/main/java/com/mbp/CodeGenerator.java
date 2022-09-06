package com.mbp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;

/**
 * Created by e1hax on 2022-09-06.
 */
public class CodeGenerator {
    public static void main(String[] args) {
        //1.获取代码生成器对象
        AutoGenerator autoGenerator = new AutoGenerator();

        //设置数据库相关配置
        DataSourceConfig dataSource = new DataSourceConfig();
        dataSource.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mybatisplus_db");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        //设置全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir")+"/mybatisplus_04_generator/src/main/java");
        globalConfig.setOpen(false);
        globalConfig.setAuthor("e1hax");
        globalConfig.setFileOverride(true);
        globalConfig.setMapperName("%Dao");
        globalConfig.setIdType(IdType.ASSIGN_ID);
        autoGenerator.setGlobalConfig(globalConfig);

        //设置包名相关
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.auto");
        packageConfig.setEntity("domain");
        packageConfig.setMapper("dao");
        autoGenerator.setPackageInfo(packageConfig);

        //策略设置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude("tbl_user");
        strategyConfig.setTablePrefix("tbl_");
        strategyConfig.setRestControllerStyle(true);
        strategyConfig.setVersionFieldName("version");
        strategyConfig.setLogicDeleteFieldName("delete");
        strategyConfig.setEntityLombokModel(true);
        autoGenerator.setStrategy(strategyConfig);

        autoGenerator.execute();
    }
}

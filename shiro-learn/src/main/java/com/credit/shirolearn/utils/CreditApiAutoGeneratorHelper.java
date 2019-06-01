package com.credit.shirolearn.utils;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * * @Author: 王旻烺Sanm
 * * @Date: 2018/12/19 14:31
 * * @Description: mybatisplus生成实体类
 **/
public class CreditApiAutoGeneratorHelper {

    /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("E:\\file");
        gc.setFileOverride(true);
        gc.setActiveRecord(false);
        gc.setEnableCache(false); // XML 二级缓存
        gc.setBaseResultMap(true); // XML ResultMap
        gc.setBaseColumnList(true); // XML columList
        gc.setOpen(true);
        gc.setAuthor("王旻烺Sanm");
        // gc.setOpen(true);

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("I%sService");
        gc.setServiceImplName("%sService");
        gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        //dsc.setDbType(DbType.ORACLE);
        dsc.setDbType(DbType.ORACLE);
        /*
         * dsc.setTypeConvert(new MySqlTypeConvert(){ // 自定义数据库表字段类型转换【可选】
         *
         * @Override public DbColumnType processTypeConvert(String fieldType) { System.out.println("转换类型：" + fieldType);
         * return super.processTypeConvert(fieldType); } });
         */
        /*
         * dsc.setDriverName("com.mysql.jdbc.Driver"); dsc.setUsername("root"); dsc.setPassword("root");
         * dsc.setUrl("jdbc:mysql://127.0.0.1:3306/test?characterEncoding=utf8");
         */
        // 172.24.254.93
        // 服务名:pdbaifrm
        // 用户名密码：u_aifrm/p_aifrm

        dsc.setDriverName("oracle.jdbc.driver.OracleDriver");
        dsc.setUsername("u_creditscore");
        dsc.setPassword("p_creditscore");
        dsc.setUrl("jdbc:oracle:thin:@10.28.60.219:1521/csdb");

//        dsc.setDriverName("com.mysql.jdbc.Driver");
//        dsc.setUsername("root");
//        dsc.setPassword("root");
//        dsc.setUrl("jdbc:mysql://localhost:3306/crawler?useUnicode=true&characterEncoding=UTF-8");


        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        // strategy.setTablePrefix(new String[] { "tlog_", "tsys_" });// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setInclude(new String[] { "CREDIT_SCORE_MONTHLY" }); // 需要生成的表

        // strategy.setExclude(new String[]{"test"}); // 排除生成的表
        // 自定义实体父类
        // strategy.setSuperEntityClass("com.baomidou.demo.TestEntity");
        // 自定义实体，公共字段
        // strategy.setSuperEntityColumns(new String[] { "test_id", "age" });
        // 自定义 mapper 父类
        // strategy.setSuperMapperClass("com.baomidou.demo.TestMapper");
        // 自定义 service 父类
        // strategy.setSuperServiceClass("com.baomidou.demo.TestService");
        // 自定义 service 实现类父类
        // strategy.setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl");
        // 自定义 controller 父类
        // strategy.setSuperControllerClass("com.baomidou.demo.TestController");
        // 【实体】是否生成字段常量（默认 false）
        // public static final String ID = "test_id";
        // strategy.setEntityColumnConstant(true);
        // 【实体】是否为构建者模型（默认 false）
        // public User setName(String name) {this.name = name; return this;}
        // strategy.setEntityBuliderModel(true);
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        //pc.setParent("com.hgzx.pub.admin");
        //pc.setEntity("model.entity");
        pc.setParent("com.credit");
        pc.setEntity("domain");
        // pc.setModuleName("entity");
        mpg.setPackageInfo(pc);

        // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
        InjectionConfig cfg = new InjectionConfig() {

            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                this.setMap(map);
            }
        };
        // 自定义 xxList.jsp 生成
        /*
         * List<FileOutConfig> focList = new ArrayList<FileOutConfig>(); focList.add(new
         * FileOutConfig("/template/list.jsp.vm") {
         *
         * @Override public String outputFile(TableInfo tableInfo) { // 自定义输入文件名称 return "D://my_" +
         * tableInfo.getEntityName() + ".jsp"; } }); cfg.setFileOutConfigList(focList);
         */
        mpg.setCfg(cfg);

        // 自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/template 下面内容修改，
        // 放置自己项目的 src/main/resources/template 目录下, 默认名称一下可以不配置，也可以自定义模板名称
        // TemplateConfig tc = new TemplateConfig();
        // tc.setController("...");
        // tc.setEntity("...");
        // tc.setMapper("...");
        // tc.setXml("...");
        // tc.setService("...");
        // tc.setServiceImpl("...");
        // 如上任何一个模块如果设置 空 OR Null 将不生成该模块。
        // mpg.setTemplate(tc);

        // 执行生成
        mpg.execute();

        // 打印注入设置
        System.err.println(mpg.getCfg().getMap().get("abc"));
    }
}

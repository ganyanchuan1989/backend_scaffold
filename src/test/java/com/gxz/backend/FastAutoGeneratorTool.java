package com.gxz.backend;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

@SpringBootTest
public class FastAutoGeneratorTool {

    public static void main(String[] args) {

        String[] tables = new String[]{
                "hrms_contract",
                "hrms_data_dictionary",
                "hrms_dept",
                "hrms_employee",
                "hrms_job",
                "hrms_leave",
                "hrms_salary_sheet"};

        FastAutoGenerator.create("jdbc:mysql://localhost:3306/hrmsdb?useSSL=false&useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT", "root", "gyc89,./").globalConfig(builder -> {
                    builder.author("ganxunzou") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
                            .outputDir("D://tmp"); // 指定输出目录
                }).packageConfig(builder -> {
                    builder.parent("com.gxz.hrms") // 设置父包名
//                            .moduleName("system") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D://tmp")); // 设置mapperXml生成路径
                }).strategyConfig(builder -> {
                    builder.addInclude(tables) // 设置需要生成的表名
                            .addTablePrefix("com_", "hrms_") // 设置过滤表前缀
                            .entityBuilder().enableLombok(); // 启用lombook
                }).templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}

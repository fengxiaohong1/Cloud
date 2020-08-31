package com.activiti.app;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.repository.Deployment;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ActivitiApplicationTests {
    /**流程引擎（核心对象），默认加载类路径下命名为activiti.cfg.xml*/


    @Test
    void contextLoads() {
        ProcessEngineConfiguration processEngineConfiguration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
        processEngineConfiguration.setJdbcDriver("com.mysql.jdbc.Driver");
        processEngineConfiguration.setJdbcUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=false");
        processEngineConfiguration.setJdbcUsername("root");
        processEngineConfiguration.setJdbcPassword("967557fxh");
        processEngineConfiguration.setHistory("none");
        processEngineConfiguration.setDatabaseSchemaUpdate("none");
        ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();
        System.out.println("processEngine"+processEngine);
    }


    //部署流程定义
    @Test
    public void deployementProcessDefinition(){
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        Deployment deployment = processEngine.getRepositoryService()//获取流程定义和部署对象相关的Service
                .createDeployment()//创建部署对象
                .name("请假流程")//声明流程的名称F:\java练习\MobileFile\提前订餐\people-recruitment\SpringBoot_Activiti\src\main\resources\activiti\bpmn
                .addClasspathResource("leave.bpmn")//加载资源文件，一次只能加载一个文件
                .addClasspathResource("leave.png")//
                .deploy();//完成部署
        System.out.println("部署ID："+deployment.getId());//1
        System.out.println("部署时间："+deployment.getDeploymentTime());
    }
}

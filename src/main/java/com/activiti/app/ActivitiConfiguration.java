package com.activiti.app;

import org.activiti.engine.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

/**
 * @author fxh
 */
@EnableSpringConfigured
public class ActivitiConfiguration {
    @Bean
    public void processEngineConfiguration() {
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration
                .createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        ProcessEngine processEngine = configuration.buildProcessEngine();
    }
}

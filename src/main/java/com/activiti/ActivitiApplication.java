package com.activiti;

import com.activiti.quartz.MyScheduler;
import org.quartz.SchedulerException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author fxh
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableAsync
@EnableCaching
public class ActivitiApplication {

    public static void main(String[] args) throws SchedulerException {
        SpringApplication.run(ActivitiApplication.class, args);
        MyScheduler myScheduler =  new MyScheduler();
        myScheduler.quartzTest();
    }

}

package com.activiti.app.quartz;


import org.junit.jupiter.api.Test;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class MyScheduler {
    @Test
    public void quartzTest() throws SchedulerException {
        SchedulerFactory schedulerFactory =  new StdSchedulerFactory();
        Scheduler scheduler =  schedulerFactory.getScheduler();

        JobDetail jobDetail = JobBuilder.newJob(PrintWordsJob.class)
                .withIdentity("job1", "group1").build();

        Trigger trigger =  TriggerBuilder.newTrigger().withIdentity("trigger1","triggerGroup1")
                .startNow()
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(1)//每隔1s执行一次
                .repeatForever()).build();//一直执行



    }
}

package com.activiti.quartz;


import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;


public class MyScheduler {

    public void quartzTest() throws SchedulerException {
        JobDetail jobDetail = JobBuilder.newJob(PrintWordsJob.class)
                .withIdentity("job1", "group1").build();

       /* Trigger trigger =  TriggerBuilder.newTrigger().withIdentity("trigger1","triggerGroup1")
                .startNow()
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(1)//每隔1s执行一次
                .repeatForever()).build();//一直执行*/

        Date date = new Date();
        long startTime = date.getTime() + 3000;

        CronTrigger c = TriggerBuilder.newTrigger()
                .startAt(new Date(startTime))
                .withIdentity("t1", "1")
                .withSchedule(CronScheduleBuilder.cronSchedule("* * * * * * *"))
                .build();
        //创建SchedulerFactory对象  注意是new的是StdSchedulerFactory Std开头
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        //获得Scheduler
        Scheduler scheduler = schedulerFactory.getScheduler();
        //设置调度 的job 和trigger
        scheduler.scheduleJob(jobDetail, c);
        //开启调度
        scheduler.start();

    }
}

package com.activiti.app.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintWordsJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        String date =  new SimpleDateFormat("yy-mm-dd HH-mm-ss").format(new Date());
        System.out.println("date:"+date);
    }

}

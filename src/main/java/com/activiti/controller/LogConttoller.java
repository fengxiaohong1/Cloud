package com.activiti.controller;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pub")
public class LogConttoller {

    // Logger和LogManager导入的是org.slf4j包

    private static final Logger logger = LogManager.getLogger(LogConttoller.class);

    @GetMapping("/getLog")
    public String getLog(){
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        return "log....";
    }

}
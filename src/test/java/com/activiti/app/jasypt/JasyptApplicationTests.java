package com.activiti.app.jasypt;

import com.activiti.ActivitiApplication;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author fxh
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes  = ActivitiApplication.class)
public class JasyptApplicationTests {
    @Autowired
    private StringEncryptor stringEncryptor;
    @Test
    public  void contextLoads(){
        System.out.println(stringEncryptor.encrypt("123456"));
        System.out.println(stringEncryptor.encrypt("123456"));


    }
}

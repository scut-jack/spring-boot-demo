package com.xkcoding.helloworld;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoHelloworldApplicationTests {


    // 单元测试controller中的方法
    @Autowired
    HelloWorldController helloWorldController;

    @Test
    public void contextLoads() {
        String s = helloWorldController.hello("jack");
        System.out.println(s);
    }

}

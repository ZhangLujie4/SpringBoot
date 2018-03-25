package com.zlj.sell;

import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.spi.LoggerFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 张璐杰
 * 2018/2/5 15:43
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    //private final static Logger logger = org.slf4j.LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1() {
        String name = "imooc";
        String password = "123456";
        log.debug("debug...");
        log.info("information...");
        log.info("name: {}, password: {}", name, password);
        log.error("error...");

    }
}

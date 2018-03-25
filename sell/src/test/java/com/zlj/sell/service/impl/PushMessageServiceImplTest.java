package com.zlj.sell.service.impl;

import com.zlj.sell.dto.OrderDTO;
import com.zlj.sell.service.OrderService;
import com.zlj.sell.service.PushMessageService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 张璐杰
 * 2018/3/10 16:07
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PushMessageServiceImplTest {

    @Autowired
    private PushMessageService pushMessageService;

    @Autowired
    private OrderService orderService;

    @Test
    public void orderStatus() throws Exception {

        OrderDTO orderDTO = orderService.findOne("1520522888147484858");

        pushMessageService.orderStatus(orderDTO);
    }
}
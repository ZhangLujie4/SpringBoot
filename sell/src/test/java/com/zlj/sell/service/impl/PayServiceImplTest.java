package com.zlj.sell.service.impl;

import com.zlj.sell.dto.OrderDTO;
import com.zlj.sell.service.OrderService;
import com.zlj.sell.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by 张璐杰
 * 2018/3/8 9:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PayServiceImplTest {

    @Autowired
    private PayService payService;

    @Autowired
    private OrderService orderService;

    private static final String ORDER_ID = "1520476446117618672";

    @Test
    public void create() throws Exception {
        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
        payService.create(orderDTO);
    }

    @Test
    public void refund() {
        OrderDTO orderDTO = orderService.findOne("1520521243607819035");
        payService.refund(orderDTO);
    }
}
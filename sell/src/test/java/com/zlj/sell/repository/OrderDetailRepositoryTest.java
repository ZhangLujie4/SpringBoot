package com.zlj.sell.repository;

import com.zlj.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 张璐杰
 * 2018/2/13 14:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456790");
        orderDetail.setOrderId("111111");
        orderDetail.setProductIcon("http://xx.jpg");
        orderDetail.setProductId("111112");
        orderDetail.setProductName("皮皮虾");
        orderDetail.setProductPrice(new BigDecimal(6.4));
        orderDetail.setProductQuantity(2);

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> orderDetailList = repository.findByOrderId("111111");
        Assert.assertNotEquals(0, orderDetailList.size());
    }
}
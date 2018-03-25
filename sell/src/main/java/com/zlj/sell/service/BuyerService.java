package com.zlj.sell.service;

import com.zlj.sell.dto.OrderDTO;

/**
 * 买家
 * Created by 张璐杰
 * 2018/3/4 19:52
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}

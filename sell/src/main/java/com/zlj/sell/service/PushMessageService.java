package com.zlj.sell.service;

import com.zlj.sell.dto.OrderDTO;

/**
 * 推送消息
 * Created by 张璐杰
 * 2018/3/10 15:42
 */
public interface PushMessageService {


    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}

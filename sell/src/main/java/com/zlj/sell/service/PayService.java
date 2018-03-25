package com.zlj.sell.service;

import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;
import com.zlj.sell.dto.OrderDTO;
import org.springframework.stereotype.Service;

/**
 * Created by 张璐杰
 * 2018/3/6 15:41
 */
public interface PayService {

    PayResponse create(OrderDTO orderDTO);

    PayResponse notify(String notifyData);

    RefundResponse refund(OrderDTO orderDTO);
}

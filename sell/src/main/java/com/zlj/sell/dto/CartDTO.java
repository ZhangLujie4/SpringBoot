package com.zlj.sell.dto;

import lombok.Data;

/**
 * 购物车
 * Created by 张璐杰
 * 2018/3/4 10:13
 */
@Data
public class CartDTO {

    /** 商品id. **/
    private String productId;
    /** 数量. **/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}

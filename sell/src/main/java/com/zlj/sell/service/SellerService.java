package com.zlj.sell.service;

import com.zlj.sell.dataobject.SellerInfo;

/**
 * 卖家端
 * Created by 张璐杰
 * 2018/3/10 10:06
 */
public interface SellerService {

    /**
     * 通过openid查询
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}

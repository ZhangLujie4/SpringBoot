package com.zlj.sell.service.impl;

import com.zlj.sell.dataobject.SellerInfo;
import com.zlj.sell.repository.SellerInfoRepository;
import com.zlj.sell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 张璐杰
 * 2018/3/10 10:08
 */

@Service
public class SellerServiceImpl implements SellerService{

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}

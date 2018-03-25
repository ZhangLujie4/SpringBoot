package com.zlj.sell.repository;

import com.zlj.sell.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 张璐杰
 * 2018/3/10 9:53
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {

    SellerInfo findByOpenid(String s);
}

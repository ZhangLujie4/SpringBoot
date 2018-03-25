package com.zlj.sell.service;

import com.zlj.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by 张璐杰
 * 2018/2/9 16:13
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}

package com.zlj.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 商品（包含类目）
 * Created by 张璐杰
 * 2018/2/12 14:39
 */
@Data
public class ProductVO implements Serializable{

    private static final long serialVersionUID = 4426091838122007872L;

    /** 类目名称 */
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categorytype;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}

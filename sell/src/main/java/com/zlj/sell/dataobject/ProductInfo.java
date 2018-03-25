package com.zlj.sell.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zlj.sell.enums.ProductStatusEnum;
import com.zlj.sell.utils.EnumUtil;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品
 * Created by 张璐杰
 * 2018/2/10 11:15
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo implements Serializable{


    private static final long serialVersionUID = 7038721131740706803L;
    @Id
    private String productId;

    /** 名字 */
    private String productName;

    /** 单价 */
    private BigDecimal productPrice;

    /** 库存 */
    private Integer productStock;

    /** 描述 */
    private String productDescription;

    /** 小图链接地址 */
    private String productIcon;

    /** 状态，0正常1下架 */
    private Integer productStatus = ProductStatusEnum.UP.getCode();

    /** 类目编号 */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum() {
        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
    }

}

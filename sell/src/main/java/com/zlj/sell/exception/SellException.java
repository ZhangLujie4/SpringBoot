package com.zlj.sell.exception;

import com.zlj.sell.enums.ResultEnum;
import lombok.Getter;

/**
 * Created by 张璐杰
 * 2018/2/13 16:02
 */
@Getter
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}

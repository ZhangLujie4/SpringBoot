package com.zlj.sell.VO;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by 张璐杰
 * 2018/2/12 14:13
 */
@Data
public class ResultVO<T> implements Serializable{


    private static final long serialVersionUID = -5080619402198519563L;
    /** 错误码. */
    private Integer code;
    /** 提示信息. */
    private String msg;
    /** 具体内容. */
    private T data;
}

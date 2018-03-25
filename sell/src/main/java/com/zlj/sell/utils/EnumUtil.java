package com.zlj.sell.utils;

import com.zlj.sell.enums.CodeEnum;

/**
 * Created by 张璐杰
 * 2018/3/9 15:10
 */
public class EnumUtil<T> {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}

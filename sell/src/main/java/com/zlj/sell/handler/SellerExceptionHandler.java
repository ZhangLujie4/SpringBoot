package com.zlj.sell.handler;

import com.zlj.sell.VO.ResultVO;
import com.zlj.sell.config.ProjectUrlConfig;
import com.zlj.sell.exception.ResponseBankException;
import com.zlj.sell.exception.SellException;
import com.zlj.sell.exception.SellerAuthorizeException;
import com.zlj.sell.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * 异常处理
 * Created by 张璐杰
 * 2018/3/10 15:14
 */
@ControllerAdvice
public class SellerExceptionHandler {

    @Autowired
    private ProjectUrlConfig projectUrlConfig;

    //拦截登陆异常
    //sell.springboot.cn/sell/wechat/qrAuthorize?returnUrl=http://sxah.natapp1.cc/seller/login
    @ExceptionHandler(value = SellerAuthorizeException.class)
    public ModelAndView handlerAuthorizeException() {
        return new ModelAndView("redirect:"
                .concat(projectUrlConfig.getJYsell())
                .concat("/sell/wechat/qrAuthorize")
                .concat("?returnUrl=")
                .concat(projectUrlConfig.getSell())
                .concat("/seller/login"));
    }

    @ExceptionHandler(value = SellException.class)
    @ResponseBody
    public ResultVO handlerSellerException(SellException e) {
        return ResultVOUtil.error(e.getCode(), e.getMessage());
    }

//    @ExceptionHandler(value = ResponseBankException.class)
//    @ResponseStatus(HttpStatus.FORBIDDEN)
//    public void handleResponseBankException() {
//
//    }
}

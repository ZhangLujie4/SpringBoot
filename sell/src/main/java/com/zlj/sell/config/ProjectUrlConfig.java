package com.zlj.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by 张璐杰
 * 2018/3/10 11:01
 */

@Data
@ConfigurationProperties(prefix = "projectUrl")
@Component
public class ProjectUrlConfig {
    /**
     * 微信公众号授权url
     */
    public String wechatMpAuthorize;

    /**
     * 微信开发平台授权url
     */
    public String wechatOpenAuthorize;

    public String sell;

    public String JYsell;
}

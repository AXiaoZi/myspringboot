package com.example.myspringboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: myspringboot
 * @Package: com.example.myspringboot.config
 * @ClassName: MicroServiceUrl
 * @Author: MaCheng
 * @Description:
 * @Date: 2020/4/17 18:02
 * @Version: 1.0
 */

@Component
@ConfigurationProperties(prefix = "url")
@Data
public class MicroServiceUrl {

    private String myUrl;
    private String youUrl;
    private String allUrl;


}

package com.chaos.eurekaconsumer;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 熔断回调类
 * @program: eureka-consumer
 * * @description:
 * * @author: liaopeng
 * * @create: 2020-09-28 09:48
 **/
@Component
public class ConsumerHystrix implements ConsumerInterface{
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "参数"+name+"远程调用失败，进入熔断回调";
    }
}

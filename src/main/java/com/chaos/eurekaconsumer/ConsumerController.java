package com.chaos.eurekaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: eureka-consumer
 * * @description:
 * * @author: liaopeng
 * * @create: 2020-09-27 17:01
 **/
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerInterface consumerInterface;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return consumerInterface.hello(name);
    }
}

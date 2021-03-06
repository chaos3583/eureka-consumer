package com.chaos.eurekaconsumer;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "eureka-producer",fallback = ConsumerHystrix.class)
public interface ConsumerInterface {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}

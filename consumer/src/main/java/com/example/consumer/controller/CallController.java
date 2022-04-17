package com.example.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consumer")
public class CallController {
    private final static String PROVIDER_URL = "http://localhost:8003/";

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/findAll")
    public Object findAll(){
        return restTemplate.getForObject(PROVIDER_URL + "country/findAll", Object.class);
    }

    @RequestMapping("/findByCode/{code}")
    public Object findByCode(@PathVariable String code){
        return restTemplate.getForObject(PROVIDER_URL + "city/find/" + code, Object.class);
    }

    // 测试@EnableDiscoveryClient,消费端可以调用服务发现
    @RequestMapping(value = "/consumer/discovery")
    public Object discovery() {
        return restTemplate.getForObject(PROVIDER_URL + "/country/discovery", Object.class);
    }
}

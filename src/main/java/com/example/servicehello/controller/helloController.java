package com.example.servicehello.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/project")
public class helloController {
    private static Logger log = LoggerFactory.getLogger(helloController.class);

    @RequestMapping(value = "/hello")
    //required=false 表示url中可以不传入id参数，此时就使用默认参数
    public String say(@RequestParam(value = "id", required = false, defaultValue = "hello world") String input) {
        log.debug("your input :" + input);
        return "your input :" + input;
    }
}
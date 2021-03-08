package com.appcall.webapi;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MSController{
    
    private static final String TEMPLATE = "Hello, %s";

    private final AtomicLong count = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greetings(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(count.incrementAndGet(), String.format(TEMPLATE, name));
    }
}

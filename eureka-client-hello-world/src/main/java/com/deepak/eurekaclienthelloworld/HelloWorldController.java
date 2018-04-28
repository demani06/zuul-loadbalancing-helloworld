package com.deepak.eurekaclienthelloworld;

import org.springframework.web.bind.annotation.RequestMapping;

public interface HelloWorldController {
    @RequestMapping("/greeting")
    String greeting();
}

package com.datacloud.DaCu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    @GetMapping("/user")
    public String testView()    {
        return "Welcome Krishanu Acharya";
    }

    @GetMapping("/")
    public String homeView()    {
        return "Welcome";
    }
}

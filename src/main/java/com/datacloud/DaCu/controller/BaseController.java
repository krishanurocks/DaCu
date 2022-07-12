package com.datacloud.DaCu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    @GetMapping("user")
    public String testView(ModelMap map) {
        map.addAttribute("message", "Welcome Krishanu Acharya!");
        return "user";
    }

    @GetMapping("/")
    public String homeView(ModelMap map) {
        map.addAttribute("msg", "Test Message!");
        return "test";
    }
}

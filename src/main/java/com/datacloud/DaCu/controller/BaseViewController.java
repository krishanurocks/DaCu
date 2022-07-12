package com.datacloud.DaCu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseViewController {

    @RequestMapping("/")
    public String viewHome(ModelMap map)    {
        map.addAttribute("msg","Welcome Krishanu!");
        return "index";
    }

    @RequestMapping("/user")
    public String viewUserHome(ModelMap map)    {
        map.addAttribute("msg","Welcome User!");
        return "user";
    }
}

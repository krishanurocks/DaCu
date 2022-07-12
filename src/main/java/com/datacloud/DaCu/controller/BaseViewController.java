package com.datacloud.DaCu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseViewController {

    @RequestMapping("/")
    public String viewHome(ModelMap map)    {
        return "index";
    }

    @RequestMapping("/dashboard")
    public String viewUserHome(ModelMap map)    {
        return "dashboard";
    }
}

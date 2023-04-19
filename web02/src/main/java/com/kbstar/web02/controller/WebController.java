package com.kbstar.web02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/")
    public String main() {
        return "index";
    }

    @RequestMapping("/nex")
    public String next() {
        return "next";
    }
}

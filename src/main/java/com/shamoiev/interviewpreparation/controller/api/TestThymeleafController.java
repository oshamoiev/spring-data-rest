package com.shamoiev.interviewpreparation.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class TestThymeleafController {


    @GetMapping("hello")
    public String hello(Model model) {
        DateFormat dateFormat = new SimpleDateFormat();
        model.addAttribute("serverTime", dateFormat.format(new Date()));
        return "hello";
    }
}

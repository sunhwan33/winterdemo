package com.thc.winterdemo.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/spost")
@Controller
public class SpostController {

    @GetMapping("/{page}")
    public String page(@PathVariable String page) { return "spost/"+page;}

    @GetMapping("/{page}/{id}")
    public String page(@PathVariable String page, @PathVariable String id) { return "spost/"+page;}

}
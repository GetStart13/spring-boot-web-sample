package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeHome {
    @GetMapping("/index")
    public String welcome() {
        // 重定向到 index.html，受 路径匹配模式 (spring.mvc.static-path-pattern)
        // 和 资源路径配置 (spring.web.resources.static-locations) 的影响
        return "redirect:/path/index.html";
    }

    @GetMapping("/location")
    public String location() {
        return "redirect:/path/location.html";
    }

}

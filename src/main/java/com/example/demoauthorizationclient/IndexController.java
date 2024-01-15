package com.example.demoauthorizationclient;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kezhijie@co-mall.com
 * @date 2024/1/15
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String index(HttpServletRequest request, HttpServletResponse response) {
        return "Hello World";
    }
}

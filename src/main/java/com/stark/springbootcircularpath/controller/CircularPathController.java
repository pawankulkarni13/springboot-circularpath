package com.stark.springbootcircularpath.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CircularPathController {

    @GetMapping("/path")
    public String path() {
        return "path";
    }

}

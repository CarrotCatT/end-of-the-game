package com.example.endofthegame.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class SimpleWebController {

    @GetMapping("/me-web")
    public String simpleWebWithMyData() {
        log.info("showing my page :P");
        return "my-page"; //page name in string (same as in .html file in resoruce templates fold.
    }
}

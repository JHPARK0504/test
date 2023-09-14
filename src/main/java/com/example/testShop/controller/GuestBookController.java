package com.example.testShop.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("guestbook")
@Log4j2
public class GuestBookController {
    @GetMapping("/")
    public String index(){
        log.info("GET req : /guestbook/");
        return "redirect : /guestbook/list";
    }

    @GetMapping("/list")
    public void list(){
        log.info("GET req : /guestbook/list");
    }
}

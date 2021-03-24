package com.jojo.book.web.admin.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //뷰 반황(브라우저가 요청에 따른 객체[클래스] 반환
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}

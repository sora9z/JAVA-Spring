package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // 해당당 클래스는 rest api를 처리하는 controller로 등록이 된다.
@RequestMapping("/api") // 주소를 할당해 줄 수 있다. /api라는 주소고 매핑 . url을 지정해주는 annotaion
public class ApiController {
    @GetMapping("/hello") // get 방식의 주소 매핑 http://localhost:9090/hellp
    public String hello(){
        return "hello spring boot";
    }

}

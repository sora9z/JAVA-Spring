package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  // html을 찾게 된다.
public class PageController {

    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    // How to response json

    // 1.  ResponseEntity

    // 2.  ResponseBNody

    @ResponseBody // response body를 만들어서 내리겠다
    @GetMapping("/user")
    public User user(){

        var user=new User(); // type 추론 java 11
        // 원래는 User user = new User();
        user.setName("sora");
        user.setAddress("fase");
        return user;
    }
}

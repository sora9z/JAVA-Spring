package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiContoller {


    // TEXT
    // get mapping으로 들어온 쿼리파라미터의 값을 받아서 읽어본다
    // 이런 식의 text를 그대로 주는 경우는 없음 -> json으로 내려주어야 함
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }

    // JSON
    // req -> object mapper를 통해 -> object로 바뀐다 -> method -> response 할 떄 obj를 return -> objedfct mapper -> json -> respons
    @PostMapping("/json")
    public User json(@RequestBody User user){

        return user; // 200 ok
    }

    // 201에 대환 응답은? PUT의 경우 201로 보통 응답을 준다
    // ResponseEntity에 generic type을 사용
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}




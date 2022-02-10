package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path="/hello")  // http:localhostL9090/api/get/hello
    public String ghetHello(){
        return "Hello get";
    }

    // 예전에 쓰던 방법
    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    // get put posty .. 모든 메서드가 지정
    // 위의 방법을 사용하면 굳이 requestMethod를 설정하지 않아도 된다.
    public String hi(){
        return "hi";
    }
    // path value
    // http://localhost:9090/api/get/path-variable/{name}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName){ // 변수지정
        // 원래 변수에는 네임이 같아야 하지만, 다르게 설정해야 할 때에는 위와 같이 (에 name="name")
        System.out.println("PathVariable : "+pathName);
        return pathName;
    }

    // query parameter
    // ?key=value&key2=value2
    // http://localhost:9090/api/get/query-param?user=steve&email=steve@gmain.com&age=30
    @GetMapping(path="query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){ // queryParam annotation
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey()+" = "+entry.getValue()+"\n");
                });

        return sb.toString();
    }

    @GetMapping("query-param02")
    // 명시적인 방법
    // 하지만 만약 변수가 많아지면?? 스프링에서는 DTP 형태로 매핑할 수 있게 해준다.
    public String queryParam2(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name+" "+email+" "+age;

    }


    @GetMapping("query-param03")
   // dto 에 딱로 만들어서 객체로 받을 수 있다.
    // 이 방식을 추천
    // annotation을 하지 않는다.
    public String queryParam3(UserRequest userRequest){
        System.out.println(UserRequest.getName());
        System.out.println(UserRequest.getEmail());
        System.out.println(UserRequest.getAge());

        return userRequest.toString();

    }
}

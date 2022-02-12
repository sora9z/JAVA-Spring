package com.example.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectmapperApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("-----------------");

        // Object Mapper는 Text Json -> Object
        // Object -> Text , Json

        // controller req json(text)-> object
        // res object -> json(text)

        var objectMapper= new ObjectMapper();

        // objefct -> text
        // objectMapper는 getter method를 활용한다.

        var user=new User("sora",30,"010-1111-2222");

        var text=objectMapper.writeValueAsString(user);
        System.out.println(text);


        // text -> Object
        // default 생성자가 있어야 한다.
        var objectUser=objectMapper.readValue(text,User.class);
        System.out.println(objectUser);
    }

}

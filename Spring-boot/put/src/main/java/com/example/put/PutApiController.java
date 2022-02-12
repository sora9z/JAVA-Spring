package com.example.put;

import com.example.put.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userId}")
    public PostRequestDto put(@RequestBody PostRequestDto requestDto, @PathVariable Long userId){
        System.out.println(userId);
        // Object 자체를 return 하면 sprint boot에서 json 자체로 바꿔준다.
        return requestDto;
    }
}
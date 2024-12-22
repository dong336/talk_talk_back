package com.example.talk_talk_back.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("/post")
@RestController
public class PostRestController {

    @PostMapping("/create")
    public ResponseEntity<Map<String, Object>> createPostOne(@RequestBody Map<String, Object> request) {



        return new ResponseEntity<>(Map.of(), HttpStatus.CREATED);
    }
}
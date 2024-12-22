package com.example.talk_talk_back.restController;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RequestMapping
@RestController
public class TestRestController {

    private static final Logger log = LoggerFactory.getLogger(TestRestController.class);

    @GetMapping("/test")
    public ResponseEntity<Map<String, Object>> test() {



        return ResponseEntity.ok(
          Map.of("result", "Success!")
        );
    }

}

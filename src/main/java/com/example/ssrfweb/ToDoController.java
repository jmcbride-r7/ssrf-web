package com.example.ssrfweb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/todos")
class TodoController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping(path="/json")
    public String getTodos() {
        //String theUrl = "https://jsonplaceholder.typicode.com/todos";
        String theUrl = "http://localhost:8080/hello";
        ResponseEntity<String> response = restTemplate.exchange(theUrl, HttpMethod.GET, null, String.class);

        return response.getBody();
    }
}

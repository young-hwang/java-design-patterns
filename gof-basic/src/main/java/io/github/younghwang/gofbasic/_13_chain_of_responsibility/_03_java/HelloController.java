package io.github.younghwang.gofbasic._13_chain_of_responsibility._03_java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String Hello() {
        return "Hello";
    }
}

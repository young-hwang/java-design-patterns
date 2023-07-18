package io.github.younghwang.gofbasic._19_observer._05_spring;

import org.springframework.context.ApplicationEvent;

public class MyEvent {
    private String message;

    public MyEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

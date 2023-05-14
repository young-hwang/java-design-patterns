package io.younghwang.basemodel._19_observer._04_spring;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
    private String message;

    public MyEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
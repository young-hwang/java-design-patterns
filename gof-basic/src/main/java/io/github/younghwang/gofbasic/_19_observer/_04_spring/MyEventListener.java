package io.github.younghwang.gofbasic._19_observer._04_spring;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println(event.getMessage());
    }
}

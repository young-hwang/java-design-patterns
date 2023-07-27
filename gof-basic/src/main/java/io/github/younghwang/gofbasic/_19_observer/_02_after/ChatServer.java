package io.github.younghwang.gofbasic._19_observer._02_after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {
    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void register(String subject, Subscriber subscriber) {
        if (subscribers.containsKey(subject)) {
            subscribers.get(subject).add(subscriber);
        } else {
            List<Subscriber> list = new ArrayList<>();
            list.add(subscriber);
            this.subscribers.put(subject, list);
        }
    }

    public void unregister(String subject, Subscriber subscriber) {
        if (this.subscribers.containsKey(subject)) {
            this.subscribers.get(subject).remove(subscriber);
        }
    }


    public void sendMessage(User user, String subect, String message) {
        if (this.subscribers.containsKey(subect)) {
            String userMessage = user.getName() + ": " + message;
            this.subscribers.get(subect).forEach(s -> s.handleMessage(userMessage));
        }
    }
}

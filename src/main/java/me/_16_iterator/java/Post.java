package me._16_iterator.java;

import java.time.LocalDateTime;

public class Post {
    private String title;
    private LocalDateTime createdDateTime;

    public Post(String title) {
        this.title = title;
        this.createdDateTime = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }
}

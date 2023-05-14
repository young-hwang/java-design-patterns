package io.younghwang.basemodel._16_iterator._02_after;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Board {
    private List<Post> posts = new ArrayList<>();

    public void addPost(String message) {
        Post post = new Post(message);
        this.posts.add(post);
    }

    public List<Post> getPosts() {
        return this.posts;
    }

    public Iterator<Post> getDefaultIterator() {
        return this.posts.iterator();
    }
}

package me._16_iterator.gof._03_after;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RecentPostIterator implements Iterator<Post> {
    private Iterator<Post> internalIterator;

    public RecentPostIterator(Board board) {
        List<Post> posts = board.getPosts();
        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        this.internalIterator = posts.iterator();
    }

    @Override
    public boolean hasNext() {
        return internalIterator.hasNext();
    }

    @Override
    public Post next() {
        return internalIterator.next();
    }
}

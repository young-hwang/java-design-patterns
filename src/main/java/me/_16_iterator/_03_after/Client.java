package me._16_iterator._03_after;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("design patter");
        board.addPost("algorithm");
        board.addPost("data structure");

        // 가장 최신 글 먼저 순회
        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        while (recentPostIterator.hasNext()) {
            System.out.println(recentPostIterator.next().getTitle());
        }
    }
}

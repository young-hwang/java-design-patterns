package io.github.younghwang.gofbasic._16_iterator._02_after;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("design patter");
        board.addPost("algorithm");
        board.addPost("data structure");

        // 들어간 순서대로 순회
        Iterator<Post> iterator = board.getPosts().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }
    }
}

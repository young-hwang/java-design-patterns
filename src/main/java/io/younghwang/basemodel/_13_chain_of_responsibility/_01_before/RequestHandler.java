package io.younghwang.basemodel._13_chain_of_responsibility._01_before;

public class RequestHandler {

    public void handler(Request request) {
        System.out.println(request.getMessage());
    }
}

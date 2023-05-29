package io.younghwang.basemodel._13_chain_of_responsibility._02_after;

public class AuthRequestHandler extends RequestHandler {
    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증 되었는가?");
        super.handle(request);
    }
}

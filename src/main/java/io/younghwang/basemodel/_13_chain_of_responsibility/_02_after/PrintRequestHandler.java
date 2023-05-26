package io.younghwang.basemodel._13_chain_of_responsibility._02_after;

public class PrintRequestHandler extends RequestHandler {
    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("출력하기");
        super.handle(request);
    }
}

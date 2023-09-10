package me._13_chain_of_responsibility._01_before;

public class LoggingHandler extends RequestHandler {
    @Override
    public void handler(Request request) {
        System.out.println("로깅");
        super.handler(request);
    }
}

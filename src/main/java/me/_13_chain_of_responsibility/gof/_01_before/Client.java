package me._13_chain_of_responsibility.gof._01_before;

public class Client {
    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        RequestHandler requestHandler = new RequestHandler();
        requestHandler.handler(request);

        RequestHandler loggingHandler = new LoggingHandler();
        loggingHandler.handler(request);
    }
}

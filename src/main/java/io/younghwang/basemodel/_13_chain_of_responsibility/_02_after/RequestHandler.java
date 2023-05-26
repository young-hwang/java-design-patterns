package io.younghwang.basemodel._13_chain_of_responsibility._02_after;

public abstract class RequestHandler {
    protected RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}

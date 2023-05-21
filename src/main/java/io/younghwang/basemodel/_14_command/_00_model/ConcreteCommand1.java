package io.younghwang.basemodel._14_command._00_model;

public class ConcreteCommand1 implements Command {
    private Receiver receiver;

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.operation();
    }
}

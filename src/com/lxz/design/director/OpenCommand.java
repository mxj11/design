package com.lxz.design.director;

public class OpenCommand implements Command {
    private Receiver receiver;

    public OpenCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        System.out.println("执行打开电视命令");
        receiver.open();
    }
}

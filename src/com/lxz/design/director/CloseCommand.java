package com.lxz.design.director;

public class CloseCommand implements Command {
    private Receiver receiver;

    public CloseCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void excute() {
        System.out.println("执行关闭电视命令");
        receiver.close();
    }
}

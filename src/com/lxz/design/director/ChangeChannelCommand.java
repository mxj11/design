package com.lxz.design.director;

public class ChangeChannelCommand implements Command {
    private Receiver receiver;

    public ChangeChannelCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        System.out.println("执行切换频道命令");
        receiver.changeChannel();
    }
}

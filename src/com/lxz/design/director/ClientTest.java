package com.lxz.design.director;

public class ClientTest {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command openCommand = new OpenCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(openCommand);
        invoker.excute();
    }
}

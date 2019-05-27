package com.sanm.h2.design.order;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/24 16:57
 * Description:
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Recevier recevier = new ConcreteReciver1();
        Command command = new ConcreteCommand1(recevier);

        invoker.setCommand(command);
        invoker.action();
    }
}

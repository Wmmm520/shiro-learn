package com.sanm.h2.design.order;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/24 16:22
 * Description:
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    //执行命令
    public void action() {
        this.command.execute();
    }
}

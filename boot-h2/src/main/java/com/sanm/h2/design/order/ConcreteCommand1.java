package com.sanm.h2.design.order;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/24 16:11
 * Description:
 */
public class ConcreteCommand1 extends Command {

    private Recevier recevier;

    public ConcreteCommand1(Recevier recevier) {
        this.recevier = recevier;
    }

    @Override
    public void execute() {
        this.recevier.doSomething();
    }
}

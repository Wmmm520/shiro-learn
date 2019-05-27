package com.sanm.h2.design.order;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/24 16:12
 * Description:
 */
public class ConcreteCommand2 extends Command {

    private Recevier recevier;

    public ConcreteCommand2(Recevier recevier) {
        this.recevier = recevier;
    }

    @Override
    public void execute() {
        this.recevier.doSomething();
    }
}

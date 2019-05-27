package com.sanm.h2.design.order;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/24 16:10
 * Description:
 */
public class ConcreteReciver2 extends Recevier {

    @Override
    public void doSomething() {
        System.out.println("接收者2都必须处理一定的业务逻辑！");
    }
}

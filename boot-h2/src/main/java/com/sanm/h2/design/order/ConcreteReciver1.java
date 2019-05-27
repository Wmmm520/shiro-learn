package com.sanm.h2.design.order;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/24 16:09
 * Description:
 */
public class ConcreteReciver1 extends Recevier{
    @Override
    public void doSomething() {
        System.out.println("接收者1都必须处理一定的业务逻辑！");
    }
}

package com.sanm.h2.design.factory;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/24 17:15
 * Description:
 */
public class Dog extends Animal{
    public void move(){
        System.out.println("狗可以跑步的");
    }

    public void bark(){
        System.out.println("狗可以狂叫");
    }
}

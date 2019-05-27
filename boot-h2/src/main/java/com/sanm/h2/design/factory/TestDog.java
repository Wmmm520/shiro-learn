package com.sanm.h2.design.factory;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/24 17:17
 * Description:
 */
public class TestDog {

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();

        b.move();
        a.move();
    }
}

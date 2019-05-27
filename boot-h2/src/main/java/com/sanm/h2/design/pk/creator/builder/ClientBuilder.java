package com.sanm.h2.design.pk.creator.builder;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/25 16:22
 * Description: 场景类
 */
public class ClientBuilder {

    public static void main(String[] args) {

        //成年超人信息
        SuperMan superMan = Director.createBuilder(AdultSuperManBuilder.class);
        System.out.println(superMan.toString());
        //幼年超人信息
        SuperMan childSuperMan = Director.createBuilder(ChilderSuperManBuilder.class);
        System.out.println(childSuperMan.toString());
    }
}

package com.sanm.h2.design.pk.creator.factory;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/25 15:30
 * Description:
 */
public class Client {

    public static void main(String[] args) {
        SuperMan superMan = CreateSuperManFactory.createSuperMan(AdultSuperMan.class);
        superMan.specialTalent();
    }
}

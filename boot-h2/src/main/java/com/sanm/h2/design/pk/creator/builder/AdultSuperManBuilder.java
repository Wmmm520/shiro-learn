package com.sanm.h2.design.pk.creator.builder;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/25 16:11
 * Description:-  成年超人建造者
 */
public class AdultSuperManBuilder extends Builder {

    @Override
    public SuperMan getSuperMan() {
        super.setBody("强壮的身体");
        super.setSpecialTalent("会飞行");
        super.setSpecialSymbol("胸前带S标记");
        return super.superMan;
    }
}

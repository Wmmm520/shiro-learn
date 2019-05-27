package com.sanm.h2.design.pk.creator.builder;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/25 16:14
 * Description:
 */
public class ChilderSuperManBuilder extends Builder {
    @Override
    public SuperMan getSuperMan() {
        super.setBody("strong body!");
        super.setSpecialTalent("刀枪不入");
        super.setSpecialSymbol("胸前带小S标记");
        return super.superMan;
    }
}

package com.sanm.h2.design.pk.creator.builder;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/25 16:01
 * Description: 超人抽象构造者
 */
public abstract class Builder {

    //定义一个超人应用
    protected final SuperMan superMan = new SuperMan();

    //构建出超人的躯体
    public void setBody(String body) {
        this.superMan.setBody(body);
    }

    //构建出超人的特殊技能
    public void setSpecialTalent(String st) {
        this.superMan.setSpecialTalent(st);
    }

    //构建出超人的特殊标记
    public void setSpecialSymbol(String ss) {
        this.superMan.setSpecialSymbol(ss);
    }

    //构建出一个完整的超人
    public abstract SuperMan getSuperMan();

    //一個超人的模版方法模式。超人的各个部分都准备好了。具体怎么组装则是由实现类来决定，
}

package com.sanm.h2.design.pk.creator.builder;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/25 16:18
 * Description: 导演类
 */
public class Director {

    public static <T extends Builder> SuperMan createBuilder(Class<T> c) {
        Builder builder = null;
        try {
            builder = (Builder) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return builder.getSuperMan();
    }
}

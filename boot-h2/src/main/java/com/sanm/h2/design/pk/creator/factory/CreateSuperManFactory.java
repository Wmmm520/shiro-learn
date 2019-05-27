package com.sanm.h2.design.pk.creator.factory;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/25 15:26
 * Description:
 */
public class CreateSuperManFactory {

    public static <T extends SuperMan> T createSuperMan(Class<T> c) {
        SuperMan superMan = null;
        try {
            superMan = (SuperMan) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) superMan;
    }
}

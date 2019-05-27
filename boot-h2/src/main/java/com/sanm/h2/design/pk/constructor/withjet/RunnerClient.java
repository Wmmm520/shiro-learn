package com.sanm.h2.design.pk.constructor.withjet;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/27 09:49
 * Description:
 */
public class RunnerClient {

    public static void main(String[] args) {
        RunnerImplement runnerImplement = new Runner();
        runnerImplement = new RunnerWithJet(runnerImplement);
        System.out.println("===增强后的运动员能力");
        runnerImplement.run();
    }
}

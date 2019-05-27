package com.sanm.h2.design.pk.constructor.withjet;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/27 09:47
 * Description:
 */
public class RunnerWithJet implements RunnerImplement {

    private RunnerImplement runnerImplement;

    public RunnerWithJet(RunnerImplement runnerImplement) {
        this.runnerImplement = runnerImplement;
    }

    @Override
    public void run() {
        System.out.println("加快运动员的速度：为运动员增加喷气装置");
        runnerImplement.run();
    }
}

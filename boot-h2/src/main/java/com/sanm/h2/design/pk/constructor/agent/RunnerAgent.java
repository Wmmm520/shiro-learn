package com.sanm.h2.design.pk.constructor.agent;

import java.util.Random;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/27 09:28
 * Description:
 */
public class RunnerAgent implements IRunner {

    private IRunner iRunner;

    public RunnerAgent(IRunner iRunner) {
        this.iRunner = iRunner;
    }

    @Override
    public void run() {
        Random random = new Random();
        if (random.nextBoolean()){
            System.out.println("代理人同意安排运动员跑步");
            iRunner.run();
        }else {
            System.out.println("代理人不同意安排运动员跑步");
        }
    }
}

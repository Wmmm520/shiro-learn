package com.sanm.h2.design.pk.constructor.agent;

/**
 * Author: 王蒙Sanm
 * Date: 2019/5/27 09:33
 * Description:
 */
public class AgentClient {

    public static void main(String[] args) {
        IRunner liu = new Runner();
        IRunner agent = new RunnerAgent(liu);
        System.out.println("===客人找运动员代理人要求去跑步");
        agent.run();
    }
}

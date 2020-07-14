package org.example.facade;

/**
 * Created by peiyiqiang on 2020/7/14.
 * Description:
 */
public class Facade {

    public void doAll() {
        Step1 s1 = new Step1Impl();
        s1.doStep1();

        Step2 s2 = new Step2Impl();
        s2.doStep2();
    }
}

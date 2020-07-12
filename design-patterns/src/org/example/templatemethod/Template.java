package org.example.templatemethod;

/**
 * Created by peiyiqiang on 2020/7/12.
 * Description:
 */
public abstract class Template {

    public void step1() {
        System.out.println("Template.step1");
    }

    public abstract void step2();

    public void step3() {
        System.out.println("Template.step3");
    }

    public final void process() {
        this.step1();

        //具体在子类中实现
        this.step2();

        this.step3();
    }
}

package org.example.templatemethod;

/**
 * Created by peiyiqiang on 2020/7/12.
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        //使用方法1
        Template t1 = new TemplateSub();
        t1.process();

        System.out.println("----");

        //使用方法2：匿名内部类
        Template t2 = new Template() {
            @Override
            public void step2() {
                System.out.println("Client.step2");
            }
        };
        t2.process();
    }
}

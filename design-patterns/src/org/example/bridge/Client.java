package org.example.bridge;

/**
 * Created by Ethan on 2020/10/08 14:37
 *
 * 桥接模式
 * Abstraction：抽象化角色，定义出该角色的行为，同时保存一个对实现化角色的引用
 * RefinedAbstraction：修正抽象化角色，引用实现化角色对抽象化角色进行修正
 * Implementor：实现化角色，它是接口或者抽象类，定义角色必需的行为和属性
 * ConcreteImplementor：具体实现化角色，实现接口或抽象类定义的方法或属性
 */
public class Client {
    public static void main(String[] args) {
        Abstraction a1 = new RefinedAbstractionA(new ConcreteImplementorA());
        Abstraction a2 = new RefinedAbstractionA(new ConcreteImplementorB());
        Abstraction a3 = new RefinedAbstractionB(new ConcreteImplementorA());
        Abstraction a4 = new RefinedAbstractionB(new ConcreteImplementorB());

        a1.request();
        a2.request();
        a3.request();
        a4.request();
    }
}

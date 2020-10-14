package org.example.mediator;

/**
 * Created by Ethan on 2020/10/14 17:48
 */
public class Client {
    public static void main(String[] args) {
        Mediator m = new ConcreteMediator();

        DepartmentA da = new DepartmentA(m);
        DepartmentB db = new DepartmentB(m);
        DepartmentC dc = new DepartmentC(m);

        da.selfAction();
        da.outAction();

        db.selfAction();
        db.outAction();

        dc.selfAction();
        dc.outAction();
    }
}
package org.example.mediator;

/**
 * Created by Ethan on 2020/10/14 17:48
 */
public class DepartmentC implements Department {

    private Mediator m;

    public DepartmentC(Mediator m) {
        this.m = m;
        this.m.register("DepartmentC", this);
    }

    @Override
    public void selfAction() {
        System.out.println("do Department C's work");
    }

    @Override
    public void outAction() {
        System.out.println("Department C needs B's support");
        m.command("DepartmentB");
    }

}
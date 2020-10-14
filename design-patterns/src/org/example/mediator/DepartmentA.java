package org.example.mediator;

/**
 * Created by Ethan on 2020/10/14 17:47
 */
public class DepartmentA implements Department {

    private Mediator m;

    public DepartmentA(Mediator m) {
        this.m = m;
        this.m.register("DepartmentA", this);
    }

    @Override
    public void selfAction() {
        System.out.println("do Department A's work");
    }

    @Override
    public void outAction() {
        System.out.println("Department A needs C's support");
        m.command("DepartmentC");
    }

}
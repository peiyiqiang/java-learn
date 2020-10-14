package org.example.mediator;

/**
 * Created by Ethan on 2020/10/14 17:47
 */
public class DepartmentB implements Department {

    private Mediator m;

    public DepartmentB(Mediator m) {
        this.m = m;
        this.m.register("DepartmentB", this);
    }

    @Override
    public void selfAction() {
        System.out.println("do Department B's work");
    }

    @Override
    public void outAction() {
        System.out.println("Department B needs A's support");
        m.command("DepartmentA");
    }

}
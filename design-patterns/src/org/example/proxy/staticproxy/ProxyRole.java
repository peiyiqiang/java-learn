package org.example.proxy.staticproxy;

/**
 * Created by peiyiqiang on 2020/7/7.
 * Description:
 */
public class ProxyRole implements Role {

    private Role role;

    public ProxyRole(Role role) {
        this.role = role;
    }

    @Override
    public void todo() {
        doBefore();

        role.todo();

        doAfter();
    }

    public void doBefore() {
        System.out.println("ProxyRole.doBefore()");
    }

    public void doAfter() {
        System.out.println("ProxyRole.doAfter()");
    }
}
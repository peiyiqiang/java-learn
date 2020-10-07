package org.example.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * Created by Ethan on 2020/10/07 15:37
 */
public class Client {
    public static void main(String[] args) {
        Role realRole = new RealRole();
        RoleHandler handler = new RoleHandler(realRole);

        Role proxy = (Role) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Role.class}, handler);

        proxy.todo();
    }
}

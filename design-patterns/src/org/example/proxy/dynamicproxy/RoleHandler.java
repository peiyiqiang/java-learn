package org.example.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Ethan on 2020/10/07 15:35
 */
public class RoleHandler implements InvocationHandler {
    Role realRole;

    public RoleHandler(Role realRole) {
        this.realRole = realRole;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().equals("todo")) {
            System.out.println("do something before method todo");
        } else if (method.getName().equals("others")) {
            System.out.println("do something for other methods");
        }

        method.invoke(realRole, args);

        if (method.getName().equals("todo")) {
            System.out.println("do something after method todo");
        }

        return null;
    }
}

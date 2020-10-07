package org.example.proxy.dynamicproxy;

/**
 * Created by peiyiqiang on 2020/7/7.
 * Description:
 */
public class RealRole implements Role {

    @Override
    public void todo() {
        System.out.println("RealRole.todo()");
    }

}

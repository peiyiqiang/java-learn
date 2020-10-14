package org.example.mediator;

/**
 * Created by Ethan on 2020/10/14 17:46
 */
public interface Mediator {

    void register(String name,Department d);

    void command(String name);

}
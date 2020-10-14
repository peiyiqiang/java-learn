package org.example.mediator;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Ethan on 2020/10/14 17:48
 */
public class ConcreteMediator implements Mediator {

    private Map<String, Department> map = new Hashtable<String, Department>();

    @Override
    public void register(String name, Department d) {
        map.put(name, d);
    }

    @Override
    public void command(String name) {
        map.get(name).selfAction();
    }

}
package org.example.flyweight;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Ethan on 2020/10/14 14:35
 */
public class FlyweightFactory {
    private static Map<String, Flyweight> map = new Hashtable<String, Flyweight>();

    public static Flyweight getFlyweight(String sharedState) {
        if(map.get(sharedState) != null) {
            return map.get(sharedState);
        } else {
            Flyweight fw = new ConcreteFlyweight(sharedState);
            map.put(sharedState, fw);
            return fw;
        }
    }
}

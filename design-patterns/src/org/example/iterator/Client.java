package org.example.iterator;

/**
 * Created by Ethan on 2020/10/14 16:20
 */
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate ca = new ConcreteAggregate();

        ca.addObject("aa");
        ca.addObject("bb");
        ca.addObject("cc");

        MyIterator iter =  ca.Iterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());

        }
    }

}

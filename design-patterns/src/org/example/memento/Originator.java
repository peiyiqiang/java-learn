package org.example.memento;

/**
 * Created by Ethan on 2020/10/15 14:26
 * 源发器类Originator
 */
public class Originator {
    private String name;
    private int age;

    public Originator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Memento memento() {
        return new Memento(this);
    }

    public void recovery(Memento m) {
        this.name = m.getName();
        this.age = m.getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
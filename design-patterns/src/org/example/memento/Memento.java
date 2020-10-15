package org.example.memento;

/**
 * Created by Ethan on 2020/10/15 14:27
 * 备忘录类Memento
 */
public class Memento {
    private String name;
    private int age;

    public Memento(Originator o) {
        this.name = o.getName();
        this.age = o.getAge();
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
package org.example.memento;

/**
 * Created by Ethan on 2020/10/15 14:28
 * 负责人类CareTaker
 */
public class CareTaker {

    private Memento memento;
    //private Stack<Memento> stack = new Stack<>();
    //private List<Memento> list = new ArrayList<>();

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
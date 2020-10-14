package org.example.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ethan on 2020/10/14 10:59
 * 容器组件
 * eg:文件夹
 */
public class Composite implements Component {

    private String name;
    private List<Component> list= new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component c) {
        list.add(c);
    }

    public void remove(Component c) {
        list.remove(c);
    }

    public Component getChild(int index) {
        return list.get(index);
    }

    @Override
    public void showInfo(int level) {
        for(int i = 0; i < level; i++) {
            System.out.print("\t");
        }

        System.out.println("Composite:" + name);

        level++;
        for (Component c : list) {
            c.showInfo(level);
        }
    }

}
package org.example.composite;

/**
 * Created by Ethan on 2020/10/14 11:08
 */
public class LeafB implements Component{

    private String name;

    public LeafB(String name) {
        this.name = name;
    }

    @Override
    public void showInfo(int level) {
        for(int i = 0; i < level; i++) {
            System.out.print("\t");
        }

        System.out.println("LeafB:" + name);
    }

}
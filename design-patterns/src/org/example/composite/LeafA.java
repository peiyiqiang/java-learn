package org.example.composite;

/**
 * Created by Ethan on 2020/10/14 11:05
 * 叶子组件A
 * eg:图片文件、文本文件
 */
public class LeafA implements Component {

    private String name;

    public LeafA(String name) {
        this.name = name;
    }

    @Override
    public void showInfo(int level) {
        for(int i = 0; i < level; i++) {
            System.out.print("\t");
        }

        System.out.println("LeafA:" + name);
    }

}

package org.example.chainofresponsibility;

/**
 * Created by Ethan on 2020/10/14 15:30
 * 请求的基本信息
 */
public class Request {
    private String name;
    private int level;

    public Request(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}

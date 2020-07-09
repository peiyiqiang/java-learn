package org.example.prototype;

import java.util.Date;

/**
 * Created by peiyiqiang on 2020/7/8.
 * Description:浅克隆
 */
public class Prototype implements Cloneable {
    private String name;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Prototype() {
    }

    public Prototype(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

package org.example.prototype;

import java.util.Date;

/**
 * Created by peiyiqiang on 2020/7/8.
 * Description:深克隆方式1：对属性也进行克隆
 */
public class Prototype2 implements Cloneable {
    private String name;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();

        //添加以下代码实现深克隆
        Prototype2 p = (Prototype2) obj;
        p.setBirthday((Date) this.getBirthday().clone());

        return obj;
    }

    public Prototype2() {
    }

    public Prototype2(String name, Date birthday) {
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

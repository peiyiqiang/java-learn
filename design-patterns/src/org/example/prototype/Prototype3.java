package org.example.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by peiyiqiang on 2020/7/8.
 * Description:深克隆方式2：通过序列化、反序列化
 */
public class Prototype3 implements Serializable {
    private String name;
    private Date birthday;

    public Prototype3() {
    }

    public Prototype3(String name, Date birthday) {
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

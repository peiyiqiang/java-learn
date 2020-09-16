package org.example.prototype;

import java.io.*;
import java.util.Date;

/**
 * Created by peiyiqiang on 2020/7/8.
 * Description:
 *
 * 1.实现Cloneable
 * 2.重写克隆方法/使用序列化反序列化
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //浅克隆
        test1();

        System.out.println("--------------");

        //深克隆方式1：对属性也进行克隆
        test2();

        System.out.println("--------------");

        //深克隆方式2：通过序列化、反序列化
        test3();
    }

    public static void test1() throws CloneNotSupportedException {
        Date date = new Date(123123123123L);

        Prototype01 p1 = new Prototype01("A", date);
        Prototype01 p2 = (Prototype01) p1.clone();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.getBirthday());
        System.out.println(p2.getBirthday());

        date.setTime(234234234234L);

        //浅克隆:指向同一个Date对象
        System.out.println(p1.getBirthday());
        System.out.println(p2.getBirthday());
    }

    public static void test2() throws CloneNotSupportedException {
        Date date = new Date(123123123123L);

        Prototype02 p1 = new Prototype02("A", date);
        Prototype02 p2 = (Prototype02) p1.clone();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.getBirthday());
        System.out.println(p2.getBirthday());

        date.setTime(234234234234L);

        //深克隆:改变Date时 p2的Date不变
        System.out.println(p1.getBirthday());
        System.out.println(p2.getBirthday());
    }

    public static void test3() throws Exception {
        Date date = new Date(123123123123L);

        Prototype03 p1 = new Prototype03("A", date);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(p1);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Prototype03 p2 = (Prototype03) ois.readObject();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.getBirthday());
        System.out.println(p2.getBirthday());

        date.setTime(234234234234L);

        System.out.println(p1.getBirthday());
        System.out.println(p2.getBirthday());
    }
}

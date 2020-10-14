package org.example.iterator;

/**
 * Created by Ethan on 2020/10/14 15:50
 */
public interface MyIterator {
    //将游标指向下一个元素
    Object next();
    //判断是否存在下一个元素
    boolean hasNext();
    //获取当前游标指向对象
    Object getCurrentObj();
}

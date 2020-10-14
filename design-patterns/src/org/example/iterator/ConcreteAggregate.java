package org.example.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ethan on 2020/10/14 16:03
 * 自定义的聚合类
 */
public class ConcreteAggregate {
    private List<Object> list = new ArrayList<Object>();

    public void addObject(Object object) {
        list.add(object);
    }

    public void removeObject(Object object) {
        list.remove(object);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public MyIterator Iterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements MyIterator {
        //游标，用于记录遍历的位置
        private int cursor;

        public ConcreteIterator() {
            cursor = 0;
        }

        @Override
        public Object next() {
            Object object = getCurrentObj();

            if (hasNext()) {
                cursor++;
            }

            return object;
        }

        @Override
        public boolean hasNext() {
            return cursor < list.size();
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }
}

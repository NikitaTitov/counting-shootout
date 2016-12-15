package com.epam.learning;

import java.util.Iterator;
import java.util.List;

public class IteratorForGame<T> implements Iterator<Object> {

    private List<T> list;
    private int position;

    public IteratorForGame(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public String toString() {
        return "IteratorForGame { " +
                "list = " + list +
                '}';
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            Object nextObj = list.get(position);
            position = position + 1;
            return nextObj;
        }
        if (!this.hasNext() && position > 0) {
            position = list.size() % 2 == 0 ? 1 : 0;
        }
        return this;
    }

    @Override
    public void remove() {
        if (this.hasNext()) {
            list.remove(position);
        } else {
            this.next();
            list.remove(position);
        }
    }
}

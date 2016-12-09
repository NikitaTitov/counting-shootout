package com.epam.learning;

import java.util.Iterator;
import java.util.List;

public class PersonIterator<String> implements Iterator<Object> {

    private List<?> person;
    private int position;

    public PersonIterator(Person person) {
        this.person = person.getPerson();
    }

    @Override
    public boolean hasNext() {
        if (position < person.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public java.lang.String toString() {
        return "PersonIterator { " +
                "person = " + person +
                '}';
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            Object nextObj = person.get(position);
            position++;
            return nextObj;
        }
        if (!this.hasNext() && position > 0) {
            position = 0;
        }
        return this;
    }

    @Override
    public void remove() {
        if (this.hasNext()){
            person.remove(position);
        }
        else {
            this.next();
            person.remove(position);
        }
    }
}

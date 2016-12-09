package com.epam.learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Person implements Iterable<String> {

    private List<String> person = new ArrayList<>();

    public Person(List person) {
        this.person = person;
    }

    public List getPerson() {
        return person;
    }

    public int getSizeListOfPersons(){
        return person.size();
    }

    @Override
    public Iterator<String> iterator() {
        return new PersonIterator(this);
    }
}

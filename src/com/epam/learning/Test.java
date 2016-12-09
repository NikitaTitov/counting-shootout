package com.epam.learning;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class Test {


    @org.junit.Test
    public void test() throws Exception {
        int evenPositionPerson = 0;
        ArrayList<String> personList = new ArrayList<>();
        personList.add("Alice");
        personList.add("Nikita");
        personList.add("Sasha");
        personList.add("Juliya");
        personList.add("Jora");
        personList.add("Zigmund");
        personList.add("Tor");
        personList.add("Leonardo");
        personList.add("Doroty");
        personList.add("Klank");
        Person person = new Person(personList);
        PersonIterator iterator = new PersonIterator(person);
        while (iterator.hasNext() || person.getSizeListOfPersons() > 1) {
            if (evenPositionPerson % 2 == 0) {
                iterator.remove();
                iterator.next();
            }
            evenPositionPerson++;
        }

        System.out.println(iterator.toString());
    }
}



package com.epam.learning;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class Test {


    @org.junit.Test
    public void test() throws Exception {
        ArrayList<String> personList = new ArrayList<>();
        personList.add("1");
        personList.add("2");
        personList.add("3");
        personList.add("4");
        personList.add("5");
        personList.add("6");
        personList.add("7");
        GameWithIterator<String> gameIterator = new GameWithIterator<>();
        gameIterator.startGame(personList);
        ArrayList<String> testPersonList = new ArrayList<>();
        testPersonList.add("4");
        assertArrayEquals(personList.toArray(),testPersonList.toArray());
    }
}



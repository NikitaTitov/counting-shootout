package com.epam.learning;


import java.util.List;

public class GameWithIterator <T> {
    public void startGame(List<T> list){
        IteratorForGame<T> iterator = new IteratorForGame<>(list);
        while (list.size() > 1) {
            iterator.remove();
            iterator.next();
        }

    }

}

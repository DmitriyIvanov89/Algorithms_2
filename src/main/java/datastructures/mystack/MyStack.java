package datastructures.mystack;

import datastructures.MyStackInterface;

import java.util.ArrayList;
import java.util.List;

public class MyStack<E> implements MyStackInterface<E> {

    private final List<E> list = new ArrayList<>();

    @Override
    public void push(E element) {
        list.add(0, element);
    }

    @Override
    public E pop() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}

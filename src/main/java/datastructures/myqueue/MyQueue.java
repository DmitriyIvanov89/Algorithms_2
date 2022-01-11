package datastructures.myqueue;

import datastructures.MyQueueInterface;
import datastructures.myarraylist.MyArrayList;

public class MyQueue<E> implements MyQueueInterface<E> {

    private final MyArrayList<E> list = new MyArrayList<>();

    @Override
    public void add(E element) {
        list.add(element);
    }

    @Override
    public E remove() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}

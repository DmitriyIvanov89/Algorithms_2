package datastructures.myarraylist;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyArrayList<E> implements MyList<E> {

    private int size;
    private int capacity;
    private final static int DEFAULT_CAPACITY = 10;
    private E[] array;

    public MyArrayList() {
        array = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        if (capacity > 0) {
            array = (E[]) new Object[capacity];
        } else if (capacity == 0) {
            array = (E[]) new Object[0];
        } else {
            throw new IllegalArgumentException("Capacity can't be < 0");
        }
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void add(int index) {

    }

    @Override
    public boolean add(E element) {
        return false;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public boolean remove(E element) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        MyList.super.forEach(action);
    }

    @Override
    public Spliterator<E> spliterator() {
        return MyList.super.spliterator();
    }
}

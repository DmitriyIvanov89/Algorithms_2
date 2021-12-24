package datastructures.myarraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyArrayList<T> implements MyList<T> {

    private long size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 16;
    private Object[] array;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public boolean remove(T element) {
        return false;
    }

    @Override
    public void set(int index, T element) {
        array[index] = element;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public Object[] toArray() {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        MyList.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return MyList.super.spliterator();
    }
}

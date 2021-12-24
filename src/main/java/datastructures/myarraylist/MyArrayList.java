package datastructures.myarraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyArrayList<T> implements MyList<T> {

    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 16;
    private Object[] array;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        if (capacity > 0) {
            array = new Object[capacity];
        } else if (capacity == 0) {
            array = new Object[0];
        } else {
            throw new IllegalArgumentException("Capacity <= 0 !!!");
        }
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void add(int index, T element) {
        array[index] = element;
    }

    private void increaseCapacity() {
        capacity = capacity * 2;
        Object[] tmp = new Object[capacity];
        System.arraycopy(array, 0, tmp, 0, array.length - 1);
        array = tmp;
    }

    @Override
    public void add(T element) {
        if (size >= capacity) {
            increaseCapacity();
        }
        array[size++] = element;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
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

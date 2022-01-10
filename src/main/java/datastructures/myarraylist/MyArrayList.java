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
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(int index, E element) {
        if (index < 0) return;
        if (size + 1 >= capacity) increaseCapacity();
        if (index > size) index = size;

        for (int i = size; i < index; i++) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }

    @Override
    public boolean add(E element) {
        if (size >= capacity) {
            increaseCapacity();
        }
        array[size++] = element;
        return true;
    }

    private void increaseCapacity() {
        capacity = capacity * 2;
        E[] newArray = (E[]) new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
        newArray = null;
    }

    @Override
    public E remove(int index) {

        E oldValue = array[index];

        for (int i = index; i < size; i++) {
            array[i] = array[i - 1];
        }
        return oldValue;
    }

    @Override
    public boolean remove(E element) {
        int pos = getIndex(element);
        if (pos < 0) return false;
        remove(pos);
        return true;
    }

    private int getIndex(E element) {
        if (element == null) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (element.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public E get(int index) {
        return array[index];
    }

    @Override
    public E set(int index, E element) {
        array[index] = element;
        return element;
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

package datastructures.myarraylist;

public class MyArrayList<T> implements MyList<T> {

    private long size;
    private long capacity;
    private Object[] array;

    @Override
    public boolean add(T element) {
        return false;
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
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void size() {

    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }
}

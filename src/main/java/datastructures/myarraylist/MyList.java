package datastructures.myarraylist;

public interface MyList<T> extends Iterable<T> {

    public T get(int index);

    public void add(int index, T element);

    public void add(T element);

    public void clear();

    public boolean isEmpty();

    public T remove(int index);

    public boolean remove(T element);

    public void set(int index, T element);

    public int size();

    public Object[] toArray();

}

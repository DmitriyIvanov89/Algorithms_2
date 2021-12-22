package datastructures.myarraylist;

public interface MyList<T> {

    public boolean add(T element);

    public void add(int index, T element);

    public void clear();

    public boolean isEmpty();

    public T remove(int index);

    public boolean remove(T element);

    public T set(int index, T element);

    public void size();

    public Object[] toArray();

}

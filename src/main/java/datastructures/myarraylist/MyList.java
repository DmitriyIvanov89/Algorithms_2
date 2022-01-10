package datastructures.myarraylist;

public interface MyList<E> extends Iterable<E> {

    int size();

    boolean isEmpty();

    void add(int index, E element);

    boolean add(E element);

    E remove(int index);

    boolean remove(E element);

    E get(int index);

    E set(int index, E element);

    void clear();

    Object[] toArray();

}

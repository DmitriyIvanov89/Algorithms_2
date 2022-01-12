package datastructures.myqueue;

import datastructures.myinterfaces.MyQueueInterface;
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

    /**
     * private static void testQueue() {
        MyQueueInterface<Integer> myQueue = new MyQueue<>();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            myQueue.add(i);
        }

        System.out.println("-----");

        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.remove());
        }
    }
     */
}

package datastructures.mystack;

import datastructures.MyStackInterface;

import java.util.ArrayList;
import java.util.List;

public class MyStack<E> implements MyStackInterface<E> {

    private final List<E> list = new ArrayList<>();

    @Override
    public void push(E element) {
        list.add(0, element);
    }

    @Override
    public E pop() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /*
     * private static void testStack() {
     *         MyStackInterface<Integer> myStack = new MyStack<>();
     *         for (int i = 0; i < 10; i++) {
     *             myStack.push(i);
     *             System.out.println(i);
     *         }
     *
     *         System.out.println("-----");
     *
     *         while (!myStack.isEmpty()) {
     *             System.out.println(myStack.pop());
     *         }
     *     }
     */
}

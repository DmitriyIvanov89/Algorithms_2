package algorithms.training;

import datastructures.MyQueueInterface;
import datastructures.MyStackInterface;
import datastructures.myarraylist.MyArrayList;
import datastructures.MyList;
import datastructures.myqueue.MyQueue;
import datastructures.mystack.MyStack;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;


public class Training {
    public static void main(String[] args) {

    }

    private static void testQueue() {
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

    private static void testStack() {
        MyStackInterface<Integer> myStack = new MyStack<>();
        for (int i = 0; i < 10; i++) {
            myStack.push(i);
            System.out.println(i);
        }

        System.out.println("-----");

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }


    }
}

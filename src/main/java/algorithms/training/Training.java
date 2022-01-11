package algorithms.training;

import datastructures.myarraylist.MyArrayList;
import datastructures.MyList;
import datastructures.myqueue.MyQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class Training {
    public static void main(String[] args) {
        testQueue();
    }

    private static void testQueue() {
        MyQueue<Integer> myQueue = new MyQueue<>();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            myQueue.add(i);
        }

        System.out.println("-----");

        while (!myQueue.isEmpty()) {
            myQueue.remove();
        }
    }
}

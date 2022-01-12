package algorithms.tree;

import datastructures.myqueue.MyQueue;
import datastructures.mystack.MyStack;

public class TreeTest {
    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insertNode(20);
        tree.insertNode(28);
        tree.insertNode(9);
        tree.insertNode(6);
        tree.insertNode(4);
        tree.insertNode(7);
        tree.insertNode(40);
        tree.insertNode(38);
        tree.insertNode(52);
        tree.insertNode(35);
        tree.insertNode(31);
        tree.insertNode(28);
    }

    public static Node wildSearch(Node root) {
        MyQueue<Node> myQueue = new MyQueue<>();
        if (root != null) {
            Node currNode = myQueue.remove();
            if (currNode.getRightChild() != null) {
                myQueue.add(currNode.getRightChild());
            }
            if (currNode.getLeftChild() != null) {
                myQueue.add(currNode.getLeftChild());
            }
        }
        return myQueue.remove();
    }

    public static Node deepSearch(Node root) {
        MyStack<Node> myStack = new MyStack<>();
        if (root != null) {
            myStack.push(root);

            while (!myStack.isEmpty()) {
                Node currNode = myStack.pop();
                if (currNode.getRightChild() != null) {
                    myStack.push(currNode.getRightChild());
                }
                if (currNode.getLeftChild() != null) {
                    myStack.push(currNode.getLeftChild());
                }

            }
        }
        return myStack.pop();
    }
}

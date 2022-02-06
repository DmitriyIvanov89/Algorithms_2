package algorithms.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTest {
    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insertNode(20);
        tree.insertNode(28);
        tree.insertNode(9);
        tree.insertNode(6);
        tree.insertNode(4);
        tree.insertNode(7);


    }

    private static void traverseDeep(Tree tree) {
        Stack<Node> stack = new Stack<>();
        Node currNode = tree.getRoot();
        stack.push(currNode);
        while (!stack.isEmpty()) {
            currNode = stack.pop();
            if (currNode != null) {
                if (currNode.getRightChild() != null) {
                    stack.push(currNode.getRightChild());
                }
                if (currNode.getLeftChild() != null) {
                    stack.push(currNode.getLeftChild());
                }
            }
        }
    }

    private static void traverseWide(Tree tree) {
        Queue<Node> queue = new LinkedList<>();
        Node currNode = tree.getRoot();
        queue.add(currNode);
        while (!queue.isEmpty()) {
            currNode = queue.remove();
            if (currNode != null) {
                if (currNode.getRightChild() != null) {
                    queue.add(currNode.getRightChild());
                }
                if (currNode.getLeftChild() != null) {
                    queue.add(currNode.getLeftChild());
                }
            }
        }
    }

    private static void testRec(Node root) {
        if (root != null) {
            if (root.getLeftChild() != null) {
                testRec(root.getLeftChild());
            }
            if (root.getRightChild() != null) {
                testRec(root.getRightChild());
            }
        }
    }
}

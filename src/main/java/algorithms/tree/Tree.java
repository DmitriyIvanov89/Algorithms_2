package algorithms.tree;

/**
 * Tree tree = new Tree();
 *
 *         tree.insertNode(20);
 *         tree.insertNode(28);
 *         tree.insertNode(9);
 *         tree.insertNode(6);
 *         tree.insertNode(4);
 *         tree.insertNode(7);
 *         tree.insertNode(40);
 *         tree.insertNode(38);
 *         tree.insertNode(52);
 *         tree.insertNode(35);
 *         tree.insertNode(31);
 *         tree.insertNode(28);
 */

public class Tree {

    private Node root;

    public Tree() {
        this.root = null;
    }

    public void insertNode(int value) {
        Node newNode = new Node();
        newNode.setValue(value);
        if (root == null) {
            root = newNode;
        }
        Node currNode = root;
        Node parentNode;
        while (true) {
            parentNode = currNode;
            if (value == currNode.getValue()) {
                return;
            }
            if (value < currNode.getValue()) {
                currNode = currNode.getLeftChild();
                if (currNode == null) {
                    parentNode.setLeftChild(newNode);
                    return;
                }
            } else {
                currNode = currNode.getRightChild();
                if (currNode == null) {
                    parentNode.setRightChild(newNode);
                    return;
                }
            }
        }
    }

    public Node findNodeByValue(int value) {
        Node currNode = root;
        while (currNode.getValue() != value) {
            if (value < currNode.getValue()) {
                currNode = currNode.getLeftChild();
            } else {
                currNode = currNode.getRightChild();
            }
            if (currNode == null) {
                return null;
            }
        }
        return currNode;
    }
}

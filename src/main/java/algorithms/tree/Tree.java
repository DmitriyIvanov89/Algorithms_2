package algorithms.tree;

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

}

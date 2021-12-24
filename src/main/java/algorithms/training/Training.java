package algorithms.training;

import algorithms.tree.Tree;
import datastructures.myarraylist.MyArrayList;
import datastructures.myarraylist.MyList;

import java.util.ArrayList;
import java.util.List;


public class Training {
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

        System.out.println(tree.findNodeByValue(20));

        List<String> list = new ArrayList<>();
        MyList<String> myList = new MyArrayList<>();

    }
}

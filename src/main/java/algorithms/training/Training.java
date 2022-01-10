package algorithms.training;

import algorithms.tree.Tree;
import datastructures.myarraylist.MyArrayList;
import datastructures.myarraylist.MyList;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Training {
    public static void main(String[] args) {

        MyList<String> myList = new MyArrayList<>();

        System.out.println(myList.size());
        System.out.println(myList.isEmpty());

        myList.add("Oleg");
        myList.add("Anton");
        myList.add("Grigori");

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }

        myList.remove(1);
        System.out.println();

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }


    }
}

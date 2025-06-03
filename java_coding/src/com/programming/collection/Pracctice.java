package com.programming.collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.TreeSet;

public class Pracctice {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2.5);
        arrayList.add(1);
        arrayList.add(null);
        arrayList.add(null);

        System.out.println(arrayList);

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2.5);
        linkedList.add(1);
        linkedList.add(null);
        linkedList.add(null);
        System.out.println(linkedList);

//
//        TreeSet treeSet = new TreeSet();
//        treeSet.add(1);
//        treeSet.add(2.5);
//        treeSet.add(1);
//        treeSet.add(null);
//        treeSet.add(null);
//        System.out.println(treeSet);

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1,1);
        linkedHashMap.put(2 ,2.5);
        linkedHashMap.put(3, 1);
        linkedHashMap.put(4,null);
        linkedHashMap.put(8,null);
        linkedHashMap.put(12 ,2.5);
        linkedHashMap.put(33, 1);
        linkedHashMap.put(14,null);
        linkedHashMap.put(01,null);
        System.out.println(linkedHashMap);

    }
}

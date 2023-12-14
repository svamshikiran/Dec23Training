package com.examples.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(23);
        set.add(19);
        set.add(8);

        set.forEach(System.out::println);

        Set<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(12);
        linkedSet.add(23);
        linkedSet.add(19);
        linkedSet.add(8);
        System.out.println("-----------------");
        linkedSet.forEach(System.out::println);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(12);
        treeSet.add(23);
        treeSet.add(19);
        treeSet.add(8);
        System.out.println("-----------------");
        treeSet.forEach(System.out::println);
    }
}

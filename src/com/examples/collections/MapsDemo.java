package com.examples.collections;

import java.util.*;

public class MapsDemo {
    public static void main(String[] args) {

        Map<Integer, Student> studentMap = new HashMap<>();
        Map<Integer, Student> studentLinkedMap = new LinkedHashMap<>();
        Map<Integer, Student> studentTreeMap = new TreeMap<>();

        studentTreeMap.put(1, new Student(12, "TESTONE", 93.8));
        studentTreeMap.put(4, new Student(13, "TESTTWO", 99));
        studentTreeMap.put(2, new Student(14, "TESTTHREE", 98.7));
        studentTreeMap.put(3, new Student(15, "TESTFOUR", 92));

        Set<Integer> keySet = studentTreeMap.keySet();

        keySet.forEach(key-> System.out.println(studentTreeMap.get(key).getRollno()));


    }
}

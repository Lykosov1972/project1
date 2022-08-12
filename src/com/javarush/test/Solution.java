package com.javarush.test;


import java.util.*;


public class Solution {
    public static HashMap<Date, String> list = new HashMap<>();
    public static void main(String[] args) {
     Solution solution = new Solution();
     Project project = new Project(new HashMap<Integer, String>());
     list.put(project.dateTime, project.name);
        System.out.println("dateTime           name");
        for (Date id : list.keySet()) {
            System.out.println("  " + id + "     " + list.get(id));
        }
    }

}




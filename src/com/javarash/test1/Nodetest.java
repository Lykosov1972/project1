package com.javarash.test1;

import org.w3c.dom.*;

public class Nodetest {
    private Node first = new Node();
    private Node last = new Node();

    public Nodetest() {
        first.next = last;
        last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public static class Node {
        private Node prev;
    //    private String value;
        private Node next;
        private String value;
    }
}
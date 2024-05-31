package org.example.linkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast("a");
        linkedList.addLast("b");
        linkedList.addLast("c");
        linkedList.addLast("d");

        linkedList.deleteNodeAt(1);
        linkedList.printLinkedList();
    }
}

package org.example.linkedList;

public class LinkedList {
    Node head;

    public void addLast(String data){
        Node currentNode = new Node();
        currentNode.data = data;
        currentNode.next = null;

        if(head == null){
            head = currentNode;
        }else{
            Node n = head;
            while (n.next != null){
                n = n.next;
            }
            n.next = currentNode;
        }
    }

    public void printLinkedList(){
        Node n = head;
        while (n.next != null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    public void insertAtStart(String data){

        Node currentNode = new Node();
        currentNode.data = data;
        currentNode.next = head;
        head = currentNode;
    }


    public void insertAtIndex(int index, String data) {
        Node currentNode = new Node();
        currentNode.data = data;
        currentNode.next = null;

        if (index == 0) {
            insertAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            currentNode.next = n.next;
            n.next = currentNode;
        }
    }


    public void deleteNodeAt(int index){
        Node n = head;
        if(index == 0){
            head = n.next;
        }else{
            for(int i=0; i<index-1; i++){
                n = n.next;
            }
            Node n1 = new Node();
            n1 = n.next;
            n.next = n1.next;
            System.out.println("deleted node is:"+n1.data);
        }
    }

}

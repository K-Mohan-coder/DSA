package DSA;
import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;  // corrected parameter name
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void insertAtMiddle(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            throw new IllegalArgumentException("Position is out of bounds.");
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
 // Delete Operations
    public void deleteFromBeginning() {
            if (head == null)
                return;
            head = head.next;
        }
    
 // Deletion from the end of the linked list
    public void deleteFromEnd() {
        if (head == null || head. next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }
    
 // Deletion from the middle of the linked list
    public void deleteFromMiddle (int position) {
        if (position == 0 || head == null) {
            if (head != null)
                head = head.next;
            return;
        }
        Node current = head;
        for (int i = 0; i < position && current.next != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null)
            throw new IllegalArgumentException("Position is out of bounds");
        current.next = current.next.next;
    }
}

public class LinkedListss {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        System.out.println("Adding Data in Linked List");
        // Adding nodes
        list.insertAtBeginning(1);
        list.insertAtEnd(4);
        list.insertAtMiddle(2, 1);
        list.insertAtMiddle(3, 2);
        list.insertAtBeginning(0);
        list.insertAtEnd(5);

        // Printing list
        list.printList();  // Output: 0 1 2 3 4 5
        
        System.out.println("Deleting Data in Linked List");
        
        list.deleteFromBeginning();
        list.deleteFromEnd();
        list.deleteFromMiddle(2);
        list.printList();

    }
}

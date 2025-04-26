package DSA;

import java.util.*;


class Node{
	int data;
	Node Prev;
	Node next;
	
	
	public Node(int data) {
		super();
		this.data = data;
		this.Prev = null;
		this.next = null;
	}
	
}

class DoublyLindkedList{
	Node head;
	public DoublyLindkedList() {
		this.head=null;
		
	}
	
	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head.Prev = newNode;
			head = newNode;
			
		}
	}
	
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			Node current = head;
			while (current.next != null) {
			    current = current.next;
			}
			current.next = newNode;
			newNode.Prev = current;
		}
	}
	
	public void display() {
	    Node current= head;
	    while (current != null) {
	        System.out.print(current.data + " ");
	        current = current.next;
	    }
	    System.out.println();
	}
	
	public  Node search(int value) {
	    Node current = head;
	    while (current != null) {
	        if (current.data == value) {
	            return current;
	        }
	        current = current.next;
	    }
	    return null; // Node not found
	}
	
	
}



public class DoubleLinkedListprgs {
	
	public static void main(String args[]) {
		
	}

}

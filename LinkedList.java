public class LinkedList {

	// node class
	static class Node{
		int data;
		Node next;
		
		// constructor
		Node(int data){
			this.data = data;
		}
	}
	
	// initialization
	static Node head;
	static int listItems;	
	static int listSize = 10;
	
	// is empty
	boolean isEmpty() { return (listItems==0); }
	
	// is full
	boolean isFull() { return (listItems==listSize); }
	
	// append an item
	void append(int data) {
		// checking if list if full or not
		if(isFull()) return;
		// create new node
		Node newNode = new Node(data);
		// checking head and set new node the head if null
		if(head==null) {
			head = newNode;
			return;
		}
		// set initial current node value
		Node currentNode = head;
		// finding the tail node
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		// set new node to the tail node next value
		currentNode.next = newNode;
		// node counter
		listItems++;
	}
	
	// prepend item
	void prepend(int data) {
		if(isFull()) return;
		// create new node
		Node newNode = new Node(data);
		// set head to the new node next value
		newNode.next = head;
		head = newNode;
		// node counter
		listItems++;
	}
	
	// remove list item
	void remove(int data) {
		// checking head data
		if(head.data==data) {
			head = head.next;
			listItems--;
			return;
		}
		
		// set initial node
		Node current = head;
		// finding the node to be deleted
		while(current.next != null) {
			if(current.next.data==data) {
				current.next = current.next.next;
				listItems--;
				return;
			}
			current = current.next;
		}
	}
	
	// traverse
	void traverse() {
		Node current = head;
		while(current != null) {
			System.out.println(current+" -- "+current.data+" -- "+current.next);
			current = current.next;
		}
	}

}

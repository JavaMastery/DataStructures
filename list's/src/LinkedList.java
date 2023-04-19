
public class LinkedList {
	/*
	 * Initially it is null at the point of object creation to the LinkedList class. 
	 * Later on, while adding the nodes to the list, the very first node is assigned to head.
	 */
	Node head;
	/*
	 * This add method accepts a data and creates a new node.
	 * This new node is assigned with the data from method parameter.
	 * If the head is null, that means list is empty, so the node is made as head
	 * Else if the head not null, then we traverse to end the of the list,
	 * where the address of the next node that is next variable is null and link the current node to that node. 
	 */
	public void add(int data) {
		// Creating a node, by making an instance of Node class.
		Node node = new Node();
		// Binding the data to the data variable of node.
		node.data = data;
		/*
		 * Making this as null, as we link this node at end and we make it as tail of list,
		 * So it does not point to any other node.
		 */ 
		node.next = null;
		// Checking if the head is null. If, the head is null, that means there are no nodes in the list
		if(head==null) {
			// Making the current node as head as it is the first node to enter the list.
			head=node;
		}
		/*
		 * I the head isn't null, that means this list contains some node.
		 * So we link the node at the end of the list.
		 */
		else {
			// Referring the head node to the variable n to use it in traversing.
			Node n = head;
			/*
			 * Using while loop to check, weather the next variable of node is null  or not.
			 * If the next of node is null, that means it's the last node and we will link current node to it.
			 */
			while(n.next!=null) {
				n=n.next;
			}
			// "n" is the last node and "node" is the current node.
			n.next = node;
		}
	}
	/*
	 * This method accepts a integer data as index.
	 * Deletes the node of that specific index.
	 */
	public void remove(int index) {
		if(index==0) {
			/*
			 * If the index is 0, that  means user wants to remove the first element.
			 * So, we call the remove first method.
			 * If you don't want to use this removeFirst() method, 
			 * then use "head = head.next;" to remove first line.
			 */
			removeFirst();
		}
		else {
			// Referring the head node to the variable n to use it in traversing.
			Node n = head;
			// Creating an n1 object of Node class for the purpose of swapping.
			Node n1 = null;
			//This loop iterates until the it reaches the node before the element node to be deleted.
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			/*
			 * Now that n is the before node of the element node.
			 * Here we are assigning n.next( node to be deleted) to the n1.
			 */
			n1 = n.next;
			// Now "n1" is the next node to the node to be deleted.
			n1 = n1.next;
			/*
			 * Now that "n" is the previous node of the node to be deleted.
			 * And "n1" is the next node to the node to be deleted.
			 * Since, we are referring the address of the next node of the node to be deleted to the previous
			 * node of the node to be deleted, the current node we want to delted will be went to garbage collection.
			 */
			n.next = n1;
		}
	}
	// this method removes the first element of the list
	public void removeFirst() {
		/* 
		 * Assigning Node which is next to head as a head.
		 * That means the current head is released for garbage collection.
		 * Which in turn removes the first element.
		 */
		head = head.next;
	}
	/*
	 * Displays the list by traversing from head to the tail.
	 */
	public void list() {
		Node n = head;
		do{
			System.out.print(n.data+" ");
			n = n.next;
		}
		while(n!=null);
	}
}

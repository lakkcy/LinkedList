public class LinkedList{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	//Linked List Insertion Starts
	
	//Insertion in beginning
	
	public void insertAtBeg(int d){
		Node temp = new Node(d);
		temp.next = head;
		head= temp;
	}
	//Insertion in the middle
	
	public void insertInMiddle(Node prev_node, int d){
		Node temp = new Node(d);
		temp.next = prev_node.next;
		prev_node.next = temp;
	}

	// Insert at the end
	
	public void insertAtEnd(int d){
		Node temp = head;
		Node temp2 = new Node(d);
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = temp2;
		temp2.next = null;
	}
	//Linked List Insertion Ends

	// Linked List Deletion Begins
	
	// Deleting a key
	public void deleteAKey(int d){
		Node temp = head, prev = null;
		
		// if key is found at the beginning
		if(temp != null && temp.data == d){
			head = head.next;
			return;
		}
		
		while(temp!=null && temp.data != d){
			prev = temp;
			temp = temp.next;
			
		}
		if(temp == null) return;
		prev.next = temp.next;
	}

	public void deleteAtPosition(int pos){
		int next = 0;
		Node temp = head, prev = null;
		while(pos != next){
			prev = temp;
			temp = temp.next;
			next++;
		}
		if(temp == null) return;
		prev.next = temp.next;
	}	
	// Linked List Deletion Ends

	// Finding the length of linked list
	// iterative
	
	public int LinkedListLenIterative(){
		int count = 0;
		Node temp = head;
		while(temp != null){
			temp = temp.next;
			count++;
		}
		return count;
	}
	// recursive
	public int linkedListLenRecursive(Node node){
		if(node == null) return 0;
		else return 1 + linkedListLenRecursive(node.next);
	}
	public void printList(){
		Node temp = head;
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;	
		}
	}
	
	public static void main(String args[]){
		LinkedList llist = new LinkedList();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		llist.head.next = second;
		second.next = third;
		third.next = null;
		llist.printList();
		System.out.println("******Inserting in the beginnning******");
		llist.insertAtBeg(0);
		llist.printList();
		System.out.println("******Inserting in the middle*********");
		llist.insertInMiddle(second, 20);
		llist.printList();
		System.out.println("******** Inserting at the end*********");
		llist.insertAtEnd(5);
		llist.printList();
		System.out.println("*********Deleting a Key************");
		llist.deleteAKey(3);
		llist.printList();
		System.out.println("*********Deleting at a position**********");
		llist.deleteAtPosition(2);
		llist.printList();
		int count = llist.LinkedListLenIterative();
		System.out.println("Length of linked list is = "+ count);
		count = llist.linkedListLenRecursive(llist.head);
		System.out.println("Lenght of the linked list is = " + count);
	}
}

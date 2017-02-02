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
		
	}
}

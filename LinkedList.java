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

	//Insertion in the end
	
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
	}
}

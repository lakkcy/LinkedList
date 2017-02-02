class LinkedList{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
		}
	}

	public void printList(){
		Node n = head;
		while(n != null){
			System.out.println("--> " + n.data);
			n = n.next;
		}
	}

	public void pushInFront(int data){
		Node new_data = new Node(data);
		new_data.next = head;
		head = new_data;
		printList();
	}

	public void pushAtEnd(int data){
		Node new_node = new Node(data);
		new_node.next = null;
		
		if(head == null){
			head = new Node(data);
			return;
		}
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = new_node;
		printList();
		
	}
	
	public void pushInMiddle(Node n, int data){
		if(n == null){
			System.out.println("The given node cannot be null");
			return;
		}
	
		Node next_node = new Node(data);
		next_node.next = n.next;
		n.next = next_node;
		printList();
	}  

	public static void main(String[] args){
		LinkedList llist = new LinkedList();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
	
		llist.head.next = second;
		second.next = third;
		third.next = null;
		llist.printList();
		//llist.pushInFront(0);
		//llist.pushAtEnd(4);
		llist.pushInMiddle(llist.head.next, 100);
	}
}

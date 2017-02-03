public class LinkedList{
	Node head;
	Node head1;
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

	// swap a linkedlist
	public void swapLinkedList(int a , int b){
		// if a and b are same data
		if(a == b) return;
		Node tempx = head, prev_x = null, tempy = head, prev_y = null;
		while(tempx != null && tempx.data != a){
			prev_x = tempx;
			tempx = tempx.next;
		}
		while(tempy != null && tempy.data != b){
			prev_y = tempy;
			tempy = tempy.next;
		}

		if(tempy == null || tempx == null){
			return;
		}
		// if x is not the head
		if(prev_x != null){
			prev_x.next = tempy;
		}
		else head = tempy;

		// if y is not the head
		if(prev_y != null){
			prev_y.next = tempx;
		}
		else head = tempx;
		Node temp = tempx.next;
		tempx.next = tempy.next;
		tempy.next = temp;
	}

	public void swapping(int a, int b){

		if(a == b) return;

		Node prevx = null, currx = head, prevy = null, curry = head;

		while(currx.data != a && currx != null){
			prevx = currx;
			currx = currx.next;
		}

		while(curry.data != b && curry != null){
			prevy = curry;
			curry = curry.next;
		}

		if(curry == null || currx == null){
			return;
		}
		// if a is not at head;
		if(prevx != null){
			prevx.next = curry;
		}
		else head = curry;
		if(prevy != null){
			prevy.next = currx;
		}
		else head = currx;
		Node temp = currx.next;
		currx.next = curry.next;
		curry.next = temp;
	}

	// Reverse a linked list
	public void reverseLinkedList(){
		Node prev = null, current = head, next = null;
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	public void printList(Node node){
		Node temp = node;
		while(temp != null){
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String args[]){
		LinkedList llist = new LinkedList();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		llist.head1 = new Node(100);
		Node ll2 = new Node(101);
		Node ll3 = new Node(102);
		Node ll4 = new Node(103);
		Node ll5 = new Node(104);
		Node ll6 = new Node(105);
		Node ll7 = new Node(106);
		llist.head1.next = ll2;
		ll2.next = ll3;
		ll3.next = ll4;
		ll4.next = ll5;
		ll5.next = ll6;
		ll6.next = ll7;
		ll7.next = null;
		llist.head.next = second;
		second.next = third;
		third.next = null;
		llist.printList(llist.head);
		System.out.println("******Inserting in the beginnning******");
		llist.insertAtBeg(0);
		llist.printList(llist.head);
		System.out.println("******Inserting in the middle*********");
		llist.insertInMiddle(second, 20);
		llist.printList(llist.head);
		System.out.println("******** Inserting at the end*********");
		llist.insertAtEnd(5);
		llist.insertAtEnd(6);
		llist.insertAtEnd(7);
		llist.insertAtEnd(8);
		llist.insertAtEnd(9);
		llist.insertAtEnd(10);
		llist.insertAtEnd(11);
		llist.insertAtEnd(12);
		llist.insertAtEnd(13);
		llist.insertAtEnd(14);
		llist.printList(llist.head);
		System.out.println("*********Deleting a Key************");
		llist.deleteAKey(3);
		llist.printList(llist.head);
		System.out.println("*********Deleting at a position**********");
		llist.deleteAtPosition(2);
		llist.printList(llist.head);
		int count = llist.LinkedListLenIterative();
		System.out.println("Length of linked list is = "+ count);
		count = llist.linkedListLenRecursive(llist.head);
		System.out.println("Lenght of the linked list is = " + count);
		System.out.println("*************Swapping the numbers 0 and 5*************");
		llist.swapLinkedList(0,5);
		llist.swapping(5,14);
		llist.printList(llist.head);
		System.out.println("************Reversing a Linked List***************");
		llist.reverseLinkedList();
		llist.printList(llist.head);
		System.out.println("**************Printing out second linked list***************");
		llist.printList(llist.head1);
	}
}

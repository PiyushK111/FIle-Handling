package collection;

import java.util.LinkedList;

public class Linklist {
	Node head= null;
	class Node{
		int data;
		Node next;
		Node(int d){
			data= d;
			next =null;
		}
		
			
		}
	public void add(int value) {
		Node new_node =new Node(value);
		new_node.next=head;
		head = new_node;
	}
	public void printList() {
		Node tnode=head;
		while (tnode!=null) {
			System.out.println(tnode.data+" ");
			tnode=tnode.next;
		}
	}
	public void append(int value) {
		Node n1 = new Node(value);
		if (head==null) {
			head =new Node(value);
			return;
		}
		n1.next=null;
		Node Last = head;
		while ( Last.next !=null) {
			Last= Last.next;
		}
			Last.next=n1;
		return;
	}
	public static void main(String[] args) {
		Linklist l2 =new Linklist();
		
		   l2.add(6); l2.add(5); l2.add(3);
		 //	l2.printList();
		l2.append(2);
		l2.append(3);
		l2.append(4);
	//	LinkedList l1 = new LinkedList();
		//l1.add(5);
		l2.printList();
		
	}
}


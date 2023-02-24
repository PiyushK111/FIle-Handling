package collection;

public class SelfLink {
	Node head = null;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
			next = null;
		}
	}

	public void push(int value) {
		Node n1 = new Node(value);
		n1.next = head;
		head = n1;
		return;
	}

	public void append(int value) {
		Node n1 = new Node(value);
		if (head == null) {
			head = new Node(value);
			return;
		}
		n1.next = null;
		Node Last = head;
		while (Last.next != null) {
			Last = Last.next;
		}
		Last.next = n1;
		return;
	}

	public void print() {
		Node tnode = head;
		while (tnode != null) {
			System.out.println(tnode.data + " ");
			tnode = tnode.next;
		}
		return;
	}

	public void delete(int value) {
		Node tnode = head;
		Node Prenode = head;
		if (head.data == value) {
			head.next = head;
			return;
		}

		while (tnode.data != value) {
			tnode = tnode.next;
		}
		if (tnode.data == value) {
			while (Prenode.next != tnode) {
				Prenode = Prenode.next;
			}
			Prenode.next = tnode.next;

		} else if (tnode.data != value) {
			System.out.println("Value not in Linked List");
		}
		return;

	}

	public static void main(String[] args) {
		SelfLink l1 = new SelfLink();
		l1.append(3);
		l1.append(5);
		l1.append(4);
		l1.push(6);
		l1.push(2);
		l1.push(1);
		// l1.print();
//	l1.delete(3);
		l1.delete(5);
		// .delete(2);
		l1.print();
		int Length = l1.LengthNR();
		System.out.println("Length of the list non recursivly counted is :" + Length);
		int len = l1.LengthRR();
		System.out.println("Length of the list recursivly counted is: " + len);
	}

	private int LengthRR() {
		// TODO Auto-generated method stub
		return getcountRR(head);
	}

	private int getcountRR(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return 0;
		} else {
			return 1 + getcountRR(node.next);
		}

	}

	private int LengthNR() {
		// TODO Auto-generated method stub
		Node tnode = head;
		int count = 0;
		while (tnode != null) {
			tnode = tnode.next;
			++count;
		}
		return count;
	}
}

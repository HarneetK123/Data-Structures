package ds.singlyLinkedList;

public class SinglyLinkedList {
	private Node first;
	//private Node last;
	
	public SinglyLinkedList(){
		
	}
	
	public boolean isEmpty(){
		return (first == null);
	}
	
	//insertion at the beginning
	public void insertFirst(int d){
		Node n = new Node();
		n.data=d;
		n.next = first;
		first = n;
		//last = n;
	}
	
	public Node deleteFirst(){
		Node temp = first;
		first = first.next;
		
		return temp;
	}
	
	public void displayList(){
		System.out.println("List (first --> last) ");
		Node current = first;
		while(current != null){
			current.displayNode();
			current = current.next;
		}
		
	}
	
	public void insertLast(int d){
		
		Node current=first;
		while(current.next!=null){
			current = current.next;
		}
		
		Node newNode = new Node();
		newNode.data = d;
		current.next = newNode;
	}
	
}

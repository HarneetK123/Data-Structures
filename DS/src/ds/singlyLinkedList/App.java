package ds.singlyLinkedList;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList myList = new SinglyLinkedList();
		
		myList.insertFirst(34);
		myList.insertFirst(65);
		myList.insertFirst(88);
		myList.insertFirst(12);
		myList.insertFirst(22);
		myList.insertLast(44444);
		
		myList.displayList();

	}

}

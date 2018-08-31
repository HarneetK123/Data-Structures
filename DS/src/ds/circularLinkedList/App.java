package ds.circularLinkedList;



public class App {

	public static void main(String[] args) {
		CircularLinkedList myList = new CircularLinkedList();
		
		myList.insertFirst(34);
		myList.insertFirst(65);
		myList.insertFirst(88);
		myList.insertFirst(12);
		myList.insertFirst(22);
		myList.insertLast(44444);
		
		myList.displayList();
	}

}

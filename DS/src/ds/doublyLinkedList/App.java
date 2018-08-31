package ds.doublyLinkedList;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList theList = new DoublyLinkedList();
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(65);
		theList.insertFirst(33);
		theList.insertLast(55);
		theList.displayForward();
		theList.displayBackward();

		theList.insertAfter(65, 77);
		theList.displayForward();
		theList.deleteFirst();
		theList.deleteKey(11);
		theList.displayForward();
	}

}

package ds.queue;

public class App {

	public static void main(String args[]) {
		Queue q = new Queue(5);
		
		q.insert(100);
		q.insert(232);
		q.insert(34);
		q.insert(12);
		q.insert(67);
		q.insert(54);
		q.view();
	}
}

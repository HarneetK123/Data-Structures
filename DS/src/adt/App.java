package adt;

public class App {

	public static void main(String[] args) {
		Counter c=new Counter("mycounter");
		c.increment();
		c.increment();
		c.increment();
		c.increment();
		
		System.out.println(c.getCurrentValue());

	}

}

package adt;

public class Counter {
	private String name=null;
	private int counter = 0;
	
	Counter(String str){
		name =str;
		
	}
	
	public void increment(){
		this.counter++;
	}
	
	public int getCurrentValue(){
		return this.counter;
		
	}
	
	public String toString(){
		
		return name + ": "+ counter;
		
	}

}

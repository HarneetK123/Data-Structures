package ds.stack;



public class Stack {
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public Stack(int size){
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1;
	}
	
	public void push(char j){
		if(isFull()){
			System.out.println("The stack is already full");
		}
		else{
		top++;
		stackArray[top] = j;
		}
	}
	
	public char pop(){
		if(isEmpty()){
			System.out.println("This stack is empty");
			return '0';
		}
		else
		{
		int oldTop= this.top;
		top--;
		return stackArray[oldTop];
		}
	}
	
	public char peak(){
		return stackArray[top];
	}

	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == maxSize-1);
	}
}

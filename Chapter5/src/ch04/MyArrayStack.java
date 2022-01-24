package ch04;

import ch02.MyArray;

public class MyArrayStack {
	
	// Array Stack 
	int top; // 자동으로 초기화가 된다 int 라서 0으로 
	MyArray arrayStack;
	
	public MyArrayStack() {
		top=0;
		arrayStack=new MyArray();
	}
	
	public MyArrayStack(int size) {
		top=0;
		arrayStack=new MyArray(size);
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("stack is full");
			return ;
		}
		
		arrayStack.addElement(data);
		top++;		
	}
	
	public int pop() {
		if(top==0) {
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.removeElement(--top); // top은 index 보다 1 크므로 먼저 감소시킨다.
	}
	
	public int getSize() {
		return top;
	}
	
	
	public boolean isFull() {
		if(top==arrayStack.ARRAY_SIZE)
			return true;
		return false;
	}
	
	public boolean isEmpty() {
		if(top==0)
			return true;
		else return false;
	}
	
	public void printAll() {
		arrayStack.printAll();		
	}
	
	

}

package ch05;

import ch03.MyLinkedList;
import ch03.MyListNode;

public class MyListQueue extends MyLinkedList implements IQueue{

	MyListNode front;
	MyListNode rear;
	
	public MyListQueue() {
		front=null;
		rear=null;
	}
	@Override
	public void enQueue(String data) {
		MyListNode newNode;
//		newNode=addElement(data);	 --> 여기에 먼저 해주면 안되는 이유는, 비어있는지 바로 아래if문에서 
		// 확인을 하기 때문에 만약 여서 위의 코드를 돌리면 비어있지않게 됨. 
		if(isEmpty()) {	
			newNode=addElement(data);
			front=newNode;
			rear=newNode;
		}
		
		else {
			newNode=addElement(data);
			rear=newNode;			
		}
	}
	

	@Override
	public String deQueue() {
		
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		}
		
		String data = front.getData();
		front=front.next;
		
		if(front==null) { // 이런 경우 마지막 항목이다. 
			rear=null;
		}
		
		return data;
		
		
	}

//	@Override
//	public void printAll() {
//		if(isEmpty()) {
//			System.out.println("Queue is empty");
//			return;
//		}
//		MyListNode temp=front;
//		
//		while(temp!=null) {
//			
//			System.out.print(temp.getData()+",");
//			temp=temp.next;			
//		}
//		System.out.println(" ");
//		
//	}
	
	
	

}

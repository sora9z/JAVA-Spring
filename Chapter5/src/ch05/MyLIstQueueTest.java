package ch05;

public class MyLIstQueueTest {
	
	public static void main(String[] args) {
		
		MyListQueue queue=new MyListQueue();
		
		queue.enQueue("a");
		queue.enQueue("b");
		queue.enQueue("c");
		queue.enQueue("d");
		queue.enQueue("e");
		
		System.out.println(queue.deQueue());
		queue.printAll();
		
		
	}

}

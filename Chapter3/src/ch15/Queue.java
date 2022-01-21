package ch15;

public interface Queue {
	
	void enQueue(String title);
	
	String deQueue(); // 책 이름 반환  
	
	int getSize(); // Queue가 몇 개가 있는지  
	

}

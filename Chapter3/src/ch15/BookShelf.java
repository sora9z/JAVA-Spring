package ch15;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		
		shelf.add(title);
		
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); // 0번 째 index 에 있는 것을 반환 맨  앞의 것 
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}
	

}

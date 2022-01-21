package ch15;
import java.util.ArrayList;

public class Shelf {
	// 상속을 받을 수 있기 때문에 protected
	protected ArrayList<String> shelf;
	
	// 생성자가 호출될 때 맴버변수를 initialize하는 것이 좋다.
	public Shelf() {
		shelf=new ArrayList<String>();
		
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		// 책 개수 
		return shelf.size();
	}

}

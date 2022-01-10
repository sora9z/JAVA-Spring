package ch23;

import java.util.ArrayList;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//개수를 지정하지 않으면 기본으로 10개를 잡는
		
		ArrayList<Book> library=new ArrayList<>();
		
		library.add(new Book("title1","author1"));
		library.add(new Book("title2","author2"));
		library.add(new Book("title3","author3"));
		library.add(new Book("title4","author4"));
		library.add(new Book("title5","author5"));
		
		for(int i=0;i<library.size();i++) {
			library.get(i).showInfo();
		}

	}

}

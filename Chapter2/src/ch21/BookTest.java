package ch21;
// 객체를 만들어서 넣어야 한

public class BookTest {

	public static void main(String[] args) {
		
		Book[] library=new Book[5]; // 주소값이 들어간다 
//		
//		for(int i=0;i<library.length;i++) {
//			System.out.println(library[i]); 
//		}
		
		library[0]=new Book("title","sora");
		library[1]=new Book("title2","sora2");
		library[2]=new Book("title3","sora3");
		library[3]=new Book("title4","sora4");
		library[4]=new Book("title5","sora5");
		
		for(Book book:library) {
			System.out.println(book);
			book.showInfo();
		}

	}

}

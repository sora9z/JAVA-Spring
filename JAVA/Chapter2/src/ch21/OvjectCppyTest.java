package ch21;

public class OvjectCppyTest {

	public static void main(String[] args) {
		
		Book[] library=new Book[5];
		Book[] copylibrary=new Book[5];
		
		library[0]=new Book("title","sora");
		library[1]=new Book("title2","sora2");
		library[2]=new Book("title3","sora3");
		library[3]=new Book("title4","sora4");
		library[4]=new Book("title5","sora5");
		
		
		System.arraycopy(library, 0, copylibrary, 0, 5);
		System.out.println("==library");
		
		for(Book book:library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("==Copy library");
		// 주소까지 똑같다. 
		
		for(Book book:copylibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
		//얕은복사가 되어 같은 주소를 참조하게 되어 
		// 한 개의 배열만 바뀌어도 다른 배열도 바
		
		library[0].setAuthor("modifed");
		library[0].setTitle("iwantypu");
		
		System.out.println("==library");
		for(Book book:library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("==Copy library");
		// 주소까지 똑같다. 
		
		for(Book book:copylibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
		//깊은 복사를 하려면 따로 instance를 만들어주어야 한다.
		// 복사를 하면 값을 같지만 다를 객체가 된다. 
		
		

	}

}

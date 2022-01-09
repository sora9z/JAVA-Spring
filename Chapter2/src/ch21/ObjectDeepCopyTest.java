package ch21;

public class ObjectDeepCopyTest {

	public static void main(String[] args) {

		
		Book[] library=new Book[5];
		Book[] copylibrary=new Book[5];
		
		library[0]=new Book("title","sora");
		library[1]=new Book("title2","sora2");
		library[2]=new Book("title3","sora3");
		library[3]=new Book("title4","sora4");
		library[4]=new Book("title5","sora5");
		

		copylibrary[0]=new Book("title","sora");
		copylibrary[1]=new Book("title2","sora2");
		copylibrary[2]=new Book("title3","sora3");
		copylibrary[3]=new Book("title4","sora4");
		copylibrary[4]=new Book("title5","sora5");

		
		
		
//		System.arraycopy(library, 0, copylibrary, 0, 5);
		
		for(int i=0;i<library.length;i++) {
			copylibrary[i].setAuthor(library[i].getAuthor());
			copylibrary[i].setTitle(library[i].getTitle());
		}
		
		// Deep copy를 했기때문에 주소는 다름 
		
		System.out.println("==library");
		
		for(Book book:library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("==Copy library");
		
		
		for(Book book:copylibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
	}

}

package ch01;

class Book{
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
		
		// 여기에 toStringdmf overriding 해주면 된다.
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return title + ',' + author;
	}
	
}

public class BooTesr {
	
	

	public static void main(String[] args) {
		
		Book book=new Book("programming","sora");
		
		System.out.println(book);
		// ch01.Book@251a69d7  class의 full name   // 251a69d7  :JVM이 준 가상 메모리 16진수 
	String str=new String("test");
	System.out.println(str);  // test  문장열이 나온다.이 경우 str.toString 이 자동으로 재정의 되어있기 때문이다.
  
	}

}

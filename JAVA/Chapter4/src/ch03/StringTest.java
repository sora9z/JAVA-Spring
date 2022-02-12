package ch03;

public class StringTest {

	public static void main(String[] args) {
		
		String java=new String("java");
		String android=new String("android");
		
		System.out.println(System.identityHashCode(java)); // hash 같게 나오므로 indentfyHashCode로 
		
		
		java=java.concat(android);
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java)); // 메모리 주소가 바뀌는 것을알 수 있다.
		

	}

}

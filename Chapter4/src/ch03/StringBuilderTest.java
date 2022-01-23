package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String java=new String("java");
		String android=new String("android");
		
		StringBuilder buffer=new StringBuilder(java);  // 매개변수로 str 가능 
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer)); // 동일 
		
		
		System.out.println(System.identityHashCode(buffer)); // 동일  
		String test=buffer.toString();
		System.out.println(test);

	}

}

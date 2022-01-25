package ch04;

public class Test {

	public static void getClassName(Object obj) {
		System.out.println("The class of "+obj+" is "+obj.getClass().getName());
	}
	
	public static void main(String[] args) {
		
		
		Person p1=new Person("sora",26);
		
		getClassName(p1);
		
		
		

	}

}

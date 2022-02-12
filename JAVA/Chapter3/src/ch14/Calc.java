package ch14;

public interface Calc {
	
	double Pi=3.14;
	int ERROR=-99999999;
	

	int add(int num1,int num2);
	int substractt(int num1,int num2);
	int times(int num1,int num2);
	int divide(int num1,int num2);
	
	// default method
	
	default void description() {
		// interface에 대한 설명 
		System.out.println("It provide Integer Operation ");
		myMethod();
				
	}
	
	static int total(int [] arr) {
		int total=0;
		for(int num:arr) {
			total+=num;
		}
		myStaticMethod();
		return total;
	}
	
	// 일반 
	private void myMethod() {
		System.out.println("myMethod");
	}
	// static private
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
	
}



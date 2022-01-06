package ch07;

public class DoubleTest {
	public static void main(String[] args) {
		
		double dnum=3.14;
		float fnum=3.14f; // 뒤에 f 식별자 붙어주어야 함.
		// 실수 리터럴들을 기본적으로 double로 되어있다. 
		// 위의 fnum에 할당되어있는 리터럴에 f식별자가 없다면 
		// 8byte로 저장되어있는 리터럴을 북사해 놓은 것인데, 
		// f를 붙이면 리터럴이 4byte에 저장됨다.
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		
	}

}

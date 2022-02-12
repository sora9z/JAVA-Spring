package ch14;

public class CalculatorTest {

	public static void main(String[] args) {
		
		// Calc는 interface, Calculator 는 abstraction func라서 instance 못 만든다 
		//변수 타입을 Calc로 해도 된다.
		// 아래의 코드에서 calc라는 interface의 구현을 한 것이 CompleteCalc 이고 Calc 타입인 것임.
	int num1=10;
	int num2=2;
		
		Calc calc= new CompleteCalc(); //  구현된 메서드는 CompleteCalc 또는 Calculator 메서드이다.
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substractt(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		// 유의할 점 calc는 인터페이스의 메서드만 쓸 수있다.	
		
		calc.description();
		
		// static methof사용 
		int [] arr= {1,2,3,4,5};
		
		System.out.println(Calc.total(arr));
		
		
	

	}

}

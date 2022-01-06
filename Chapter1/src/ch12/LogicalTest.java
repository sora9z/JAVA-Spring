package ch12;

public class LogicalTest {
	
	public static void main(String[] args) {
		
		int num1=10;
		int i=2;
		
		boolean value=((num1+=10)<10) && ((i+=2)<10);
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		// num1은 증가를 했지만 i는 증가를 하지 않았음.
		// 이유는, value를 연산할 때 false가 첫 번째 비교연산에서 
		// return 되어서 뒤의 연산은 진행되지 않았기 때문.
		boolean value2=((num1+=10)<10) || ((i+=2)<10);
		System.out.println(value2);
		System.out.println(num1);
		System.out.println(i);
		// 위의 경우에는 i도 변경되었따.
		// 논리합의 경우 true가 한 개라도 있으면 true이기 때문에 
		// 앞의 연산은 false이므로 뒤의 연산을 진행하여 true인지 확인한다.
	}

}

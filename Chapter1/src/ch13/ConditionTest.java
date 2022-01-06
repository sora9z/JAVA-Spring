package ch13;

import java.util.Scanner;
//Scanner는 java.util 이라는 package 안에 들어있는 함수  
public class ConditionTest {
	// 더 큰 수를선

	public static void main(String[] args) {
		
		int max;
		System.out.println("두 수를 입력 받아서 더 큰 수를 출력 하세요");
		
		
		// input 방법
		Scanner scanner=new Scanner(System.in);
		//  System.in은 표준 입력 의미 (out은 표준 출력)
		System.out.println("입력1:");
		int num1=scanner.nextInt(); // 입력을 받는다.
		System.out.println("입력2:");	    
		int num2=scanner.nextInt();
		
		max=num1>num2?num1:num2;
		System.out.println(max);
		
		

	}

}

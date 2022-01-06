package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		
		// Month를 입력 받았을 때 그 월이 몇칠인지
		Scanner scanner=new Scanner(System.in); // cmd shift o --> import
		int month=scanner.nextInt();
		
		int day=switch(month) {
			case 1,3,5,7,8,10,12->
				31;
			case 2-> 
				28;
			
			case 4,6,9,11->
				30;			
				
			default->{			
			
				System.out.println("존재하지 않는 달입니다.");
				yield -1;		// 다른 수행문이 있는 경우 반환값을 주어야한다.	
			}			
			
		};
		System.out.println(month+" "+"Month" +" "+ day);

	}

}

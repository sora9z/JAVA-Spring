package ch18;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		// instance를 만들지 않고 바로 쓸 수 있음 
		Company company1=Company.getInstance();
		
		Company company2=Company.getInstance();
		
		// 주소는 같다. 한 번만 내부에서 한 개 생성되어있고 
		// 이 생성된 메서드만 호출이 가능하므로 
		// 유일하게 한 개만 생성이 된다. 
		System.out.println(company1);
		System.out.println(company2);
		
		// 유일 개
		Calendar calendar=Calendar.getInstance();
		

	}

}

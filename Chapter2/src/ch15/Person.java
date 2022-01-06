package ch15;

// Edward는 지각을 해서 택시를 타야한다.
// 20000을 가지고 있는데 10000을 택시비로 사용해야 한다.
// 택시는 '잘나간다 운주' 회사 택시를 탄다.
// 출력 결과는 다음과 같다.
// Edward님의 남은 돈은 10000원 입니다.
// 잘 간다 운수택시 수은은 10000원 입니다.

public class Person {
	// members
	String name;
	int money;
	
	// constructor
	public Person(String name,int money) {
		this.name=name;
		this.money=money;
	}
	
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		money-=10000;		
	}
	
	public void showInfo() {
		System.out.println(name+"님의 남은 돈은 "+money+"입니다");
	}
	
}

package ch15;

//Edward는 지각을 해서 택시를 타야한다.
//20000을 가지고 있는데 10000을 택시비로 사용해야 한다.
//택시는 '잘나간다 운주' 회사 택시를 탄다.
//출력 결과는 다음과 같다.
//Edward님의 남은 돈은 10000원 입니다.
//잘 간다 운수택시 수은은 10000원 입니다.

public class Taxi {
	
	String name;
	int revenue;
	
	// constructor
	public Taxi(String name) {
		this.name=name;
		
	}
	
	// methids
	public void take(int money) {
		this.revenue+=money;
	}
	
	public void showInfo() {
		System.out.println(name+"택시 수익은"+revenue+"입니다");
	}
	
	
	

}

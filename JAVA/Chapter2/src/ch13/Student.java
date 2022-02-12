package ch13;
// 속성 student name , money
// method : takeBus ,takeSubway ,show monny infor
public class Student {
	
	String studentName;
	int money;
	
	public Student(String studentName,int money) {
		this.studentName=studentName;
		this.money=money;
	}
	
	// method
	public void takeBus(Bus bus) {
		bus.take(1000); // 버스틑 타고 1000원 지불
		this.money-=1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money-=1200;
	}
	
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은"+money+"원 입니다 ");
	}
	
	

}

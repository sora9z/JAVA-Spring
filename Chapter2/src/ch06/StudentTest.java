package ch06;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentKang=new Student(); //기본 생성자를 선언문에 만들어놓았기 떄문에 가능
		Student studentKim=new Student(1234,"kim",3);
		System.out.println(studentKim.studentInfo());
		
		System.out.println(studentKang.studentInfo());
		// null학생의 학번은0이고0입니다
		// 생성자를 만들지 않아서 기본 값들만 들어감 
		
		
	}
	
	

}

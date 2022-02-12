package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		
		Student studentLee = new Student(); // 생성
		
		studentLee.studentId=12345;
		studentLee.setStudentName("Lee");
		studentLee.address="서울 강남구";
		
		studentLee.showStudentInfo();
		
		
		
		Student studentKang=new Student();
		studentKang.studentId=543212;
		studentKang.studentName="Kang";
		studentKang.address="경기도 화성";
		studentKang.showStudentInfo();
		
		System.out.println(studentLee); //packagename.Classname주소
		System.out.println(studentKang);

	
	}

}

package ch24;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee=new Student(1001,"Lee");
		studentLee.addSubject("math", 50);
		studentLee.addSubject("korea", 100);
		
		Student studentKang=new Student(1002,"Kang");
		studentKang.addSubject("math", 100);
		studentKang.addSubject("korea", 90);
		studentKang.addSubject("English", 85);
		
		studentLee.showStudentInfo();
		studentKang.showStudentInfo();

	}

}

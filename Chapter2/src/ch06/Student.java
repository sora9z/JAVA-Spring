package ch06;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	// default 생성자도 같이 쓰고싶은 경우에는 만들어주면 된다.
	public Student() {} //하지만 똑같은 이름의 생성자 -> 생성자 오버로딩   
	
	public Student(int studentNumber,String studentName, int grade) {
		System.out.println("student 생성 ");
		//변수를 받아서 초기화를 하고싶은 경우 
		this.studentNumber=studentNumber; //이렇게 하면 컴파일러가 변수 찾는 것에err
		// this.는 맴버변수를 의미. 변수 이름이 다르면 하지 않아도 되지만 같은 것이 나중에 가독에 좋다
		this.studentName=studentName;
		this.grade=grade;
		
		
	
		
	}
	
	public String studentInfo() {
		return studentName+ "학생의 학번은" + studentNumber + "이고" + grade + "입니다";
	}
	

}

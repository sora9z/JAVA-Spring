package ch04;

public class Student {
	public int studentId;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentId + "학번 학생의 이름은" + studentName + "이고 , 주소"+ address + "입니다.");
		
	}
	// 이름을 지정하거나 이름을 반환하는 method
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName=name;
	}
	
	
}

package ch09;

public class Student {
	int studentId;
	String studentName;
	// Subject name = new Student() 
	Subject korea; // 그냥 선언만 된 것. 
	Subject math;
	
	Student(int studentId,String studentName){
		this.studentId=studentId;
		this.studentName=studentName;
		
		// 참조 자료형으로 맴버변수를 쓰는 경우 
		// 생성자에서 대부분 생성을 한다.
		// 하지 않으면 null pointer exception err
		korea = new Subject();
		math = new Subject();
	}
	//맴법 변수에 대한 값을 넣어주는 메서
	public void setKoreaSubject(String name, int score) {
		korea.subjectName=name;
		korea.score=score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName=name;
		math.score=score;
		
	}
	
	public void showScoreInfo() {
		int total=korea.score+math.score; // 전체 점수
		System.out.println(studentName+"의 총점은"+total+"입니다 ");
	}

}

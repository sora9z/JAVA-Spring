package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		
		Student studentKang=new Student(100,"kang");
		studentKang.setKoreaSubject("국어", 100);
		studentKang.setMathSubject("수학", 100);
		
		Student studentKim=new Student(200,"Kim");
		studentKim.setKoreaSubject("국어", 50);
		studentKim.setMathSubject("수학", 60);
		
		studentKang.showScoreInfo();
		studentKim.showScoreInfo();
	}
	


}

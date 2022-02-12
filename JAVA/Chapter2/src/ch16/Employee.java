package ch16;

public class Employee {
	// instance끼리 공
//	public static int serialNum=1000; 
	//serialNum은 중요한 변수이므로 private를 한다.
	
	private static int serialNum=1000;
	public static int getSerialNum() { // static 변수는 Class이름으로 참조 
		int i=0; // 이 함수내부의 지역변수 이므로 사용가능 
//		employeeName="Lee"; // 이 method가 불려질 시점에 employeeName이 없을 수 있다. 
		return serialNum;
	}

//	public static void setSerialNum(int serialNum) {
//		Employee.serialNum = serialNum;
//	} serialNum은 외부에서 설정할 필요 없기 때문에 setter 를 만들지 않는다.
	
	private int employeeId;
	private String employeeName;
	private String depatement;
	
	// constructor
	// 사원이 들어올 때마다 새로운 사번을 부여한다.
	public Employee () {
		serialNum++; // 한명이 생길 때마다증가
		employeeId=serialNum; // member 변수에 할당헤준다 serialNum은변하니까
		
	}
	
	
	// 모두 private으로 만들었으므로 getter setter 함수 필
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepatement() {
		return depatement;
	}
	public void setDepatement(String depatement) {
		this.depatement = depatement;
	}
	

	
	

}

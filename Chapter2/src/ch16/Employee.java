package ch16;

public class Employee {
	// instance끼리 공
	public static int serialNum=1000;
	
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

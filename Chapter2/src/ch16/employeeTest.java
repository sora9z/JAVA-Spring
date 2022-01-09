package ch16;

public class employeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee=new Employee(); // default constructor
		employeeLee.setEmployeeName("이무");
//		System.out.println(employeeLee.serialNum); // private이므로 여기서 사용 못함
		
		
		Employee employeeKim =new Employee();
		employeeKim.setEmployeeName("김김");
		
		// no constructor & public serialNum
//		employeeKim.serialNum++;
		// 둘이 같이 증가가 된다.두 개의 instance가 한 개의 메모리를 공유하는 것을 알 수 있다.
//		System.out.println(employeeKim.serialNum);
//		System.out.println(employeeLee.serialNum);\
		
		// constuctor에 employee.id 초기화 추가 & private serialNum
		System.out.println(Employee.getSerialNum());
		System.out.println(employeeLee.getEmployeeName()+"'s number is "+employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName()+"'s number is "+employeeKim.getEmployeeId());

	}

}

// 여러 instance가 공유하는 변수는 static key word를 사용한다 
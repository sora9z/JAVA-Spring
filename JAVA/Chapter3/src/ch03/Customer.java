package ch03;

public class Customer { // General Customer
	protected int customerID; // 하위 클레스에서는 접근 가능 (protected)
	protected String customerName;
	protected String customerGrade;
	int bounusPoint; // package default도 외부 class에서는 접근을 못 하므로 어느정도 hiding
	double bounusRatio;

	// constructor
//	public Customer() { // 일반 고객은 ratio와 grade 동일 
//		bounusRatio=0.01;
//		customerGrade="SILVER";
//		
//		// Log When the constructor is called
//		System.out.println("Customer() is called");
//	}
	
	public Customer(int customerID,String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		
		customerGrade="SILVER";
		bounusRatio=0.01;
		System.out.println("Customer(int,String) is called");
	}
	
	public int calPrice(int price) { // 보너스 포인트만적립  
	
		bounusPoint+=price*bounusRatio;
		return price; // 우수 고객의 경우 할인율이 적용이 될 것이므로  
	}
	
	
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		return customerName+"'s Grade is "+customerGrade+"and "
				+ "your bonus point is "+bounusPoint;
		
	}		
	

}

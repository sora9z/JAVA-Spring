package ch06;

public class GoaldCustomer extends Customer{

	double salseRatio;
	
	public GoaldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		// TODO Auto-generated constructor stub
		salseRatio=0.1;
		bounusRatio=0.02;
		customerGrade="GOLD";
	}
	@Override
	public int calPrice(int price) {
		bounusPoint+=price*bounusRatio;
		return price-(int)(price*salseRatio);
	}
	

	
	
	
	
	

}

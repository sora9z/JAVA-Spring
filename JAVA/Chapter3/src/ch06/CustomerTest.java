package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList=new ArrayList(); // cmd shift o 는 자동으로 imprt
		
		Customer customerT = new Customer(10010,"Tomas");
		Customer customerA = new Customer(10020,"Aomas");
		Customer customerK=new GoaldCustomer(10030,"Kang");
		Customer customerD=new GoaldCustomer(10040,"Dang");
		Customer customerC=new VIPCustmoer(10050,"Cang");
		
		customerList.add(customerT);
		customerList.add(customerA);
		customerList.add(customerK);
		customerList.add(customerD);
		customerList.add(customerC);
		
//		for(Customer customer:customerList) {
//			System.out.println(customer.showCustomerInfo());
//		}
//		
//		System.out.println("--------------");
//		
//		int price=10000;
//		for(Customer cust:customerList) { // CAL PRICE가 instance에 따라 다르게 출력이 된다. -> 다형성 
//			int cost=cust.calPrice(price);
//			System.out.println("customer"+cust.getCustomerName()+"is paied "+cost);
//			System.out.println(cust.getCustomerName()+"'s bounus point is "+cust.bounusPoint);
//		}
		
		// instancof는 class의 instance인지 확인해줌 
		//이렇게 확인을 해주는 것이 좋다   
		
	if(customerK instanceof VIPCustmoer) {
		
		VIPCustmoer vc=(VIPCustmoer)customerK; // Gold인데 VIP로는 할 수 없다는 오류가 있음 
	}
	

	if(customerK instanceof GoaldCustomer) {
		
		GoaldCustomer vc=(GoaldCustomer)customerK; // Gold인데 VIP로는 할 수 없다는 오류가 있음 
	System.out.println(customerK.showCustomerInfo());
	}
	
	
	

	}


}

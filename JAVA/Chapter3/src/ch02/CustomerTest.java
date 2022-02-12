package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee=new Customer();
		customerLee.setCustomerName("leeleelee");
		customerLee.setCustomerID(10010);
		customerLee.bounusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
		
		
		VIPCustmoer customerKang=new VIPCustmoer();
		customerKang.setCustomerName("Kang so ra");
		customerKang.setCustomerID(10020);
		customerKang.bounusPoint=10000;
		System.out.println(customerKang.showCustomerInfo());
		

	}


}

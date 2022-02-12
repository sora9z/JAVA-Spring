package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee=new Customer(10010,"lelele");
//		customerLee.setCustomerName("leeleelee");
//		customerLee.setCustomerID(10010);
		customerLee.bounusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
		
		
		VIPCustmoer customerKang=new VIPCustmoer(10020,"Kang so ra");
//		customerKang.setCustomerName("Kang so ra");
//		customerKang.setCustomerID(10020);
		customerKang.bounusPoint=10000;
		System.out.println(customerKang.showCustomerInfo());
		
		Customer vc=new VIPCustmoer(12345,"noname"); // type change
		// vc는 vip 라고 해도 customer 메서드 등만 사용 가능 
		

	}


}

package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee=new Customer(10010,"lelele");
		customerLee.bounusPoint=1000;
		int price=customerLee.calPrice(1000);
		
		System.out.println(customerLee.showCustomerInfo()+"  "+price);
		
		
		VIPCustmoer customerKang=new VIPCustmoer(10020,"Kang so ra");
		customerKang.bounusPoint=10000;
		price=customerKang.calPrice(1000);
		System.out.println(customerKang.showCustomerInfo()+"  "+price);
		
		Customer vc=new VIPCustmoer(12345,"noname"); // type change
		// vc는 vip 라고 해도 customer 메서드 등만 사용 가능 
		price=vc.calPrice(1000); 
		System.out.println(price);  // why it call instalce function? 
		// 가상함수방식 가상메서드방식  실제인스턴스의 메서드가 호출된다.  
		
		

	}


}

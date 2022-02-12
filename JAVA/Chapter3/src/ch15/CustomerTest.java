package ch15;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer=customer; // upcasting 상위클래스로 묵시적 형변환  
		buyer.buy();
		buyer.order();
		
		Sell seller=customer;
		seller.sell();
		seller.order(); //customer에서  재정의 했기 때문에 재정의된 메서드 출력  
		
		

	}

}

package ch15;

public class Customer implements Buy,Sell{

	@Override
	public void sell() {
		
		System.out.println("customer sell");
		
	}

	@Override
	public void buy() {
		System.out.println("Customer buy");
	}

	// 두 개의 iterface 의 default 함수중 하나를 쓰던가 재정의 하던가 해야함 
	@Override
	public void order() {
		System.out.println("customer order");
	}
	
	public void hello() {
		System.out.println("hello");
	}
	

}

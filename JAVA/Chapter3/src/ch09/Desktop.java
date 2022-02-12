package ch09;

public class Desktop extends Computer {
	// 추상 메서드를 구현하지 않을거면 abstract 넣어주면 된다 .

	@Override
	public void display() {
		// TODO Auto-generated method stub
	System.out.println("Desktop Display");
		
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("Desktop Typing");
	} 
	
	@Override
	public void turnOff() {
		System.out.println("Desktop turn off");
	}
	

}

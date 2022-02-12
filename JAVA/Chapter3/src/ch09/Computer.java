package ch09;

public abstract class Computer { 
	//공통으로 사용 할 메서드는 구현하지만 여기서 구현하지 못할 것들은 추상메서드로 놓고 
	// 하위 class에 책임을 위임한다 .
	
	public abstract void display();
	public	abstract void  typing();
	
	public void turnOn() {
		System.out.println("Power on");
	}
	public void turnOff() {
		System.out.println("Turn Off"); 
	}

}

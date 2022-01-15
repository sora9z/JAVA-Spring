package ch10;

public abstract class Car {
	
	public abstract void drive();// ai와 manual은 방법이 다르므
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("Start Car");
		
	}
	
	public void turnOff() {
		System.out.println("Turn off Car");
	}
	
	// run은항상 똑같다. 
	
	public void washCar() {} //추상메서드가 아니라 구현된 메서드. 구현내용이 없는 것.
	
	final public  void run() { // 이 시나리오는 변하면 안된다.
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar(); // 이런 경우 필요한 경우에 재정의한다.훅메서드? 라고한다.
	}

}

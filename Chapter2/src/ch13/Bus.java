package ch13;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber=busNumber;
	}
	
	public void take(int money) {
		this.money+=money; // 협력이 되는 메서
		this.passengerCount++; // 협력이 되는 메서드 
	}
	
	public void showBusInfo() {
		System.out.println(busNumber+"번의 승객 수는 "+passengerCount+"명 이고 수입은 "+money+"원 입니다 ");
	}

}

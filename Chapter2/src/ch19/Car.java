package ch19;

public class Car {
	
	private static int serialNum=10001;
	
	private int carNumber;
	
	// constructor
	public Car() {
		carNumber=serialNum++;
	}
	
	public int getCarNum() {
		return carNumber;
	}
	

}

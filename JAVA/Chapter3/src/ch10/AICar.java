package ch10;

public class AICar extends Car{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Autonomous driving");
		System.out.println("The car change direction by its own");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("The car stop in front of obstacle by its own");		
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void washCar() {
		// TODO Auto-generated method stub
		System.out.println("wash car");
	}
	
	

}

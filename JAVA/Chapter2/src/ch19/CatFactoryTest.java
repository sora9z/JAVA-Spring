package ch19;

public class CatFactoryTest {

	public static void main(String[] args) {
		
		CarFactory factory=CarFactory.getInstance();
		
		Car mySonata=factory.createCar();
		Car myBMW=factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(myBMW.getCarNum());

	}

}

package ch13;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student studentJ=new Student("james",5000);
		Student studentT=new Student("Tomas",10000);
		
		Bus bus100=new Bus(100);
		studentJ.takeBus(bus100);
		
		Subway greeSubway=new Subway(2);
		studentT.takeSubway(greeSubway);
		
		studentJ.showInfo();
		studentT.showInfo();
		
		bus100.showBusInfo();
		greeSubway.showSubwayInfo();		
		

	}

}

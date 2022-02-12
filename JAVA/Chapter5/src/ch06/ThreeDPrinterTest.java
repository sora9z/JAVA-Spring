package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		Powder powder= new Powder();
		
		printer.setMaterial(powder);
		
		// material을 불러와보자   -> 이런 방식은 번거롭다  -> generic programming
		Powder p=(Powder)printer.getMaterial(); // downcasting 
		
		

	}

}

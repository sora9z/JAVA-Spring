package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {
		Powder powder=new Powder();
		GenericPrinter<Powder> powderPrinter=new GenericPrinter<>(); 
		
//		GenericPrinter powderPrinter=new GenericPrinter<>(); 
//		// type을  쓰지 않으면 Object로 인식을 해서 
//		Powder p=(Powder)powderPrinter.getMaterial(); // type 지정 필요 
		
		powderPrinter.setMaterial(powder);
		
		Powder p=powderPrinter.getMaterial();
		
		System.out.println(powderPrinter.toString());

	}

}

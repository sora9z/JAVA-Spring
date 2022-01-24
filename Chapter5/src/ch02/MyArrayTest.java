package ch02;

public class MyArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyArray arr=new MyArray();
		
		arr.addElement(20);
		arr.addElement(30);
		arr.addElement(10);
		arr.addElement(5);
		arr.printAll();
		System.out.println("=====================");
		arr.removeElement(1);
		arr.printAll();		
		System.out.println("=====================");
		arr.insertElement(1, 100);
		arr.printAll();
		
		

	}

}

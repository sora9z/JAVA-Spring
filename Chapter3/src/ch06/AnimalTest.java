package ch06;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("An animal is moving");
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("A person walks on two lags");
		
	}
	public void readBook() {
		System.out.println("She is reading a book");
	}	
	
}

class Tiger extends Animal{
	
	@Override	
	public void move() {
		System.out.println("The tiger walk on all fours");
	}
	public void hunting() {
		System.out.println("The tiger is hunting");
	}
	
}
class Eagle extends Animal{
	public void move() {
		System.out.println("An eagle is flying");
	}
	public void flying() {
		System.out.println("An eagle is flying across the sky");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal= new Human();
		Animal tAnimal=new Tiger();
		Animal eAnimal=new Eagle();
		
		AnimalTest test=new AnimalTest(); 
		test.moveAnimal(hAnimal); // 	Animal로 형변환이 일어난다.
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		System.out.println("--------------");
		
		ArrayList<Animal> animalList=new ArrayList();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
		

	}
	
	public void moveAnimal(Animal animal) {
		animal.move(); // 들어오는 instance에 따라 move의 implementation이 달라진다. ==> 다형
		// 상속을 하고 상속에ㅐ서 Method overriding을 하고 상위 class로 형변환
		
	} // 이 경우에는 다른 인스턴스의 메소드를 사용할 수 없다. 사용하려면 down casting을  해야한다.

}

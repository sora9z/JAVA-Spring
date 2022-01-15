package ch09;

public class ComputerTest {
	
	public static void main(String[] args) {
		
		// 추상클래스는 new 할 수 없다.--> 구현되어있지 않는 메서드가 있어서
//		Computer computer=new Computer(); // abstract class can't use new
		
		// Desktop desktop=new Desktop();
		Computer desktop=new Desktop(); // computer 타입으로도 쓸 수 있다. 업케스팅 
		// 단,desktop의 변수로는 computer에 정의된 메서드만 사용이 가능  
		// Desktop	method can't use
		
		// 추상을 쓰는 이유 : 상속을 하기 위해 만들어짐. 
		
		desktop.display();
	
	}

}

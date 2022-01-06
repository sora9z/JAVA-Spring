package ch12;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		// 아무것도 넣지 않았을 경우 초기화를 해주고 싶을 떄
//		int num=10; //  이 경우 아래의 생성자가 아직 호출되지 않았기 때문에 err
		this("no Name",1); 
		int num=10 ; // 이 경우는 가능하다 이미 생성자를 호출한 상
		
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void showPerson() {
		System.out.println(name+","+age);
		
	}
	
	public Person getPerson() {
		return this; // 자기 자신을 return 반환 타입도 자기 자신이다.
	}
	
	public static void main(String[] argc) {
		Person person=new Person(); // default constructor!
		person.showPerson();
		
		System.out.println(person); 
		// ch12.Person@7ad041f3
		// ch12.Person : package가 포함 class의full name ,JVM이 assign해준 address;
		
		Person person2=person.getPerson(); //위의 person의 값과 같다  
		System.out.println(person2);
		
	}
	
	

}

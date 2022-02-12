package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class c1 = Class.forName("ch04.Person");
		
		Person person = (Person)c1.newInstance(); // duplicate 예정  
		
		Person p1=new Person("sora",26);
		System.out.println("entity name : "+p1.getClass().getName());
		
		
		
		person.setName("i am person");
		System.out.println(person);
		
		System.out.println("entity name : "+person.getName());
		
		Class c2 = person.getClass(); // obj의 함수  instance 존재 해야함 
		Person p=(Person)c2.newInstance(); // no name..
		
		
		
		// local에 person이 없을 때  사용  
		Class[] parameterTypes = {String.class};
		Constructor cons= c2.getConstructor(parameterTypes);
		Object[] integers= {"Kom"};
		Person kim=(Person)cons.newInstance(integers);
		System.out.println(kim);
		
		Person kim2=new Person("kim", 0) ;// 위의경우와 같음.  
		
		
		
		
		

	}

}

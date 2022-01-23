package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// 이런 경우는  reflaction programing이라고 한다.
		Class c = Class.forName("java.lang.String");
		
		
		Constructor[] cons=c.getConstructors();
		
		for(Constructor co:cons) {
			System.out.println(co);  // String의생성자들을 볼 수 있다. 
		}
		
		Method[] m = c.getMethods();
		
		for(Method mth:m) {
			System.out.println(mth);	
		}
	

	}

}

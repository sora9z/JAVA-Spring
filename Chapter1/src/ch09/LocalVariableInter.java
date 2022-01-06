package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {
		
		var i=10;
		var j=10.0;
		var str="hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str="Test";
		System.out.println(str);
		// str=3; err Type mismatch: cannot convert from int to String

	}

}

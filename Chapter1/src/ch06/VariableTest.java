package ch06;

public class VariableTest {

	public static void main(String[] args) {
		
		byte bnum=-128; // -128 - 127 까지 표현 가능
		
		System.out.println(bnum); // 오류가 나지 않음
		//하지만 128을 넣으면 err : Type mismatch: cannot convert from int to byte
		
		//int num=12345678900;
		// The literal 12345678900 of type int is out of range  
		//long lNum=12345678900;
		// The literal 12345678900 of type int is out of range 
		long lNum=12345678900L; //뒤에 L을 붙여준다.
		long lNum2=123456789; // 작으면 자동으로int에서 long type으로 형변환이 된다.
		System.out.println(lNum);
		
		
		
		

	}

}

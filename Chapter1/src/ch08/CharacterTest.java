package ch08;

public class CharacterTest {

	public static void main(String[] args) {
		
		char ch1='A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		System.out.println(ch1);
		
		char ch2=66; // 숫자를 넣어봄
		System.out.println(ch2);
		System.out.println((char)ch2); // character로 casting -> 사실상 의미 없음. 
		
		int ch3=67;
		System.out.println(ch3);
		System.out.println((char)ch3); // 아스키코드를 변환
		
		// char ch=-66 음수는 사용할 수 없다.
		// char ch=12345 2byte이상도 넣을 수 없다.
		
		// 유니코드를 쓸 때에 u 에다가 유니코드를 넣으면 된다.
		
		char han='한'; 
		char ch='\uD55C'; // 위의 '한'을 유니코드로 표기함
		System.out.println(han);
		System.out.println(ch);
		
		

	}

}

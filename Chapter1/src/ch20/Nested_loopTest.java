package ch20;

public class Nested_loopTest {

	public static void main(String[] args) {

		
		
		// for로 99단
		
		for(int dan=2;dan<=9;dan++) {
			
			for(int count=1;count<=9;count++) {
//				System.out.println(dan+"X"+count+"="+dan*count);
			}
//			System.out.println( );
		}
		
		// while
		
		int dan=2;
		int count=1;
		while(dan<=9) {
			count=1; // 다시 초기화 해야한다.
			while(count<=9) {
				count++;
				System.out.println(dan+"X"+count+"="+dan*count);
			}
			dan++;
			System.out.println( );
		}
	}

}

package ch10;

public class constantTetst {

	public static void main(String[] args) {
		
		final int MAX_NUM=100;
		
		// MAX_NUM=20; 상수이므로 재할당을 못함
		
		final int MIN_NUM;
		MIN_NUM=0;
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		

	}

}

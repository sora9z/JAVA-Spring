package ch11;

public class OperatorTest {

	public static void main(String[] args) {
		
		int gameScore=150;
		int lastScore=++gameScore; // gameScore+=1;
		// lastScore에 할당기 전에 gameScore를 먼저 증가시킨다.
		System.out.println(lastScore);
		System.out.println(gameScore);
		
		lastScore=gameScore++; // 이 statement가 끝난 다음에 증가를 시킨다.
		System.out.println(lastScore);
		// 먼저 151이 들어간 다음에 gameScore가 증가된다.1
		System.out.println(gameScore);
		
		
		

	}

}

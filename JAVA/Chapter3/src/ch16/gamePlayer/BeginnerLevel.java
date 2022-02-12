package ch16.gamePlayer;

public class BeginnerLevel extends PlayerLevel{

	@Override
	void run() {
		System.out.println("Beginner Ruunig Slowly");
		
	}

	@Override
	void jump() {
		System.out.println("Beginner can't Jump");
		
	}

	@Override
	void turn() {
		System.out.println("Beginner can't turn");
		
	}

	@Override
	void showLevelMessage() {
		System.out.println("*****I'm Beginner Level*****");
		
	}

}

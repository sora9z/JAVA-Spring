package ch16.gamePlayer;

public class AdvancedLevel extends PlayerLevel {
	@Override
	void run() {
		System.out.println("Advanced Ruunig Fast");
		
	}

	@Override
	void jump() {
		System.out.println("Advanced Jump High");
		
	}

	@Override
	void turn() {
		System.out.println("Advanced Level can't turn");
		
	}

	@Override
	void showLevelMessage() {
		System.out.println("*****I'm Advanced Level*****");
	}
		
}

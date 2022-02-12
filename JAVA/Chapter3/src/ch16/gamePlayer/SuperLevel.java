package ch16.gamePlayer;

public class SuperLevel extends PlayerLevel{
	@Override
	void run() {
		System.out.println("Super Ruunig very quickly");
		
	}

	@Override
	void jump() {
		System.out.println("Super Jump very High");
		
	}

	@Override
	void turn() { 
		System.out.println("Super turn");
		
	}

	@Override
	void showLevelMessage() {
		System.out.println("*****I'm Super Level*****");
	}

	
}

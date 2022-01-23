package ch16.gamePlayer;

public class PlayerTest {

	public static void main(String[] args) {
		
		Player player=new Player();
		
		player.getLevel();
		player.play(2);
		
		// Level up!! 
		PlayerLevel advanced=new AdvancedLevel();
		
		
		player.upgradeLevel(advanced);
		player.getLevel();
		player.play(4);
		
		// LevelUp !! 
		PlayerLevel superLevel=new SuperLevel();
		
		player.upgradeLevel(superLevel);
		player.getLevel();
		player.play(6);
		
		

	}

}

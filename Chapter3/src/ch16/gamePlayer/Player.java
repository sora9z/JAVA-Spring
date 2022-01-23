package ch16.gamePlayer;

public class Player {
	
	 private PlayerLevel level;
	 
	 // constructor 
	 public Player (){
		 // 첫 생성 시에는biginner level
		 PlayerLevel biginner=new BeginnerLevel();
		 this.level=biginner;		 
	 }
	 
	 public void getLevel() {
		 this.level.showLevelMessage();
	 }
	 
	 public void upgradeLevel(PlayerLevel uplevel){
		 this.level=uplevel;
		 
	 }
	 
	 public void play(int count){
		 this.level.go(count);
		 
	 } 

}

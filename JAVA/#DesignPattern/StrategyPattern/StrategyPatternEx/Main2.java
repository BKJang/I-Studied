package StrategyPattern;

public class Main2 {
	
	public static void main(String[] args) {
		
		GameCharacter character = new GameCharacter();
		
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();
		
		//무기를 추가할 떄 굉장히 효율적으로 추가할 수 있게 된다.
		character.setWeapon(new Ax());
		character.attack();
	}		
}

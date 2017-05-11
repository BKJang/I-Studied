package StrategyPattern;

public class Main2 {
	
	public static void main(String[] args) {
		
		GameCharacter character = new GameCharacter();
		
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();
		
		//���⸦ �߰��� �� ������ ȿ�������� �߰��� �� �ְ� �ȴ�.
		character.setWeapon(new Ax());
		character.attack();
	}		
}

package StrategyPattern;

/* 요구사항
 * 신작 게임에서 캐릭터와 무기를 구현
 * 무기는 칼,검 두가지 종류가 있다.
 * 
 * 유지보수 요청
 * 무기에 도끼를 추가
 */
public interface Weapon {
	
	public void attack();
}

package Concrete;

import FactoryFrameWork.Item;
import FactoryFrameWork.ItemCreator;

/*요구사항
 * 게임아이템과 아이템 생성을 구현
 * -아이템을 생성하기 전에 데이터베이스에서 아이템 정보를 요청
 * -아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터베이스에 아이템 생성 정보를 남긴다
 * (log정보를 남겨라)
 * 
 * 아이템을 생성하는 주체를 ItemCreator로
 * 
 * 아이템은 item이라는 interface로 다룬다
 * -item은 use함수를 기본 함수로 갖고 있다
 * 
 * 현재 아이템의 종류는 체력 회복 물약, 마력 회복 물약이 있다.
 */
public class Main {
	public static void main(String[] args) {
		ItemCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();
		item.use();
		
		creator = new MpCreator();
		item = creator.create();
		item.use();
	}
}
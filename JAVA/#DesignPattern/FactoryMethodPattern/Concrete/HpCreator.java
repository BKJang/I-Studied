package Concrete; //구현을 하나하나 분리하는 패키지

import java.util.Date;

import FactoryFrameWork.Item;
import FactoryFrameWork.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemInfo() {
		System.out.println("DB에서 회복물약 데이터를 가져온다.");

	}

	@Override
	protected void createItemLog() {
		System.out.println("회복 물약 생성했습니다. " + new Date());

	}

	@Override
	protected Item createItem() {
		return new HpPotion();
	}

}

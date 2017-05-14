package Concrete;

import java.util.Date;

import FactoryFrameWork.Item;
import FactoryFrameWork.ItemCreator;

public class MpCreator extends ItemCreator {

	@Override
	protected void requestItemInfo() {
		System.out.println("DB에서 마력물약 데이터를 가져온다.");

	}

	@Override
	protected void createItemLog() {
		System.out.println("마력 물약 생성했습니다. " + new Date());

	}

	@Override
	protected Item createItem() {
		return new MpPotion();
	}

}

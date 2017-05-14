package Concrete;

import java.util.Date;

import FactoryFrameWork.Item;
import FactoryFrameWork.ItemCreator;

public class MpCreator extends ItemCreator {

	@Override
	protected void requestItemInfo() {
		System.out.println("DB���� ���¹��� �����͸� �����´�.");

	}

	@Override
	protected void createItemLog() {
		System.out.println("���� ���� �����߽��ϴ�. " + new Date());

	}

	@Override
	protected Item createItem() {
		return new MpPotion();
	}

}

package Concrete; //������ �ϳ��ϳ� �и��ϴ� ��Ű��

import java.util.Date;

import FactoryFrameWork.Item;
import FactoryFrameWork.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemInfo() {
		System.out.println("DB���� ȸ������ �����͸� �����´�.");

	}

	@Override
	protected void createItemLog() {
		System.out.println("ȸ�� ���� �����߽��ϴ�. " + new Date());

	}

	@Override
	protected Item createItem() {
		return new HpPotion();
	}

}

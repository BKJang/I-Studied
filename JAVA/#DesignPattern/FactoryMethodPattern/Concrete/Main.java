package Concrete;

import FactoryFrameWork.Item;
import FactoryFrameWork.ItemCreator;

/*�䱸����
 * ���Ӿ����۰� ������ ������ ����
 * -�������� �����ϱ� ���� �����ͺ��̽����� ������ ������ ��û
 * -�������� ���� �� ������ ���� ���� �ҹ��� �����ϱ� ���� �����ͺ��̽��� ������ ���� ������ �����
 * (log������ ���ܶ�)
 * 
 * �������� �����ϴ� ��ü�� ItemCreator��
 * 
 * �������� item�̶�� interface�� �ٷ��
 * -item�� use�Լ��� �⺻ �Լ��� ���� �ִ�
 * 
 * ���� �������� ������ ü�� ȸ�� ����, ���� ȸ�� ������ �ִ�.
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
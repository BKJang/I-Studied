package FactoryFrameWork;

public abstract class ItemCreator {
	
	//���丮 �޼ҵ� - ���ø� �޼ҵ�
	public Item create(){
		
		Item item;
		
		//������ ���� ��������
		requestItemInfo();
		//������ �����ϰ�
		item = createItem();
		//������ �α� �ۼ�
		createItemLog();
		
		return item;
	}
	
	//�������� �����ϱ� ���� �����ͺ��̽��� ������ ���� ��û
	abstract protected void requestItemInfo();
	//������ ���� �� ������ ���� ������ �����ͺ��̽��� �����.
	abstract protected void createItemLog();
	//�������� �����ϴ� �˰���
	abstract protected Item createItem();
	
}

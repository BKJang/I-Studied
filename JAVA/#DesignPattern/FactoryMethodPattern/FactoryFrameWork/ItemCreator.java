package FactoryFrameWork;

public abstract class ItemCreator {
	
	//팩토리 메소드 - 템플릿 메소드
	public Item create(){
		
		Item item;
		
		//아이템 정보 가져오고
		requestItemInfo();
		//아이템 생성하고
		item = createItem();
		//생성한 로그 작성
		createItemLog();
		
		return item;
	}
	
	//아이템을 생성하기 전에 데이터베이스에 아이템 정보 요청
	abstract protected void requestItemInfo();
	//아이템 생성 후 아이템 생성 정보를 데이터베이스에 남긴다.
	abstract protected void createItemLog();
	//아이템을 생성하는 알고리즘
	abstract protected Item createItem();
	
}

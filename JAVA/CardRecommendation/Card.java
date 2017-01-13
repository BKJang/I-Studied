package Study141516;

public class Card{
	private String name;
	private String company;
	
	public static void CompareMerit(int bus, int coffee){
		if(bus>coffee){
			System.out.println("노리체크카드(체크)를 추천합니다.");
		}else if(coffee>bus){
			System.out.println("롯데카드(신용)를 추천합니다.");
		}else
			System.out.println("고객님의 소비습관을 분석한 결과 두 개의 카드 모두 혜택이 같습니다.");
	}
	
	public Card(){
		
	}
	

	public Card(String name, String company){
		this.name = name;
		this.company =company;
	}
	
	public void showCardInfo(){
		System.out.println("카드명 : " + name);
		System.out.println("카드사 : " + company);
	}
	
	
	public void showMeritInfo(){};
}



class CreditCard extends Card{//상속
	private int credit;
	
	public CreditCard(String name, String company, int credit){
		super(name, company);
		this.credit = credit;
	}
	
	public void showCreditCardInfo(){
		super.showCardInfo();;
		System.out.println("신용도 : " + credit);
	}
	
	public void showMeritInfo(){
		System.out.println("혜택 1 : 버스비 10% 할인");
		System.out.println("헤택 2 : 카페 20% 할인");
	}
}

class CheckCard extends Card{//상속
	private int cvc;
	
	public CheckCard(String name, String company, int cvc){
		super(name, company);
		this.cvc=cvc;
	}
	
	public void showCreditCardInfo(){
		super.showCardInfo();;
		System.out.println("CVC : " + cvc);
	}
	
	public void showMeritInfo(){
		System.out.println("혜택 1 : 버스비 20% 할인");
		System.out.println("헤택 2 : 카페 10% 할인");
	}
}




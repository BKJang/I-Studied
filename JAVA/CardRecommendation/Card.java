package Study141516;

public class Card{
	private String name;
	private String company;
	
	public static void CompareMerit(int bus, int coffee){
		if(bus>coffee){
			System.out.println("�븮üũī��(üũ)�� ��õ�մϴ�.");
		}else if(coffee>bus){
			System.out.println("�Ե�ī��(�ſ�)�� ��õ�մϴ�.");
		}else
			System.out.println("������ �Һ������ �м��� ��� �� ���� ī�� ��� ������ �����ϴ�.");
	}
	
	public Card(){
		
	}
	

	public Card(String name, String company){
		this.name = name;
		this.company =company;
	}
	
	public void showCardInfo(){
		System.out.println("ī��� : " + name);
		System.out.println("ī��� : " + company);
	}
	
	
	public void showMeritInfo(){};
}



class CreditCard extends Card{//���
	private int credit;
	
	public CreditCard(String name, String company, int credit){
		super(name, company);
		this.credit = credit;
	}
	
	public void showCreditCardInfo(){
		super.showCardInfo();;
		System.out.println("�ſ뵵 : " + credit);
	}
	
	public void showMeritInfo(){
		System.out.println("���� 1 : ������ 10% ����");
		System.out.println("���� 2 : ī�� 20% ����");
	}
}

class CheckCard extends Card{//���
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
		System.out.println("���� 1 : ������ 20% ����");
		System.out.println("���� 2 : ī�� 10% ����");
	}
}




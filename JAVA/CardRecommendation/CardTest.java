package Study141516;

import java.util.Scanner;

public class CardTest {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Card ca = new Card();
		int bus;
		int coffee;
		
		CreditCard credit = new CreditCard("�Ե�ī��", "Lotte", 5);
		CheckCard check = new CheckCard("�븮üũī��", "��������", 383);
		
		System.out.println("�ſ�ī���� ����  : ");
		credit.showMeritInfo();
		
		System.out.println("üũī���� ���� : ");
		check.showMeritInfo();//������� ���� ����
		
		System.out.println("������� ī���̿�Ḧ ���� �Է��ϼ���");
		System.out.println("������ : ");
		bus = sc.nextInt();
		sc.nextLine();
		System.out.println("ī���̿�� : ");
		coffee = sc.nextInt();
		sc.nextLine();
		
		ca.CompareMerit(bus,coffee);
		
	} 
}
	 
package Study141516;

import java.util.Scanner;

public class CardTest {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Card ca = new Card();
		int bus;
		int coffee;
		
		CreditCard credit = new CreditCard("롯데카드", "Lotte", 5);
		CheckCard check = new CheckCard("노리체크카드", "국민은행", 383);
		
		System.out.println("신용카드의 헤택  : ");
		credit.showMeritInfo();
		
		System.out.println("체크카드의 혜택 : ");
		check.showMeritInfo();//여기까지 혜택 설명
		
		System.out.println("버스비와 카페이용료를 각각 입력하세요");
		System.out.println("버스비 : ");
		bus = sc.nextInt();
		sc.nextLine();
		System.out.println("카페이용료 : ");
		coffee = sc.nextInt();
		sc.nextLine();
		
		ca.CompareMerit(bus,coffee);
		
	} 
}
	 
package Study1112;

import java.util.Scanner;

public class IncomeExpense {

	Scanner sc = new Scanner(System.in);
	int [] input = new int[5];
	int [] output = new int[5];

	public void Menu(){
		System.out.println("1:수입, 2:지출, 3:출력");
		int choice = sc.nextInt();
		sc.nextLine();


		switch(choice){
		case 1:
			this.Choice1();

			break;
		case 2:
			this.Choice2();
			break;
		case 3:
			this.Choice3();
			break;

		}
	}

	public void Choice1(){
		

		for(int e=0; e<input.length; e++){
			int num = sc.nextInt();
			input[e] = num;
			this.Menu();
		}
		System.out.println("수입이 입력되엇습니다");
	}
	
	public void Choice2(){
		
		for(int e=0; e<output.length;e++){
			int num = sc.nextInt();
			output[e] = num;
			this.Menu();
		}
		System.out.println("지출이 입력되엇습니다");
		this.Menu();
	}
	
	public void Choice3(){
		for(int e=0; e<input.length;e++){
			if(input[e]!=0)
				System.out.println("수입 : " + input[e]);
		}
		for(int e=0; e<output.length;e++){
			if(output[e]!=0)
				System.out.println("지출 : " +output[e]);
		}
			System.out.println("내역을  출력하였습니다.");
			this.Menu();
	}
}
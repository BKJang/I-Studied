import java.util.Scanner;

public class naturalnum implements naturalInterface {
	
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	
	public void numout(){
		System.out.print(a+ " ");
		System.out.println(b);
	}
	
	public void addNum(){
		System.out.println(a+b);
	}
	
	public void minusNum(){
		System.out.println(a-b);
	}
	
	public void absoulute(){
		if(a>b){
			System.out.println(a-b);
			System.out.println("a�� �� Ů�ϴ�");
		}else if(b>a){
			System.out.println(b-a);
			System.out.println("b�� �� Ů�ϴ�");
		}else{
			System.out.println(0);
		}
	}
	
	public void multiple(){
		System.out.println(a*b);
	}
	
	public void division(){
		System.out.print("�� : ");
		System.out.println(a/b);
		System.out.print("������ : ");
		System.out.println(a%b);
	}

	public void division2(){
		System.out.print("����� : ");
		double a2 = (double)a;
		double b2 = (double)b;
		System.out.println(a2/b2);
	}
}

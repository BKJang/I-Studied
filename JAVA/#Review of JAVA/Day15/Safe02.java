import java.util.*;

public class Safe02 {
	public static void main(String[] args) {		
		
		int a = (int)(Math.random()*90)+10;//1.정수형 데이터를 하나 랜덤생성 #(두자리수 형태)
		System.out.println(a);
		
		System.out.println("약수입력: ");//2.이 정수형 데이터를 출력을 하면서 약수 입력하라고 같이 출력
		
		Scanner sc = new Scanner(System.in);//3.Scanner 혹은 JOptionPane 둘 중에 하나를 이용해서 입력을 처리하고
		String b = sc.nextLine();
		
		System.out.println("입력받은 수치 : " + b);//4.입력받은 수치를 한번 출력하고
		
		String rst =null;
		try{
			if(a%(Integer.parseInt(b))==0)//5.그 수치가 약수데이터가 맞는건지 아닌지
			rst = "정답";
			
			else
			rst = "오답";
			
		}catch(NumberFormatException e){//catch에다가 예외를 잡고 싶은 것을 입력
			System.out.println("!!");
		}catch(ArithmeticException e){
			System.out.println("~~");
		}catch(Exception e){// Exception이라고 걸면 다 잡히긴 한다... 상황별 처리가 힘듬.
			System.out.println("에러");
		}
		System.out.println(rst);
		
		//하다보면.. Exception들이 발생하는 상황이 있을꺼고
		//별도의 처리를 해주지 않으면 이 Exception객체들은 JVM으로 타고 들어가게 되어있고
		//실제로 흘러가게 되면 비정상 종료로 이어지게 된다.
		//이런 것들을 막아내려면.. Exception handling(예외처리)
		
		
	}
}

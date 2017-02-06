package SumofNum;

public class NumSumTest {
	
	public static void main(String[] args) {
	
		NumSum ns = new NumSum();//객체 생성
		
		System.out.println("두 개의 정수를 입력하세요");
		
		try{
			int result = ns.readresult();//NumSum의 반환된 결과 값을 선언
			System.out.println(result);//결과값 출력
		}
		catch(NumInputException e){//Exception에 걸린다면 만들어놓은 Exeption class로 이동
			e.printStackTrace();
		}
		
		System.out.println();
		}	
} 
	

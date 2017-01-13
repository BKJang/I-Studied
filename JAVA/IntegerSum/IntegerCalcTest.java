public class IntegerCalcTest {
	public static void main(String[] args) {
	System.out.println("입력할 정수의 갯수와 계산될 정수들을 입력하세요(공백으로 구분)");
	
	IntegerCalc qs = new IntegerCalc();//객체 생성
	
	
	
	try{
		//NumSum의 반환된 결과 값을 선언
		int result = qs.result();
			System.out.println(result);//결과값 출력
		}
		catch(IntegernumException e){//Exception에 걸린다면 만들어놓은 Exeption class로 이동
			System.out.println(e.getMessage());
		}catch(IntegersumException e){
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
			
}



public class Basic02 {
	public static void main(String[] args) {
		// 카드 점수 계산
		// 랜덤으로 1~10사이의 정수 2개를 추출하고
		// 그 두숫자 찍고 그걸 카드 넘버값이라고 생각
		// 점수 계산 (만약 같은 숫자면.. 그 숫자 * 10이 점수고(7,7->70)
		// 다른 숫자면.. 그 숫자합의 1의 자리가 점수 (1, 7 -> 8)
		
		int a = (int)(Math.random()*10)+1;
		int b = (int)(Math.random()*10)+1;
		int score;
		//if문 시작
		if(a==b){
			score=a;
		}else{
			int c = a+b<10 ? a+b : a+b-10;//(a+b-10 == (a+b)%10)
			score = c;
			
		}//if문 종료
		//if~else를 이용해서 어떤 처리를 하는데
		//처리해야될 작업이 하나이면 {}생략하여도 된다.
		System.out.println("카드1 : " + a);
		System.out.println("카드2 : " + b);
		System.out.println("점수는 : " + score);
	}
	
}

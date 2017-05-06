
public class Basic05 {
	public static void main(String[] args) {
		//조건 연산 -> boolean ? data1 : data2;
		//true, false에 따라 다른 데이터를 생성해주는 연산
		//if라는 문법과 비슷하게 작동을 하긴 하는데, 상황에 따른 다른 값을 추출해서 사용하기엔 특화
		int a = 16;
		
		System.out.println(a>10 ? 1 : -1);
		System.out.println(a>0 ? "흑" : "백");
		
//================================================================
		
		int m = (int)(Math.random()*21)-10;
		
		int absM = m>0 ? m : -m;
		
		System.out.println(m+" ==> " +absM);
		
		int age=(int)(Math.random() *20)+10;
		String ages = (age>=19) ? "성인" : "미성년자";
		System.out.println(age + "세는 " + ages + "입니다.");
	}
}

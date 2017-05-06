
public class Basic03 {
	public static void main(String[] args) {
		int lv=4;
		int exp = 65;
		System.out.println("원상태 : " + lv + " exp : " + exp);
		
		int gain = (int)(Math.random()*50)+10;
		System.out.println("획득 EXP : " + gain);
		
		exp = exp+gain; //원값에 획득값을 더한 값으로 바뀜
		
		// exp 100넘어가면 레벨 1 증가, exp는 초기화
		
		if(exp>=100){
			lv = lv + 1; // lv += 1
			exp = exp - 100; // exp -= 100
		}else{
			lv=lv;
			exp = exp;
		}
		//if ~ else가 기본형이지만 다양한 변형꼴이 존재 : 단순 if
		System.out.println("바뀐상태 : " + lv + " exp : " + exp);
	}
}

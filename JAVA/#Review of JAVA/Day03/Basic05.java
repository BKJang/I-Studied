
public class Basic05 {
	public static void main(String[] args) {
		
		int ch = (int)(Math.random()*7)+5;
		String str;
		//5 = SBS , 7 = KBS2, 9 = KBS1, 11 = MBC, 나머지 = UNDEFINED
		
		if(ch == 5){
			str = "SBS";
		}else if(ch == 7){
			str = "KBS2";
		}else if(ch == 9){
			str = "KBS1";
		}else if(ch == 11){
			str = "MBC";
		}else{
			str = "UNDEFINED";
		}
	
		System.out.println("ch = " + ch + "/ " + str);
		//데이터의 상태가 아니라(맞다, 틀리다)
		//데이터의 값에 따라..(일치) 다른 처리를 하는 거라면.. 다른 문법도 존재한다.
		//switch 문
		String str2;
		switch (ch) {
		case 5 :
			str2 = "SBS";
			break; //switch case(여기까지만 작업된다.)
		case 7 :
			str2 = "KBS2";
			break; 
		case 9 :
			str2 = "KBS1";
			break;
		case 11 :	
			str2 = "MBC";
		default :
			str2 ="UNDEFINED";
		}
		System.out.println(str2);
	}
}

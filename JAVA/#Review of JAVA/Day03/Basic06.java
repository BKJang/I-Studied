
public class Basic06 {
	public static void main(String[] args) {
		String mode = "등록";
		String rst;
		
		switch(mode){
		case "등록" :
		case "add" :
			rst = "등록처리 되었습니다.";//순서대로 실행되므로 등록이 입력되어 있어도 결과값이 break전까지 뜸
			break;
		case "삭제" :
		case "del" :
			rst = "삭제처리 되었습니다.";
			break;
		default :	
			rst = "다시 도와주세요.";
		}
		System.out.println(mode + " ==> " + rst);
	}
}

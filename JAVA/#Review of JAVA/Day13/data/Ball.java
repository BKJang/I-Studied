package data;

public class Ball {
	int type;
	boolean mistake;
	// 기본생성자 0,false로 설정되게
	public Ball() {
		this(0, false);
	}
	// type만 설정받는 생성자 (mistake=false)
	public Ball(int type) {
		this(type, false);
	}
	// type과 mistake를 설정받는 생성자
	public Ball(int type, boolean mistake){
		this.type = type;
		this.mistake = mistake;
	}
	// 각 필드별 getter 추가(값 리턴 시키는)
	public int getType() {
		return type;
	}
	public boolean getMistake() {
		return mistake;
	}
	// 문자열String 만들어주는 메서드 추가
	public String info() {
		// 0 : 패스트볼 , 1 : 커브 , 2 : 슬라이더 3 : 체인지업
		String[] strs = {"패스트볼", "커브", "슬라이더", "체인지업"};
		String rst = mistake ? "(실투)" : "";
		
		return "구종 = " +strs[type] + rst;
	}
	// 제대로 만들어진건지 테스트
	
	public static void main(String[] args) {
		Ball b1 = new Ball();
		System.out.println(b1.info());
		Ball b2 = new Ball(3);
		System.out.println(b2.info());
		
		Ball b3 = new Ball(0, true);
		System.out.println(b3.info());
		
		int t =b3.getType();
		boolean b = b3.getMistake();
		
	}
	
}














package data;

// 이렇게도 할수 있겠지만..
public class WrongBall {
	int type;
	boolean mistake;
	int speed;
	// 기본생성자 0,false로 설정되게
	public WrongBall() {
		this(0, false);
	}
	// type만 설정받는 생성자 (mistake=false)
	public WrongBall(int type) {
		this(type, false);
	}
	// type과 mistake를 설정받는 생성자
	public WrongBall(int type, boolean mistake){
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
	// 제대로 만들어진건
}

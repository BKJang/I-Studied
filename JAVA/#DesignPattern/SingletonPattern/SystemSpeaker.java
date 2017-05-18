package SingletonPattern;
//싱글톤 패턴을 통해 하나의 인스턴스만 구현할 수 있다.
//Singleton Pattern : 하나만 생성해야할 객체를 위한 패턴
public class SystemSpeaker {
	
	static private SystemSpeaker instance; //하나의 인스턴스만 하고 외부에서 접근 되지 않도록
	private int volume = 5;
	
	private SystemSpeaker() { //외부에서 생성자를 호출하지 못하도록
		
	}
	public static SystemSpeaker getInstance(){
		if(instance == null){
			//시스템 스피커
			instance = new SystemSpeaker();
			System.out.println("새로 생성"); //로그
		}else{
			System.out.println("이미 생성"); //로그
		}
		return instance;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
}

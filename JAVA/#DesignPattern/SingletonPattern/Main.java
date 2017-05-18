package SingletonPattern;
/*요구사항
 *개발 중인 시스템에서 스피커에 접근할 수 있는 클래스를 만들어주세요*
 */
public class Main {
	public static void main(String[] args) {
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker1.setVolume(10);
		System.out.println(speaker1.getVolume());//동일한 인스턴스(10)
		System.out.println(speaker2.getVolume());//동일한 인스턴스(10)
		
		speaker2.setVolume(20);
		System.out.println(speaker1.getVolume());//동일한 인스턴스(20)
		System.out.println(speaker2.getVolume());//동일한 인스턴스(20)
	
	}
}

package SingletonPattern;
/*�䱸����
 *���� ���� �ý��ۿ��� ����Ŀ�� ������ �� �ִ� Ŭ������ ������ּ���*
 */
public class Main {
	public static void main(String[] args) {
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker1.setVolume(10);
		System.out.println(speaker1.getVolume());//������ �ν��Ͻ�(10)
		System.out.println(speaker2.getVolume());//������ �ν��Ͻ�(10)
		
		speaker2.setVolume(20);
		System.out.println(speaker1.getVolume());//������ �ν��Ͻ�(20)
		System.out.println(speaker2.getVolume());//������ �ν��Ͻ�(20)
	
	}
}

package SingletonPattern;
//�̱��� ������ ���� �ϳ��� �ν��Ͻ��� ������ �� �ִ�.
//Singleton Pattern : �ϳ��� �����ؾ��� ��ü�� ���� ����
public class SystemSpeaker {
	
	static private SystemSpeaker instance; //�ϳ��� �ν��Ͻ��� �ϰ� �ܺο��� ���� ���� �ʵ���
	private int volume = 5;
	
	private SystemSpeaker() { //�ܺο��� �����ڸ� ȣ������ ���ϵ���
		
	}
	public static SystemSpeaker getInstance(){
		if(instance == null){
			//�ý��� ����Ŀ
			instance = new SystemSpeaker();
			System.out.println("���� ����"); //�α�
		}else{
			System.out.println("�̹� ����"); //�α�
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

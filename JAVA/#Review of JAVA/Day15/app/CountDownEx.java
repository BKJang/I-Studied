package app;

public class CountDownEx {
	//���ο��ٰ� throws ������ �� �� �ֱ� �ϴ�.
	//� �޼���� �� �������� �� �� �ִ�. ==>���ܰ� �߻��Ǽ� �������� �Դٸ�
	//�̰� �ѱ�ڴٴ� �Ŵϱ� �޾��ִ� �ְ� JVM
	//�ᱹ���� ������.
	
	//�������δ� ���ܰ� �Ȱ��°� ����.
		//��, ������ �޼��带 ���ٰų�, try~catch �ϱ� �������� �ᵵ �ǰ�
	
	public static void main(String[] args) throws Exception{
		//Ÿ�̸�
		/*int t = 5;
		for(int i = t; i>0; i--){//i�� 5�̰� i�� 0�� Ŭ���� i--����
			System.out.println("LEFT :: " + i);
			try{
					Thread.sleep(1000);
		
			}catch(Exception e){
				System.out.println("==");
			}
		}System.out.println("Time Over");*/
		
	//�̷��� Ÿ�̸Ӹ� ���� ���� �ʹ� ���Ƽ�..class�� �����ϱ�� �ߴ�.
		CountDown c = new CountDown(5);
		c.start();
		CountDown c1 = new CountDown(6);
		c1.start();
	}
}

//========================================================================
class CountDown{
	 int a;
		//�޼��峪 ������ ����� throws�� �ٿ��� �����ϸ�,�� �ȿ����� �ش� �ͼ����� �߻��ϴ� �޼��带
	 	//try~catch ���� ��밡���ϰ� �Ǽ� ���� ���谡 �����ϴ�.
	CountDown(int a) throws Exception{
		if(a<=0)
			throw new Exception();//a�� 0���ϸ� ���� ó��
		this.a = a;
	}
	 void start(){
		for(int i = a; i>0; i--){//i�� a�̰� i�� 0���� Ŭ���� i--����
			System.out.println("LEFT :: " + i);
			try{
					Thread.sleep(1000);
		
			}catch(Exception e){
				System.out.println("==");
			}
		}System.out.println("Time Over");
	}
}
class UserRunnable implements Runnable{
	int count;
	@Override
	public void run(){
		//Thread�� ���ÿ� �ؾ��ϴ� ��ü�� �ڵ带 ����
		while(true){
			if(count>=50) break;
			try {
				Thread.sleep(1500);//1.5�� ��������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			print();
		}//while
	}
	private synchronized void print() {
		//synchronized : ���ü� �߻� �Ƚ�Ŵ => Vector�� synchronized �� ���̱� ������ Vector�� ���ٿ� �ٸ� interface�� synchronized�� �ٿ��ָ� �ȴ�.
		System.out.println(Thread.currentThread() + " " + count++);//����� ���� �ʾұ� ������ Thread.�� ����� �Ѵ�.
	}
}
public class UserRunnableTest {
	public static void main(String[] args) {
		UserRunnable data = new UserRunnable();
		new Thread(data).start();
		new Thread(data).start();//���ü��� �߻��� �� �ִ�. select�� ����� ������ insert���� ��� ������ �� �� �ִ�.
	}
}

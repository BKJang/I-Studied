//1.
class UserThread extends Thread{
	int count;
	@Override
	public void run(){
		//Thread�� ���ÿ� �ؾ��ϴ� ��ü�� �ڵ带 ����
		while(true){
			if(count>=50) break;
			print();
		}//while
	}
	private void print() {
		System.out.println(currentThread() + " " + count++);
	}
}
public class UserThreadTest {
	public static void main(String[] args) {
		UserThread t1 = new UserThread();
		UserThread t2 = new UserThread();
		t1.start(); t2.start();
		//new Thread �ڵ����� ȣ���ϰ� ==> t1.run(), t2.run() ȣ�� =>���ÿ� ������ �Ǳ�� �ϳ� ������ �� ����.
		//��, Thread�� ���� ����� ���� ������ �����͸� �������� �ʴ´�. �ߺ� ó���� �ȵ� 1:2��, 2:2�� ... 50:2��
		
		//t1.run(); t2.run(); //Thread ������ �� �ƴϴ�!!!
		//System.out.println(Thread.currentThread()); // Thread[main,5,main] => Thread ����
		
	}
}

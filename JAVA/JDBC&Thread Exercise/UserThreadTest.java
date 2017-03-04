//1.
class UserThread extends Thread{
	int count;
	@Override
	public void run(){
		//Thread로 동시에 해야하는 객체나 코드를 정의
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
		//new Thread 자동으로 호출하고 ==> t1.run(), t2.run() 호출 =>동시에 실행이 되기는 하나 예측할 수 없다.
		//즉, Thread를 많이 만들면 좋다 하지만 데이터를 공유하지 않는다. 중복 처리가 안됨 1:2개, 2:2개 ... 50:2개
		
		//t1.run(); t2.run(); //Thread 분할한 거 아니다!!!
		//System.out.println(Thread.currentThread()); // Thread[main,5,main] => Thread 정보
		
	}
}

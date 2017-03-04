class UserRunnable implements Runnable{
	int count;
	@Override
	public void run(){
		//Thread로 동시에 해야하는 객체나 코드를 정의
		while(true){
			if(count>=50) break;
			try {
				Thread.sleep(1500);//1.5초 간격으로
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			print();
		}//while
	}
	private synchronized void print() {
		//synchronized : 동시성 발생 안시킴 => Vector는 synchronized 된 것이기 때문에 Vector를 쓸바엔 다른 interface에 synchronized를 붙여주면 된다.
		System.out.println(Thread.currentThread() + " " + count++);//상속을 받지 않았기 때문에 Thread.을 해줘야 한다.
	}
}
public class UserRunnableTest {
	public static void main(String[] args) {
		UserRunnable data = new UserRunnable();
		new Thread(data).start();
		new Thread(data).start();//동시성이 발생할 수 있다. select는 상관이 없지만 insert같은 경우 문제가 될 수 있다.
	}
}

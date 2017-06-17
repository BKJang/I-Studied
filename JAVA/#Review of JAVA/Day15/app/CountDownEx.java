package app;

public class CountDownEx {
	//메인에다가 throws 설정을 할 수 있긴 하다.
	//어떤 메서드든 걍 막가져다 쓸 수 있다. ==>예외가 발생되서 메인으로 왔다면
	//이걸 넘기겠다는 거니까 받아주는 애가 JVM
	//결국에는 터진다.
	
	//메인으로는 예외가 안가는게 좋다.
		//단, 안전한 메서드를 쓴다거나, try~catch 하기 귀찮으면 써도 되고
	
	public static void main(String[] args) throws Exception{
		//타이머
		/*int t = 5;
		for(int i = t; i>0; i--){//i는 5이고 i가 0이 클동안 i--실행
			System.out.println("LEFT :: " + i);
			try{
					Thread.sleep(1000);
		
			}catch(Exception e){
				System.out.println("==");
			}
		}System.out.println("Time Over");*/
		
	//이렇게 타이머를 찍을 일이 너무 많아서..class로 설계하기로 했다.
		CountDown c = new CountDown(5);
		c.start();
		CountDown c1 = new CountDown(6);
		c1.start();
	}
}

//========================================================================
class CountDown{
	 int a;
		//메서드나 생성자 설계시 throws를 붙여서 설계하면,그 안에서는 해당 익셉션이 발생하는 메서드를
	 	//try~catch 없이 사용가능하게 되서 빠른 설계가 가능하다.
	CountDown(int a) throws Exception{
		if(a<=0)
			throw new Exception();//a가 0이하면 예외 처리
		this.a = a;
	}
	 void start(){
		for(int i = a; i>0; i--){//i는 a이고 i가 0보다 클동안 i--실행
			System.out.println("LEFT :: " + i);
			try{
					Thread.sleep(1000);
		
			}catch(Exception e){
				System.out.println("==");
			}
		}System.out.println("Time Over");
	}
}
package data;

public class SuperPitcher extends Pitcher {
	int fav; //투수의 주특기(제일 잘 던지는 공)
	public SuperPitcher(String n, int i){
		super(n);//Pitcher에서 끌어옴
		fav = i;
	}
	//super.은 언제 사용하냐..
	//this.은 원래 클래스가 갖고 있는 필드와 쓰고자하는 변수가 겹칠 때.
	public String status(){ //원본에 있던 status()를 바꾸겠다.
		return super.status()+"주특기 == "+ fav; 
	}
	//추가!
	//변경도 가능!(오버라이드)
		//1.오버라이드를 허용해두었어야 된다.원본이 final이 아니었어야 함.
		//2.시야를 줄일 수가 없음.원본보다 작은 시야로 줄일 수가 없다.
	public Ball pitching(int m){
		Ball b;
		if(fav == m){
			b = new Ball(m);
		}else {
			stamina -=1 ;
			b= new Ball();
		}
		return b;
	}
}

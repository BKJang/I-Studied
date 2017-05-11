package model;
//static 필드
public class Marine {
	static{
		System.out.println("!!");//static 구문을 사용하면
								 //딱한번만 작동됨.
	}
	
	int hp;
	int atk;
	static int upgrade;//static 필드를 쓰면 일일히 한마리씩 업그레이드 해줘야 될것을
					   //한번에 다 업그레이드 시킬 수 있음.
					   //생성될때마다 개별적으로 유지시켜야 되는 필드가 아니라면,
					   //어차피 인스턴스간 공통적으로 써야하는 데이터라면
					   //static필드 사용.
	//초기화를 주의해야하는데 어떻게 하냐..
	//static 구문을 사용해야 한다.
	static{
		upgrade = 10;
	}
	public Marine(){
		hp=100;
		atk=30;
	//	upgrade =1;
	}
	public String info(){
		return hp+"/"+atk+"/"+upgrade;
	}
}

package review;

public class Circle {
	double radius;
	int cX;
	int cY;
	
	public Circle(double radius, int cX, int cY){
		this.radius = radius;
		this.cX = cX;
		this.cY = cY;
	}
	
	//추가기능은 설계하기 나름인데,
	//toString(), equals() 두 메서드는 오버라이드 해주는게 좋다
	
	@Override//이건 오버라이드다(주석과 비슷) 구분하기 위함
	public String toString(){
		return "radius : " + radius + " cX = " + cX + " cY = " +cY;
	}//toString메서드 오버라이드 => 메인에서 실행시키면 이 값을 기준으로 나옴
	@Override
	public boolean equals(Object obj){
		boolean b = obj instanceof Circle;//Circle 객체로 Object객체인 obj를 인식시키는게
										  //가능한지(속성을 갖고 있는지) 확인하는 연산자 
		if(obj instanceof Circle){
		Circle c = (Circle)obj;//Object의 객체 obj를 강제로 Circle 객체로 인식시킴
		if(this.radius != radius){
			return false;
		}else if(this.cX != c.cX){
			return false;
		}else if(this.cY != c.cY){
			return false;
		}else
			return true;
		}else{
			return false;
		}
	}
	
}

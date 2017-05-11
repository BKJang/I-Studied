package model;

public class Pitcher {
	//필드는 close
	//메서드는 open
	//이상한 데이터를 가지는걸 원천 차단할 수 있다.
	//필드 : 보통 변수들은 public을 붙이지 않는다.
	//그럼에도 불구하고, 바깥쪽 데이터 확인이나, 변경을 해야하는 상황이 생길 수 있으므로
	//값 설정받거나, 반환하는 메서드를 public으로 만들어둔다.
	String name;//외부에 의해서 직접적으로 절대 변환되어서는 안되는 것들은 public을 쓰지 않는다.
	int game;//경기수
	int win;
	int lose;
	//=====================================================
	public int currentWin(){//현재 값을 확인할 수 있도록 설계된 메서드를 getter라고 부름
		return win;
	}
	//값을 변경시킬 수 있게 설정받는 메서드를 setter라고 함.
	public boolean changeWin(int w){
		if(w+lose <= game){
			win = w;
			return true;
		}else{
			return false;
		}
	}
	
	//메서드와 생성자를 설정(App02에서 사용되는걸 분석해서 설계)
	public Pitcher(){
		
	}
	public Pitcher(String s){
		name = s;
	}
	public Pitcher(String s1, int a, int b, int c){
		name = s1;
		game = a;
		win = b;
		lose = c;
	}
	public String info(){
		return "투수["+name+"경기수 = "+game+"승수 = "+win+"패수 =" + lose+"]";
	}
	
	public double rate(){
		double r = (double) win/game;
		return r;
	}
	
	public boolean add(int a){
		
		if(a==0){
			game++;
		}else if(a==1){
			game++;
			win++;
		}else{
			game++;
			lose++;
		}
		return true;
	}
	
}

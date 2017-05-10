
public class Pitcher {
	//필드
	String name;
	int game;//경기수
	int win;
	int lose;
	//메서드와 생성자를 설정(App02에서 사용되는걸 분석해서 설계)
	Pitcher(){
		
	}
	Pitcher(String s){
		name = s;
	}
	Pitcher(String s1, int a, int b, int c){
		name = s1;
		game = a;
		win = b;
		lose = c;
	}
	String info(){
		return "투수["+name+"경기수 = "+game+"승수 = "+win+"패수 =" + lose+"]";
	}
	
	double rate(){
		double r = (double) win/game;
		return r;
	}
	
	boolean add(int a){
		
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

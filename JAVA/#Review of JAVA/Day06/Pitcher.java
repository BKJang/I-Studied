
public class Pitcher {
	//�ʵ�
	String name;
	int game;//����
	int win;
	int lose;
	//�޼���� �����ڸ� ����(App02���� ���Ǵ°� �м��ؼ� ����)
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
		return "����["+name+"���� = "+game+"�¼� = "+win+"�м� =" + lose+"]";
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

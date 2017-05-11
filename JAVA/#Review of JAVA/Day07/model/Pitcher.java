package model;

public class Pitcher {
	//�ʵ�� close
	//�޼���� open
	//�̻��� �����͸� �����°� ��õ ������ �� �ִ�.
	//�ʵ� : ���� �������� public�� ������ �ʴ´�.
	//�׷����� �ұ��ϰ�, �ٱ��� ������ Ȯ���̳�, ������ �ؾ��ϴ� ��Ȳ�� ���� �� �����Ƿ�
	//�� �����ްų�, ��ȯ�ϴ� �޼��带 public���� �����д�.
	String name;//�ܺο� ���ؼ� ���������� ���� ��ȯ�Ǿ�� �ȵǴ� �͵��� public�� ���� �ʴ´�.
	int game;//����
	int win;
	int lose;
	//=====================================================
	public int currentWin(){//���� ���� Ȯ���� �� �ֵ��� ����� �޼��带 getter��� �θ�
		return win;
	}
	//���� �����ų �� �ְ� �����޴� �޼��带 setter��� ��.
	public boolean changeWin(int w){
		if(w+lose <= game){
			win = w;
			return true;
		}else{
			return false;
		}
	}
	
	//�޼���� �����ڸ� ����(App02���� ���Ǵ°� �м��ؼ� ����)
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
		return "����["+name+"���� = "+game+"�¼� = "+win+"�м� =" + lose+"]";
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

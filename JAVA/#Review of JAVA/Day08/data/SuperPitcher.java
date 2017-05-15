package data;

public class SuperPitcher extends Pitcher {
	int fav; //������ ��Ư��(���� �� ������ ��)
	public SuperPitcher(String n, int i){
		super(n);//Pitcher���� �����
		fav = i;
	}
	//super.�� ���� ����ϳ�..
	//this.�� ���� Ŭ������ ���� �ִ� �ʵ�� �������ϴ� ������ ��ĥ ��.
	public String status(){ //������ �ִ� status()�� �ٲٰڴ�.
		return super.status()+"��Ư�� == "+ fav; 
	}
	//�߰�!
	//���浵 ����!(�������̵�)
		//1.�������̵带 ����صξ���� �ȴ�.������ final�� �ƴϾ���� ��.
		//2.�þ߸� ���� ���� ����.�������� ���� �þ߷� ���� ���� ����.
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

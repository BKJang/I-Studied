package model;
//static �ʵ�
public class Marine {
	static{
		System.out.println("!!");//static ������ ����ϸ�
								 //���ѹ��� �۵���.
	}
	
	int hp;
	int atk;
	static int upgrade;//static �ʵ带 ���� ������ �Ѹ����� ���׷��̵� ����� �ɰ���
					   //�ѹ��� �� ���׷��̵� ��ų �� ����.
					   //�����ɶ����� ���������� �������Ѿ� �Ǵ� �ʵ尡 �ƴ϶��,
					   //������ �ν��Ͻ��� ���������� ����ϴ� �����Ͷ��
					   //static�ʵ� ���.
	//�ʱ�ȭ�� �����ؾ��ϴµ� ��� �ϳ�..
	//static ������ ����ؾ� �Ѵ�.
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

package data;

public class Pitcher {
	String name; // �̸�
	int stamina; // ü��
	// �����ڴ� String�ϳ�¥����, (stamina=20) ����
	public Pitcher(String name) {
		Pitcher.this.name = name;
		stamina = 20;
	}
	// ���� ���¸� ���ڿ��� (name�� stamina�� �̿��ؼ� ��� ���ڿ� ����)
	public String status() {
		return "���� = " + name + ",ü��:" + stamina;
	}
	// getter�� ����Ǻ��� ����ð�. (�н��ϽǺ��� �ϰ�)
	// Ball�� �����ϴ� �޼��� 2�� .. �����ε� (�Ű��������¸� �ٸ��� �ߺ�����)
	public Ball pitching(int m) {
		// �̰� 0�̸� stamina -=2 , 1�̸� -=4, 2�̸� -=4 , 3�̸� -=3
		// ü���� �����ϰų�, 20�ۼ�ƮȮ���� ������ �����ǰ�
		Ball t;
		int[] c = {2, 4, 4, 3};
		if(stamina >= c[m]){
			if(Math.random()<0.2) {
				t= new Ball(m, true);
			}else {
				t= new Ball(m);
			}
		}else {
			t= new Ball(m, true);
		}
		stamina -=  c[m];
		return t;
	}
	public Ball pitching() {
		int r = (int)(Math.random()*4);
		Ball c = pitching(r);
		return c;
	}
	//===================================================================================
	public static void main(String[] args) {
		Pitcher p = new Pitcher("�豤��");
		Ball b1 = p.pitching();
		System.out.println(b1.info());
		System.out.println(p.status());
		Ball b2 = p.pitching(0);
		System.out.println(b2.info());
		p.pitching(2);
		p.pitching(1);
		p.pitching(2);
		p.pitching(2);
		Ball b3 = p.pitching(3);
		System.out.println(b3.info());
		System.out.println(p.status());
	}
}
















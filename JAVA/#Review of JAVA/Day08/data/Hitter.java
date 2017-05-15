package data;

public class Hitter {
	String name; // �̸�
	int tot; // �� �ֵθ� ȸ��
	int hit; // ���� ȸ��
	int favorite; // �����ϴ� ����
	
	// ������ �߰�.. String ������, (�̸�����, favorite = 0)
	// ������ �߰� .. String, int ������ (�̸�, favorite �����ǰ�)
	public Hitter(String name, int fav) {
		this.name = name;
		favorite = fav;
		tot = 0;
		hit = 0;
	}

	public Hitter(String name) {
		this(name, 0);
	}

	// ��¹��ڿ� ����ִ�
	// ������ �����ϴ±��� (0/1/2/3 ==> ���ڿ��� �ٲ㼭) tot, hit �� ����
	public String status() {
		String[] strs = { "�н�Ʈ��", "Ŀ��", "�����̴�", "ü������" };
		return "Ÿ�� = " + name + ",����:" + strs[favorite] + "(" + tot + " / " + hit + ")";
	}
	// �޼��尡 �ϳ� ��
	public boolean batting(Ball target) {
		tot++;
		if (target.getMistake() == true) {
			hit++;
			return true;
		} else if (target.getType() == this.favorite) {
			hit++;
			return true;
		} else {
			return false;
		}
		// ���������� ������ true
		// �����ϴ� ���̸� true
		// �װ� �ƴϸ� ���� false
		// �׷��鼭, tot, hit�� ��ȭ�� �Ͼ�� ��
	}
	// =====================================================================
	public static void main(String[] args) {
		Hitter h1 = new Hitter("�ں�ȣ", 2);
		System.out.println(h1.status());
		Ball b1 = new Ball(2);
		System.out.println(b1.info());
		boolean r = h1.batting(b1);
		System.out.println(r);
		Pitcher p1 = new Pitcher("�豤��");
		Ball b2 = p1.pitching();
		h1.batting(b2);
	}

}


public class Basic05 {
	public static void main(String[] args) {
		//���� ���� -> boolean ? data1 : data2;
		//true, false�� ���� �ٸ� �����͸� �������ִ� ����
		//if��� ������ ����ϰ� �۵��� �ϱ� �ϴµ�, ��Ȳ�� ���� �ٸ� ���� �����ؼ� ����ϱ⿣ Ưȭ
		int a = 16;
		
		System.out.println(a>10 ? 1 : -1);
		System.out.println(a>0 ? "��" : "��");
		
//================================================================
		
		int m = (int)(Math.random()*21)-10;
		
		int absM = m>0 ? m : -m;
		
		System.out.println(m+" ==> " +absM);
		
		int age=(int)(Math.random() *20)+10;
		String ages = (age>=19) ? "����" : "�̼�����";
		System.out.println(age + "���� " + ages + "�Դϴ�.");
	}
}

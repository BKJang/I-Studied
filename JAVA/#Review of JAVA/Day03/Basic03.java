
public class Basic03 {
	public static void main(String[] args) {
		int lv=4;
		int exp = 65;
		System.out.println("������ : " + lv + " exp : " + exp);
		
		int gain = (int)(Math.random()*50)+10;
		System.out.println("ȹ�� EXP : " + gain);
		
		exp = exp+gain; //������ ȹ�氪�� ���� ������ �ٲ�
		
		// exp 100�Ѿ�� ���� 1 ����, exp�� �ʱ�ȭ
		
		if(exp>=100){
			lv = lv + 1; // lv += 1
			exp = exp - 100; // exp -= 100
		}else{
			lv=lv;
			exp = exp;
		}
		//if ~ else�� �⺻�������� �پ��� �������� ���� : �ܼ� if
		System.out.println("�ٲ���� : " + lv + " exp : " + exp);
	}
}

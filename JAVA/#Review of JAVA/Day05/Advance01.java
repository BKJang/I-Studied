
public class Advance01 {
	public static void main(String[] args) {
		// ���α׷��̶��� ������ ����&���� (�б�ó��,�ݺ�ó��)
		// �� ������ü�� ȿ�������� ó���ϱ� ���� ��µ��� �־���,
		// ������� ������������ ó��, ��ü�������� ó��
		// �ϳ��� ������Ȳ�� ����� ����.
		// ��������������α׷��� �����ٰ� ����
		String no ="31��9135";	// ������ȣ
		int used = 76;	// �����ð�(��)
		// �� ������ ��������� ���
		int fee;
		if(used <=10) {
			fee = 0;
		}else if(used <= 60 ) {
			fee = 3000;
		}else {
			fee = 3000;
			int over = used - 60;
			while(over > 0 ){
				fee += 500;
				over -= 15;
			}
		}
		System.out.println(no+"/ �����ð�:"+used+"/���:"+fee);
		// ó���ؾߵ� �����Ͱ� �� �ְ�, �� �����͵� ���� ó���� �ؾߵǴ� ��Ȳ�� ����
		String no2 ="41��1145";
		int used2 = (int)(Math.random()*80);
		int fee2;
		if(used2 <=10) {
			fee2 = 0;
		}else if(used2 <= 60 ) {
			fee2 = 3000;
		}else {
			fee2 = 3000;
			int over = used2 - 60;
			while(over > 0 ){
				fee2 += 500;
				over -= 15;
			}
		}
		System.out.println(no2+"/ �����ð�:"+used2+"/���:"+fee2);
	}
}
//=============================================================================================




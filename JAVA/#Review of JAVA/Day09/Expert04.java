import poly2.*;

class RandomGame extends Game{
	public void init(){//init�� �ƴϸ� �۵��� �� ����.. �������̵��� ���ѳ��� ������ �۵� ����
		System.out.println("��������!");
	}
	public void destroy(){
		System.out.println("���� �ƿ�!");
	}
	
}
//=============================================
public class Expert04 {
	public static void main(String[] args) {
		RandomGame r = new RandomGame();
		Hunt.run(r, 2);
	}
}

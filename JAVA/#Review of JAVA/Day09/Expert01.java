
public class Expert01 {
	public static void main(String[] args) {
		//�̹� ���谡 ���� Ŭ������ �������� ���, �߰�/�����Ų �Ļ�Ŭ������ ������ �� �ִ�.(��� = Ȯ��)
		
		//��Ӱ��迡�� �߻��ϴ� ���� �ִ�.(�������̶�..)
		//�ϳ��� new�� �Ͼ�鼭 instance ������ ���ٵ�, 
		//���� �� �ν��Ͻ�(=��ü)�� ���� �ν��Ͻ��� ����ü�̴�.
	
		new Korean(); //�� �ȿ��� �������� ���°� �ִ�.
		new Japanese();
		
		//�̰� ���α׷������� � �۾��� �ǳĴ� �ǵ�..
		Human h = new Asian(); //h�� �����ų �� �ִ� Human �Ӽ��� �ִ� ��ü��� ���� ����
		System.out.println(h.getClass()); //��� instance�� ���ԵǴ� �⺻
		Korean k = new Korean();
		Asian a = new Korean();
		System.out.println(a.getClass());
		//American e = new Korean(); //American �� Korean�� �ƿ� �ٸ� ��Ʈ�� ��ü ������ �ȵ�
		System.out.println(a.info()); //�������̵尡 ���ִٸ�, ���� instance �޼��尡 �۵���
		//���� Human Ŭ������ �ִ��� "�ΰ�"�̾����� �޼������ �����Ƿ� �����������
		//�׷��� ����� "�ѱ���"�� �� ��
		//�ν��Ͻ� ������ �Ÿ������ �޾Ƶξ���, ���� �޼��尡 �۵�
		
		// a.rank(); //��� �������� �����ϴ� �޼��常 ȣ��;
		
	}
}

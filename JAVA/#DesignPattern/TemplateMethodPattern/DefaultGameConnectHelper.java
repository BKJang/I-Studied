package TemplateMethodPattern;

public class DefaultGameConnectHelper extends AbstConnectHelper {

	@Override
	protected String doSecurity(String string) {
		System.out.println("���ڵ�� ����");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("���̵�/��ȣ Ȯ��");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("���� Ȯ��");
		//�������� �����̸�, ������ ���̸� �� �� �ִ�
		//���̸� Ȯ���ϰ� �ð��� Ȯ���� ���� ������ �ƴ϶�� shutdown(������ ���� ������)
		
		return 0; //���� �����Ͱ� �����Ѵٰ� �ϴ� ����
	}

	@Override
	protected String connection(String info) {
		System.out.println("���� ���� �ܰ�");
		//�����带 �Ѱ��ְų� ������ �� �ִ� �ּҸ� �Ѱ��ֵ���
		return null;
	}

}

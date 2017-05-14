/*Template Method Pattern : �˰��� ������ �޼ҵ忡 �����ϰ�
 *���� Ŭ�������� �˰��� ������ ������� �˰����� �������ϴ�
 *
 *�����Ϸ��� �˰����� ������ ���μ����� �ִ�
 *�����Ϸ��� �˰����� ���氡�ɼ��� �ִ�
 *
 *1. �˰����� ���� �ܰ�� ������
 *2. ������ �˰����� �ܰ踦 �޼ҵ�� ����
 *3. �˰����� ������ ���ø� �޼ҵ带 �����
 *4. ���� Ŭ������ ������ �޼ҵ���� ����
 */
package TemplateMethodPattern;

public abstract class AbstConnectHelper {
	
	//�ܺηκ����� �����̱� ������ �ܺη� �巯������ �ȵȴ�.(but ����Ŭ�������� ��밡���ϵ��� : private�� �ȵ�)
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	//���ø� �޼ҵ�
	public String requestConnection(String encodedInfo){
		
		//���� ���� - ��ȣȭ�� ���ڿ��� ���ڵ�
		String decodedInfo = doSecurity(encodedInfo);
		
		//��ȯ�� ���� ������ ���̵�, ��ȣ�� �Ҵ�
		String id = "aaa";
		String password = "abc";
		
		if(!authentication(id, password)){
			throw new Error("���̵� ��ȣ�� ��Ȯ���� �ʽ��ϴ�.");
		}
		
		
		String userName = "JBK";
		int key =  authorization(userName);
		
		switch(key){
		case -1 :
			throw new Error("shutdown���� ���� ���� �Ұ�");
			//��ȭ�� �˰��� ���� ��������(��)
			
		case 0 :
			System.out.println("���� ������");
			break;
		
		case 1 :
			System.out.println("���� ȸ��");
			break;
		
		case 2 :
			System.out.println("���� ȸ��");
			break;
		
		case 3 :
			System.out.println("���� ����");
			break;
		
		default ://��Ÿ��Ȳ
			break;
			
		}
		return connection(decodedInfo);
	}
}

package TemplateMethodPattern;
/*�䱸 ����
 *1.���� ������ ������ ����
 *- requestConnection(String str) : String
 *
 *2.������ ���� ���ӽ� ������ ���
 *- ���� ���� : ���� ���� �κ��� ó��
 *	--doSecurity(String string) : String
 *
 *- ���� ���� : username�� password�� ��ġ�ϴ��� Ȯ��
 *	--autentication(String id, String password) : boolean
 *
 *- ���� ���� : �����ڰ� ����ȸ������ ����ȸ������ ���� ���������� Ȯ��
 *	--authorization(String userName) : int
 *
 *- ���� ���� : �����ڿ��� Ŀ�ؼ� ������ �Ѱ��ش�.
 *	--connection(String info) : String
 *
 * ��ȭ�� ���� �κ�
 * -���� �κ��� ������å�� ���ؼ� ��ȭ�Ǿ���.
 * -�����ο��� �� 10�� ���Ŀ� ������ ���ѵǵ��� �Ѵ�.
 */
public class Application {
	public static void main(String[] args) {
		AbstConnectHelper helper = new DefaultGameConnectHelper();
		
		helper.requestConnection("���̵�/��ȣ �� ���� ����");
		
		
	}
}


public class Essential02 {
	public static void main(String[] args) {
		// ���ڿ� �� - equls / equalsIgnorCase
		String s1 = "java";
		boolean b = s1.equalsIgnoreCase("JAVA");
		System.out.println(b);
		//int compareTo / compareToIgnoreCase
		String n1 = "����";
		int d = n1.compareTo("����"); //�������� �� �ְԲ�. �� ���ڿ��� ����
		int d2 = n1.compareTo("���");
		//��ü�� ������ ����, ũ�� ���
		System.out.println(d);
		System.out.println(d2);
		
		//���ڿ� ��ü�� �м�
		//int length() : ����
		//int indexOf(String), int indexOf(String, int)
		//int lastIndexOf(String), int lastIndexOf(String, int)
		int z = s1.length();//���� ��
		System.out.println(z);
		
		String mail = "jp302119@naver.com";
		int z1 = mail.indexOf("1");//���ڿ��� ���°�� �ִ��� 8��°�� ������ 7�̶�
		//ã�� ���ڿ��� ������ -1�� ��
		int z2 = mail.lastIndexOf("na", 20);//�Ųٷ� ã�Ƴ��°�
		System.out.println(z1);
		System.out.println(z2);
		
		//���ڿ� �и� String[] split(String) : �����ڷ� ���̴� ���ڴ� �ȵǴ� �͵� �ִ�.
		String msg = "���#�ڹ�#���α׷����";
		String[] ar = msg.split("#");//Ư�� ���ڿ��� �������� ���ڿ��� �и�
		//���/�ڹ�/���α׷����
		System.out.println(ar[2]);
		
		//���ڿ� ���� String substring(int), String substring(int, int)
		String data = "�����ٶ󸶹ٻ�";
		String sd1 = data.substring(2);//�� ĭ���� ������
		String sd2 = data.substring(4, 6);//��ĭ���� ��ĭ�ձ���
		System.out.println(sd1);
		System.out.println(sd2);
	}
}

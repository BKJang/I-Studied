
public class Basic06 {
	public static void main(String[] args) {
		String[] ar = {"�ڽ�", "3", "17"};
		// ar�� ��� �����͸� String���� �ν��Ѵ�.
		//String r = (ar[2]<1000)? "�̳�": "����";
		 //String --> int�� ��ȯ�ϴ� ���� �˾ƾ���
		int a = Integer.parseInt(ar[2]);
		System.out.println("a=="+ a);
	}
}

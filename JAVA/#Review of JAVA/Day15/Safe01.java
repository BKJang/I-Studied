import java.net.URL;
public class Safe01 {
	public static void main(String[] args) {
		// �̶����� �غô� ��� ���α׷�(ó������) ���� �������� �ſ� ��������.
		// ���� ��, 
		// ������ ���ڿ��ϲ���� ����ϰ�, parseInt�� �ߴµ�, ������ �����Ͱ� �ƴϿ��ٴ���..
		// ��ü ĳ����(��ȯ) �۾��� �ߴµ�, �ش� ��ü Ÿ���� �ƴ� ��Ȳ�̶����..
		/* ���ڿ� substring�� �ؼ� ���µ�, ����ĭ�� �����ϴ��� ������,
		String pass = "q";
		pass.substring(0, 2);
		*/
		//
		//�ڹ� ���α׷� �����Ǹ鼭 ó���Ǵ� �۾� �߿� Exception �̶�� ��ü�� �ִµ�
		//�� Exception��ü�� �ڹٰ���ӽ�(JVM)�� ���� ���� ��, JVM�� ������ ���谡 �Ǿ��־ �׷���.
		
		//Integer.parseInt("dsadsa");
		NumberFormatException nfe = new NumberFormatException();
		System.out.println("===");
		throw nfe;
	}
}

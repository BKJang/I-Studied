
public class Expert05 {
	public static void main(String[] args) {
		// Wrapper Ŭ������ �θ��� Ŭ������.
		// Boolean, Integer, Long, Float, Double, Character 
			// �����ڴ� �� �ΰ����� ������ �ִ�, ���׵� �⺻������ or ���ڿ�
		// �뵵..? �⺻�ڷ����� ��üȭ ��Ű�� Ŭ����
		boolean t = true;
		Boolean b1 = new Boolean(true);
		
		Integer i = new Integer(3);	// Wrap
		Integer ii = new Integer("3");	// Wrap
		System.out.println(i == ii);
		System.out.println(i.equals(ii));
		System.out.println(i.toString());
		
		Character c = new Character('��');	// Wrap

		// unWrap ��� ����
		int m = i.intValue();
		char z = c.charValue();
		
		// ������ ó���� �ϴµ�, ��ü���¸� ó�����ִ� Ŭ������ �ִ�. �׶� ����ϰ� �ɰŴ�.
		
		// Wrapper Ŭ������ ó�����ټ� �ִ� ����߿� �� �˾ƵμžߵǴ� ��� parsing
		// String ===> �⺻�� �����ͷ� ó�����ִ� ���  , 
		int n = Integer.parseInt("4324523");
		double zz = Double.parseDouble("333.333");
		Boolean.parseBoolean("");
		// �⺻�������� ==> String���� ó�����ִ±��
		String mz = Integer.toString(43243);
		
		
		
	}
}











public class Advance02 {
	public static void main(String[] args) {
		// ������ ���� ���鿡�� ��ȭ  
		// �����͸� ��� ó���Ҽ� �ְ� ���� # class ��� Ű���带 ���.
		// ����?  - new ��� Ű���� 
		new Park();	// Park (String no/int use �̰� ������ �ִ�)�� �������.
			// ������� �ӳ�..? ==>  ���ٰ��� �߻�
		System.out.println( new Park() );	// �ν��Ͻ�(=������ǰ/��üȭ) ����	
		System.out.println( new Park() );	// 
		System.out.println( new Park() );
		// ������� �ָ� ����ϱ� ���ؼ�. �� ���� �޾Ƶθ� �� . ����Ÿ���� �����ص� �̸�
		Park p;	// �̰� ��ü�� Park�� �����Ѱ� �ƴ�..!
		Park d1 = new Park();
			// d1�� ���ؼ� �����ؼ� ���
			d1.no ="31��9441";
			d1.use = 156;
		System.out.println(d1.no+","+d1.use);	
			
		Park d2 = new Park();
			d2.no ="31��9441";	
			d2.use = 156;
		System.out.println(d2.no+","+d2.use);	
		//==========================================
		System.out.println(d1.no == d2.no);
		System.out.println(d1.use == d2.use);
		System.out.println(d1 == d2);
		
		Park t = d2;	// Park instacne���� ó���� ����. �̹� ������� ���� ������ �ִ�.	
		System.out.println(t.no+","+t.use);	
		t.no ="11��1234";
		t.use =12;
		System.out.println("==============================");
		System.out.println(t.no+","+t.use);	
		System.out.println(d1.no+","+d1.use);	
		
		System.out.println("d1==" +d1);
		Movie k = new Movie();
		
		
		
	}
}

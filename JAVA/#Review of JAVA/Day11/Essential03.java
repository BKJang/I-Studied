//==================================================
class Test implements Comparable{
	int data;
	Test(int data){
		this.data = data;
	}
	@Override
	public int compareTo(Object obj){
		Test t = (Test)obj;
		if(this.data == t.data)
			return 0;
		else if(this.data < t.data)
			return 1;
		else
			return -1;
	}
	public String toString(){
		return "{data=" +data+ "}";
	}
}

public class Essential03 {
	public static void main(String[] args) {
		//Comparable �������̽�
		Comparable i = new Integer(44);
		Comparable ii = new Integer(44);
		
		String m1 = "�ڹ�";
		String m2 = "�ڷ�";
		
		//�����Ͱ� �ְ� �Ǵ� ������ �� Comparable�� �͵� implements�� �ɾ�ΰ� 
		//���踦 �ص� �ʿ䰡 ����
		//���踦 �صθ� �ڵ����� ���� ������ ���� ���� �ִ�.
		int n = i.compareTo(ii);
		System.out.println(n);
		
		Test t1 = new Test(99);
		Test t2 = new Test(98);
		int nn = t1.compareTo(t2);
		System.out.println(nn);
		//�������̵� ���ѳ����� � ������ ���� ���� �ֳ�..
	}
}

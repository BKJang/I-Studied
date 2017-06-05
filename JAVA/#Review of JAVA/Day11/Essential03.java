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
		//Comparable 인터페이스
		Comparable i = new Integer(44);
		Comparable ii = new Integer(44);
		
		String m1 = "자바";
		String m2 = "자료";
		
		//데이터가 주가 되는 설계일 때 Comparable란 것도 implements를 걸어두고 
		//설계를 해둘 필요가 있음
		//설계를 해두면 자동으로 정렬 지원을 받을 수가 있다.
		int n = i.compareTo(ii);
		System.out.println(n);
		
		Test t1 = new Test(99);
		Test t2 = new Test(98);
		int nn = t1.compareTo(t2);
		System.out.println(nn);
		//오버라이드 시켜놓으면 어떤 도움을 받을 수가 있냐..
	}
}

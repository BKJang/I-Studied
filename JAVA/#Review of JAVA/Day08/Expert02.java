//java���� �ϳ��� Ŭ������ ������ ������ �� �ִ�.(��, �Ϲ�Ŭ������ ��)

class Base{
	Base(){
		System.out.println("Base()");
	}
}

//========================================================
class Book extends Base{
	Book(){
		System.out.println("Book()");//���
	}
	Book(String s){
		super();
		System.out.println("Book()" + s);
	}
}
//========================================================
class Magazine extends Book {//Book�� ����߱� ������ ��½� Book()�� ��µ�
							 //extends�� �ɸ� ������ ���� �� �⺻�����ڸ� ã�� ������
							 //���� ��Ȳ�̰ų�, �ٸ� �����ڸ� ȣ��ǰ� �ϸ鼭, ������ ���� ��
							 //super��� Ű���带 ����ϸ� �ȴ�.
	Magazine(){
		super("�޷�");//super�� this�� ���ÿ� �� �� ����.
		System.out.println("Magazine()");
	}
	Magazine(String s){
		super(s);
		System.out.println("Magazine(String)" + s);
	}
}
//========================================================
public class Expert02{
	public static void main(String[] args) {
		new Magazine();
		
	}
}

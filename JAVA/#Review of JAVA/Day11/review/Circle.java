package review;

public class Circle {
	double radius;
	int cX;
	int cY;
	
	public Circle(double radius, int cX, int cY){
		this.radius = radius;
		this.cX = cX;
		this.cY = cY;
	}
	
	//�߰������ �����ϱ� �����ε�,
	//toString(), equals() �� �޼���� �������̵� ���ִ°� ����
	
	@Override//�̰� �������̵��(�ּ��� ���) �����ϱ� ����
	public String toString(){
		return "radius : " + radius + " cX = " + cX + " cY = " +cY;
	}//toString�޼��� �������̵� => ���ο��� �����Ű�� �� ���� �������� ����
	@Override
	public boolean equals(Object obj){
		boolean b = obj instanceof Circle;//Circle ��ü�� Object��ü�� obj�� �νĽ�Ű�°�
										  //��������(�Ӽ��� ���� �ִ���) Ȯ���ϴ� ������ 
		if(obj instanceof Circle){
		Circle c = (Circle)obj;//Object�� ��ü obj�� ������ Circle ��ü�� �νĽ�Ŵ
		if(this.radius != radius){
			return false;
		}else if(this.cX != c.cX){
			return false;
		}else if(this.cY != c.cY){
			return false;
		}else
			return true;
		}else{
			return false;
		}
	}
	
}

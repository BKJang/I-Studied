package Ch19;

class RectangleTest{
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(1, 2, 4, 5);
		Rectangle rec2 = new Rectangle(2, 3, 4 ,5);
		Rectangle rec3 = new Rectangle(1, 2, 4, 5);
		
		rec1.showPosition();
		rec2.showPosition();
		rec3.showPosition();
		
		if(rec1.equals(rec2)){
			System.out.println("rec1 �� rec2�� ��ġ������ ����");
		}else
			System.out.println("rec1 �� rec2�� ��ġ������ �ٸ���");
		
		if(rec1.equals(rec3)){
			System.out.println("rec1 �� rec3�� ��ġ������ ����");
		}else
			System.out.println("rec1 �� rec3�� ��ġ������ �ٸ���");
		}
		
	}


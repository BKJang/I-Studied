class RectangleTest{
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(1, 2, 4, 5);
		Rectangle rec2 = new Rectangle(2, 3, 4 ,5);
		Rectangle rec3 = new Rectangle(1, 2, 4, 5);
		
		//show location of rectangles.
		rec1.showPosition(); 
		rec2.showPosition();
		rec3.showPosition();
		
		//process of comparing location of rectangles.
		if(rec1.equals(rec2)){
			System.out.println("rec1 and rec2's location are same.");
		}else
			System.out.println("rec1 and rec2's location are diff.");
		
		if(rec1.equals(rec3)){
			System.out.println("rec1 and rec3's location are same.");
		}else
			System.out.println("rec1 and rec3's location are diff.");
		}
		
	}


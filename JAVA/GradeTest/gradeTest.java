package GradeTest;

public class gradeTest {
	public static void main(String[] args) {
		grade gr = new grade();
		
		
		try{
			gr.output();
			
		}catch(IntegernumException e){
			e.printStackTrace();
		}
		System.out.println("end");
	}
}

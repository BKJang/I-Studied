public class gradeTest {
	public static void main(String[] args) {
		grade gr = new grade();
		
		
		try{
			gr.output();
			
		}catch(IntegernumException e){
			System.out.println(e.getMessage());
		}
	}
}

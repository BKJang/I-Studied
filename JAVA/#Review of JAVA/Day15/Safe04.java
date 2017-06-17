
class Handle{
	//throws...
	Handle(){
		
	}
	Handle(String s) throws Exception{
		if(s==null){
			Exception e = new Exception();
			throw e;
		}
	}
	static void run() throws Exception{
		
	}
	boolean create() throws Exception{
		return false;
	}
	boolean delete(){
		return true;
	}
	
}

//=========================================================
public class Safe04 {
	public static void main(String[] args) {
		Handle h = new Handle();
		//new Handle("Dssadf");//오류가 뜸. Exception이 걸려있는 생성자는 그냥 쓸 수 없다.
		h.delete();//이건 throws가 안걸려 있기 때문에 그냥 쓸 수 있다.
		try{
			new Handle(null);//위의 생성자에서 null값이면 Exception 처리.
		}catch(Exception e){
			System.out.println("!!");
		}
		//throws를 일반 개발자들이 쓸 상황이 있을까??
			//어떻게 응용할 수 있을까..
			//
	}
}

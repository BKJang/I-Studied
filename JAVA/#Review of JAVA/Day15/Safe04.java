
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
		//new Handle("Dssadf");//������ ��. Exception�� �ɷ��ִ� �����ڴ� �׳� �� �� ����.
		h.delete();//�̰� throws�� �Ȱɷ� �ֱ� ������ �׳� �� �� �ִ�.
		try{
			new Handle(null);//���� �����ڿ��� null���̸� Exception ó��.
		}catch(Exception e){
			System.out.println("!!");
		}
		//throws�� �Ϲ� �����ڵ��� �� ��Ȳ�� ������??
			//��� ������ �� ������..
			//
	}
}

class UserObjectMethodBException extends Exception{
	UserObjectMethodBException(String messeage){
		super(messeage);
	}
}
class UserObject{
	public UserObject() throws UserObjectMethodBException{
		methodA();
		System.out.println("UserObject()");
	}

	private void methodA() throws UserObjectMethodBException {
		methodB();
		System.out.println("methodA");
	}

	private void methodB() throws UserObjectMethodBException {
		if(true)//에러 상황이 명확할 때!!
			throw new UserObjectMethodBException("B method error!!");
		System.out.println("methodB");
	}
}
public class ExceptionTest_03 {
	public static void main(String[] args) {
			try {
				new UserObject();
			} catch (UserObjectMethodBException e) {
				e.printStackTrace();
			} catch (Exception e){
				e.printStackTrace();
			} catch (Throwable e){//Error 관리 : StackOverflow
				e.printStackTrace();
			} finally{
				System.out.println("마지막엔 자원을 반환");
			}
		System.out.println("end");
	}
}

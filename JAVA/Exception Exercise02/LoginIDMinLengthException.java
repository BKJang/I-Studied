/** 회원의 아이디는 8자 이상이어야 한다.*/
public class LoginIDMinLengthException extends RuntimeException{
	LoginIDMinLengthException(String messeage){
		super(messeage);
	}
	public LoginIDMinLengthException(){
		this("8자 이상만");
	}
}
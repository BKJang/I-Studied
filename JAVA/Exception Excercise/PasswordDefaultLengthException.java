/** 비밀번호는 숫자만 4자여야 한다.*/
public class PasswordDefaultLengthException extends RuntimeException{
	PasswordDefaultLengthException(String messeage){
		super(messeage);
	}
	public PasswordDefaultLengthException(){
		this("숫자 4자만!!");
	}
}
/** ȸ���� ���̵�� 8�� �̻��̾�� �Ѵ�.*/
public class LoginIDMinLengthException extends RuntimeException{
	LoginIDMinLengthException(String messeage){
		super(messeage);
	}
	public LoginIDMinLengthException(){
		this("8�� �̻�");
	}
}
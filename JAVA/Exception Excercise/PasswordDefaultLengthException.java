/** ��й�ȣ�� ���ڸ� 4�ڿ��� �Ѵ�.*/
public class PasswordDefaultLengthException extends RuntimeException{
	PasswordDefaultLengthException(String messeage){
		super(messeage);
	}
	public PasswordDefaultLengthException(){
		this("���� 4�ڸ�!!");
	}
}
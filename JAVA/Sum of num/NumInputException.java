public class NumInputException extends Exception {//만들어 놓은 Exception class
	public NumInputException(){
		super("각각의 입력되는 정수는 0부터 10000까지입니다.");
	}
}

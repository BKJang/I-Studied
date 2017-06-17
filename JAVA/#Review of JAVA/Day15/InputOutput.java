//Input(�Է�), Output(���) ������ �Ǵ°� ���α׷�
import java.io.*;
// io ��Ű���� �ִ� Ŭ������ ����ϸ�
//Ű���� ����Ͱ� �ƴ� �����ε� ������� ����������.
//���ڿ������ ����� ���� �͵� ����������.

//���� �� ���Ǵ� Ŭ���� �����̳� �޼������ ���� �� throws IOException�� �ɷ��ִ�.
//IOException�� ó���ؾ����� ����� �� �ִ�.

public class InputOutput {//IO..
	public static void main(String[] args) {
		//Input�� �� �� �ִ� ���� ���� ���� �ִ�.
		//���κ��� �Է��� ���������� ����..����ų� Ȯ���ؾߵǴ� Input�� �ٸ���.
		
		//Ű����κ��� �Է¹��� �� �ִ� InputStream�� System.in�̶�� Ȯ���� �Ǿ��ִ�.
		//InputStream is = System.in;
		
		//�ڱ� �ý��ۻ��� ���Ϸκ��� �Է¹�������, FileInputStream�̶� �� ����ϸ� ��
		
		try{
			InputStream is = new FileInputStream("d:image.jpg");//���Ϸκ��� �о��
			//String���� ���ϸ��� ���ų�
			//File��ü�� �����ؼ� ����־ ��.
			System.out.println("is Ȯ�� ����");
			//int read(); == �� ��ġ�� �ǹ��ϴ°�. 1����Ʈ �о�ͼ� ��ġȭ
			int z = is.read();
			
			InputStream iss = new FileInputStream(new File("d:/Simple2.class"));//������ �ٸ� ���ڿ� ���³� �ٸ� ���·� �νĽ�Ű�� ����.
			System.out.println("iss Ȯ�� ����");
			int zz = iss.read();
			System.out.println("zz== " +zz);
			
		}catch(Exception e){
			System.out.println("E :: " +e);
		}
		
	}
}

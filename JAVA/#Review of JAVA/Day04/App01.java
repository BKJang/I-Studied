
public class App01 {
	public static void main(String[] args) {
		//���� ���ڸ��� ������ ������ ���� *�� ǥ���ϴ� ���α׷�
		String id = "jp30219";
		String sid;
		sid = id.substring(0, 2);//���� ���ڸ��� ���ش�
		
		while(id.length()>sid.length()){//sid�� ���ڿ� ���̰� id�� ���ڿ� ���̺��� ���� ���� �ݺ� ����
			
			sid += "*";
			
		}
		
		System.out.println(sid);
	}
}

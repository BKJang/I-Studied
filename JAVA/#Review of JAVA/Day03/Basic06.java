
public class Basic06 {
	public static void main(String[] args) {
		String mode = "���";
		String rst;
		
		switch(mode){
		case "���" :
		case "add" :
			rst = "���ó�� �Ǿ����ϴ�.";//������� ����ǹǷ� ����� �ԷµǾ� �־ ������� break������ ��
			break;
		case "����" :
		case "del" :
			rst = "����ó�� �Ǿ����ϴ�.";
			break;
		default :	
			rst = "�ٽ� �����ּ���.";
		}
		System.out.println(mode + " ==> " + rst);
	}
}

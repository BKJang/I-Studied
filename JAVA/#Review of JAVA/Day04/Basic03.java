
public class Basic03 {
	public static void main(String[] args) {
		//�ݺ�ó���� ����Ű�� while, do-while
			//��� ó���Ҳ��� �ƴ��� �Ǵܽĸ� �������ָ� ������ - �����Ұ�
		//for
		//�ǴܽĿܿ� �߰��� ������ ����(�ݺ� ������ ó���� ��, �� �ݺ����� ó���� ��)
			//�� ��� ������ [;]���� - ��������
	
		int exp = 0;
		//for(���۽� ���� ; �׽�Ʈ ���� ; �Źݺ��� ó������
		for(System.out.println("START") ; exp<100 ; System.out.println("�m")){
			int g = (int)(Math.random()*10+2);
			System.out.println(g);
			exp += g;
		}//for�� ����
		System.out.println("EXP = " + exp);
	}
}

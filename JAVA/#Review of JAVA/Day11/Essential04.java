import java.util.Arrays;

public class Essential04 {
	public static void main(String[] args) {
		// �׳��� ���ǹ��ϰ�.. Comparable �������̽��� �ɾ�θ�
		String[] ar = {"����", "����", "���", "����", "��å"};
		
		Arrays.sort(ar);//sorting
		String m = Arrays.toString(ar);
		System.out.println(m);
		
		Test[] arr = {new Test(44), new Test(79), new Test(111), new Test(1)};
		String mm = Arrays.toString(arr);//�迭 �ȿ� ���ִ� ������ ���ڿ������� �� �ҷ�����
										 //sorting �� �� ����
										 //toString�� �Ⱦ��� �����Ͱ����� ����� �ǹǷ�
										 //�����ϸ� �������̵��ϴ� ��
		System.out.println(mm);
		Arrays.sort(arr);//sorting
		System.out.println(Arrays.toString(arr));
	}
}

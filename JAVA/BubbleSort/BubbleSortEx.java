import java.util.Scanner;

public class BubbleSortEx {
	public static void main(String[] args) {
		BubbleSort bubble = new BubbleSort();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭�� ũ�⸦ �Է��ϼ���: ");
		int a = sc.nextInt();
		sc.nextLine();
		String[] DataArr = new String[a];
		int[] DataArr2 = new int[a];
		System.out.println("\n������ �迭��ŭ ������ �Է��ϼ��� : (�������� ����)");
		String b = sc.nextLine();
		DataArr = b.split(" ");
		for(int i=0; i<DataArr.length; i++){
			DataArr2[i] = Integer.parseInt(DataArr[i]);
			System.out.println(DataArr2[i]);
		}
		bubble.Bubble(DataArr2, a);
		for(int j=0; j<DataArr2.length;j++){
			System.out.println(DataArr2[j]);
		}
	}
}

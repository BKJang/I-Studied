package MergeSort;

public class MergeSortTest {
	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		int[] arr = {85, 24, 63, 45, 17, 31, 96, 50};
		
            System.out.print("Before : ");
            ms.print(arr);
            ms.divide(arr);
            System.out.print("After: ");
            ms.divide(arr);	
	}
}
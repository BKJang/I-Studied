package Algoritm;

public class QuickSortEx {
	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		
		int Arr[] = {22, 33, 55, 21, 41 ,23, 11, 1, 56};
		int Length = Arr.length;
		
		System.out.println("Before Sort : ");
		qs.ShowArr(Arr, Length);
		System.out.println("\nAfter Sort : ");
		qs.quicksort(Arr, 0, Length-1);
		qs.ShowArr(Arr, Length);
	}
}

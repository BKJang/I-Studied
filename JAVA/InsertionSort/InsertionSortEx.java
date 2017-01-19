package Algoritm;

public class InsertionSortEx {
	public static void main(String[] args) {
		
		InsertionSort insert = new InsertionSort();
		
		int[] Arr = {3, 4, 6, 2, 8, 1}; 
		int length = Arr.length;
		System.out.println("Before InsertionSort : ");
		insert.ShowArr(Arr, length);
		System.out.println("\n");
		System.out.println("After InsertionSort : ");
		insert.insertionSort(Arr, length);
		insert.ShowArr(Arr, length);
	}
}

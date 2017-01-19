package Algoritm;

public class InsertionSort {
	
	public void ShowArr(int Arr[], int Length){
		for(int i=0; i<Length; i++){
			System.out.print(Arr[i] + " ");
		}
	}
	
	public void insertionSort(int[] arr, int Length)
	 {
	    for(int i = 1 ; i <Length ; i++){
	       int temp = arr[i];
	       int j;
	        
	       for(j=i-1 ; j >= 0 && arr[j] > temp; j--){
	    	   arr[j+1] = arr[j];
	       }
	       arr[j + 1] = temp;
	    }
	 }
}

package Algoritm;

public class QuickSort {
	public void ShowArr(int Arr[], int Length){//Method that shows Array
		for(int i=0; i<Length; i++){
			System.out.print(Arr[i] + " ");
		}
	}
	
	public int Quick(int number[], int left, int right){
		int pivot = number[(left+right) /2];//set pivot(center of Array)
		
		while (left < right){
			while(number[left] < pivot && left < right)
				++left;
			while(number[right] > pivot && left < right)
				--right;
		
			if(left<right){//if left and right can't meet, change left and right each other.
				number[left]^=number[right];
				number[right]^=number[left];
				number[left]^=number[right];
			}
		}
		
		return left;
	}
	
	public void quicksort(int number[], int left, int right){
		if(left<right){//if right>=left, sorting is done.
			int Pivotindex = Quick(number, left, right);
			
			quicksort(number, left, Pivotindex-1);
			quicksort(number, Pivotindex+1, right);
		}
		
	}
	
}

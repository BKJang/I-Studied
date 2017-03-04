package MergeSort;

public class MergeSort {
	public void print(int[] arr){
		
		for(int j=0; j<arr.length; j++){
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}
	public void merge(int[] A, int[] B, int[] C){
		int a=0;
		int b=0;
		int c=0;

		while(a < A.length){
			if(b < B.length){
				if(A[a] < B[b]){
					C[c] = A[a];
					a++;
				} else{//B[b] >= A[a]
					C[c] = B[b];
					b++;
				}
				c++;
			} else{
				while(a < A.length) {
					C[c] = A[a];
					a++;
					c++;
				}
			}
		}

		while(b < B.length){
			C[c] = B[b];
			b++;
			c++;
		}
	}
	
    public void divide (int[] arr) {
        int n = arr.length;
       
        if (n == 1) return;
       
        int[] arrA = new int[n/2];
        int[] arrB = new int[n - n/2];
       
        for (int i = 0; i< n/2; i++) {
                arrA[i] = arr[i];
        }
        for (int i = 0; i< n - n/2; i++) {
                arrB[i] = arr[i + n/2];
        }
        System.out.print("Array S1: ");
        print(arrA);
        System.out.print("Array S2: ");
        print(arrB);
       
        divide(arrA);
        divide(arrB);
       
        merge(arrA, arrB, arr);
        System.out.print("After Array: ");
        print(arr);
    }
	
}
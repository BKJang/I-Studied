#include <stdio.h>
#include <stdlib.h>

void BubbleSort(int Arr[], int Length){
int i=0, j=0, temp=0;

	for(i=0; i<Length-1; i++){
		for(j=0; j<Length-(i+1); j++){
			if(Arr[j]>Arr[j+1]){
			temp=Arr[j+1];
			Arr[j+1]=Arr[j];
			Arr[j]=temp;
			}
		}
	}
}

int main(){
	int * Arr;
	int i = 0;
	int Length;
	
	printf("배열의 크기를 입력: ");
	scanf("%d", &Length);
	Arr = (int*) malloc (sizeof(int)*Length);
	printf("\n");
	printf("배열의 크기만큼 정수 입력: ");

	for(i=0; i<Length; i++) scanf("%d", &Arr[i]);
	BubbleSort(Arr, Length);
	
	for(i=0; i<Length; i++) printf("%d ", Arr[i]);
	printf("\n");
	
	return 0;
}

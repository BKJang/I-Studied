#include <stdio.h>
#include <string.h>
 
void ShowArray(int Arr[], int Length)
{  
    int i;
    for (i = 0; i < Length; i++)
        printf("%d ", Arr[i]);
    printf("\n");
}
 
void InsertionSort(int Arr[], int Length)
{
    int value = 0;
    int i;
    int j;
    for (i = 1; i < Length; i++)
    {
        if (Arr[i - 1] <= Arr[i])
	continue;
        value = Arr[i];
        for(j = 0; j < i; j++)
        {
            if (Arr[j] > value)
            {
                memmove(&Arr[j+1], &Arr[j], sizeof(Arr[0]) * (i-j));
                Arr[j] = value;
		break;
            }
        }
        ShowArray(Arr, Length);
    }
}
 
int main()
{
    int Arr[] = {2, 55, 33 , 3, 44, 566};
    int Length = sizeof Arr / sizeof Arr[0];
     
    ShowArray(Arr, Length);
    InsertionSort(Arr, Length);
 
    return 0;
}

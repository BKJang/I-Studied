#include <stdio.h>
 
void ShowArray(int Arr[], int Length)
{   int i;
    for (i = 0; i < Length; i++)
        printf("%d ", Arr[i]);
    printf("\n");
}
 
int Quick(int number[], int left, int right)
{
    int first = left;
    int temp = number[first];
    int temp2 = 0;
 
    ++left;
    while (left <= right)
    {
        
        while(number[left] <= temp && left < right) ++left;
        while(number[right] > temp && left <= right) --right;
 
        if (left < right)
        {
            temp2 = number[left];
            number[left] = number[right];
            number[right] = temp2;
        }
        else break;
    }
 
    temp2 = number[first];
    number[first] = number[right];
    number[right] = temp2;
 
    return right;
}
 
void QuickSort(int number[], int left, int right)
{
    if (left < right)
    {
        int index = Quick(number, left, right);
 
        QuickSort(number, left, index - 1);
        QuickSort(number, index + 1, right);
    }
}
 
int main()
{
    int arrData[] = {5, 4, 1, 2, 8, 7, 9};
    int Length = sizeof arrData / sizeof arrData[0];
 
    ShowArray(arrData, Length);//Before Sorting
    QuickSort(arrData, 0, Length - 1);
    ShowArray(arrData, Length);//After Sorting
 
    return 0;
}

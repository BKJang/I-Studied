# Quick Sort

- 퀵 정렬(Quick Sort)

Partitioning을 이용한 정렬로, 배열이 주어졌을 때, Pivot element를 기준으로 나누는 작업을 반복하여 정렬

[Example]

![Markdown Here logo](http://cfile22.uf.tistory.com/image/2168DD4558BC1BAD26C651)

```sh

# 1. [2, 8, 7, 1, 3, 5, 6, 4]의 배열이 주어졌을 때,

# Pivot Element : 4(4보다 작은 값들은 왼쪽, 큰 값들은 오른쪽)

[2, 1, 3, 4, 7, 5, 6, 8]

# 2. arr[0]에서 arr[pivot-1]까지 QuickSort

# Pivot Element : 2

[1, 2, 3, 4, 7, 5, 6, 8]

# 3. arr[pivot+1]부터 arr[마지막 원소 위치]까지 QuickSort

# Pivot Element : 6 

[1, 2, 3, 4, 5, 6, 7, 8]


# Pseudo Code

QuickSort(Arr, p, r) # p는 배열의 첫번 째, r은 배열의 마지막 원소

if p<r

	q = Partiton(Arr, p, r)
	
	QuickSort(Arr, p, q-1) # q는 pivot elelment
	
	QuickSort(Arr, q+1, r)
	
```
## 수행 시간 분석

- Partitioning에 걸리는 시간 : O(n)

- 최선 및 평균의 경우 : 주어진 배열의 절반 정도에서 나누어지는 경우 = O(nlogn)

- 최악의 경우 : O(n^2)


- 각 Sorting의 수행 시간 비교

![Markdown Here logo](http://cfile3.uf.tistory.com/image/2425CC4F58BC1EEE27F0E0)


Implement in Java : https://github.com/BKJang/I-Studied/tree/master/JAVA/QuickSort

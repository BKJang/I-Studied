﻿# Insertion Sort

- 삽입정렬(Insertion Sort)

입력된 숫자의 배열이 'a1 <= a2 <= ... <= an' 조건을 만족하도록 다시 나열한 결과

Key 값과 정렬된 리스트가 주어졌을 때, Key값을 정렬된 List의 알맞은 위치에 삽입

[Example]

```sh

# A[1, ... , n]의 배열이 주어졌을 때,

[5, 2, 4, 6, 1, 3]

# 첫 번째는 A[2]를 정렬된 배열 A[1]에 집어넣는다.

[2, 5, 4, 6, 1, 3]

# 두 번째는 A[3]을 정렬된 배열 A[1...2]에 집어넣는다.

[2, 4, 5, 6, 1, 3]

# n-1 번째는 A[n]을 정렬된 배열 A[1..n-1]에 집어넣는다.

[1, 2, 4, 5, 6, 3]

[1, 2, 3, 4, 5, 6]

```

- 결론적으로, 위와 같이 배열 A에 원소를 하나씩 추가하면서 정렬

## 시간 복잡도


#### 최선의 경우 

- 원소들이 이미 정렬되어 있어서 비교횟수가 최소인 경우, 이미 정렬되어 있는 경우 바로 앞자리 원소와 한 번만 비교
 
- 전체 비교 횟수 : n-1

- 시간 복잡도 : O(n)


#### 최악의 경우

- 모든 원소가 역순으로 되어있을 때

- 전체 비교 횟수 : 1+2+3+...+(n-1) = n(n-1)/2

- 시간 복잡도 : O(n^2)


#### 평균의 경우

- 평균 비교 횟수 : n(n-1)/4

- 시간 복잡도 : O(n^2)


- Insertion Sort는 정렬 전 자료의 상태에 따라 효율성이 차이가 큰 알고리즘

- 알고리즘 자체가 매우 간단하며, 기존 자료가 어느 정도 정렬 되어 있을 때 효율적


Implement in Java : https://github.com/BKJang/I-Studied/tree/master/JAVA/InsertionSort
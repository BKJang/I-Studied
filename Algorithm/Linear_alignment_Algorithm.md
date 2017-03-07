# Linear alignment Algorithm

## 비교정렬의 하한값

- 비교 연산으로 정렬하는 방법은 아무리 빨라도 Ω(n logn n)보다 느리다.

- 비교 연산 : HeapSort, MergeSort, InsertionSort, SelectionSort, QuickSort


## 계수 정렬(Counting Sort)

- 계수를 이용하여 정렬(실제 숫자를 세는 방법으로 숫자가 몇 개인지 기록)

[Example]

![Markdown Here logo](http://cfile29.uf.tistory.com/image/2336C34F58BEC69F2C9511)

- 주어진 배열 A에서 0이 몇 개인지 1이 몇 개인지 세서 순서대로 정렬

![Markdown Here logo](http://cfile29.uf.tistory.com/image/24622D4C58BEC7662E2489)

- Count배열(C) 하나를 만들어 해당되는 숫자가 몇 개가 들어있는지 Count한 뒤 배열 B를 만들어 재배열)


- 계수 정렬 과정

```sh

# A[2, 5, 3, 0, 2, 3, 0, 3] 의 배열이 주어졌을 때,

# Count 배열을 구성하고 Index값을 찾은 C'배열 하나를 구성한다.
 
# 0, 1, 2, 3, 4, 5

C[2, 0, 2, 3, 0, 1]

#  0, 1, 2, 3, 4, 5]

C'[2, 2, 4, 7, 7, 8]

```
- 이후 각 해당되는 숫자의 Counting된 수를 하나씩 줄이면서 배열 B에 재배열

![Markdown Here logo](http://cfile24.uf.tistory.com/image/216BA73C58BECAFE22E446)


#### 수행 시간 분석

- k가 입력되는 정수의 범위라고 했을 때, O(k+n)이 된다.

- 만약 k=O(n)이라면, 수행 시간은 O(n)이 된다.


## 기수 정렬(Radix Sort)

[Example]

- MSB => LSB

![Markdown Here logo](http://cfile4.uf.tistory.com/image/2633853458BECC842A9F13)

100의 자리부터 작은 순서대로 나열 후 10의 자리 1의 자리까지 같은 과정으로 나열


- LSB => MSB

![Markdown Here logo](http://cfile21.uf.tistory.com/image/243D543458BECC8512303A)

1의 자리부터 숫자가 작은 순서대로 나열 후 10의 자리 100의 자리까지 같은 과정으로 나열


- 단, Radix Sort는 주어진 숫자들의 자리 수가 같아야 함


#### 수행 시간 분석

- d 자리 수 숫자 n개가 주어졌을 때, 각 자리 수에서 최대 k값(진수에 따라 달라짐)을 가질 수있다고 가정

- 수행 시간 : O(d(n+k))

- 보통, d가 상수이고 k=O(n)이므로 Radix Sort는 선형 시간에 수행

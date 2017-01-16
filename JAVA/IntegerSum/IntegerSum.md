# IntegerSum

## 문제 설명

입력 첫 줄에 먼저 합을 계산하여야 할 정수 n(1<= n <= 10,000)이 주어진다. 

두번째 줄에는 합을 계산하여야 할 n개의 정수들이 한 줄에 주어진다.

이 정수들의 절대값은 100보다 작거나 같다. 모든 정수들 사이에는 하나의 공백이 있다.

## class 설명

- IntegerException class

"계산될 정수의 절대값은 100보다 작거나 같아야 합니다."

- IntegernumException class

"입력할 정수의 개수는 1부터 10000까지입니다." 

- IntegersumException class

"입력받기로 한 값보다 갯수가 많습니다."

- IntegerCalc class

result() method 정의를 통해 result값 반환

- IntegerCalcTest class(main)

IntegerCalc class에서 반환된 result값을 출력함과 동시에 각각의 Exception class에서 Exception 처리
# Hash Algorithm

## Direct-Address Tables

- 크기가 U인 테이블 T를 생성하고, key k를 slot k에 저장하는 방식

- 중복되는 key가 없다고 가정

- 실제 공간사용을 전체 공간으로 나눈 값을 적재율이라고 하는데, 만약 적재율이 낮다면 대부분의 공간은 낭비

- 예를 들어, 도서관의 시험 기간 중 이용률은 줄어들고 공간이 낭비된다.

## Hash Tables

- key k를 저장할 때 slot k에 저장하는 것이 아닌 slot h(k)에 저장

- 이것을 key k가 slot h(k)에 해쉬되었다고 하며 h(k)를 key k의 해쉬 값이라고 한다.

- 이 때, h()를 해쉬 함수라고 부른다.

- Direct-Address Table과 Hash Table의 비교

1. Direct-Address

![Markdown Here logo](http://cfile30.uf.tistory.com/image/243C0F4D58C544C5266079)

2. Hash

![Markdown Here logo](http://cfile29.uf.tistory.com/image/265D734D58C544C6226816)


#### Collision

- 두 개의 key가 동일한 hash 값을 갖는 경우

- 충돌을 피하는 방법은 충돌이 적은 좋은 해쉬 함수를 쓰는 것


#### 체인을 이용한 충돌해결법

- 중복되는 key값이 있을 경우, 해당 슬롯의 LinkedList로 저장

![Markdown Here logo](http://cfile2.uf.tistory.com/image/2746544B58C545F13078F0)


### 수행시간

- 최악의 경우 수행시간 : O(n)

모든 key 값 k가 하나의 slot에 hashing되는 경우 길이가 n인 Double LinkedList가 생성

- 평균적인 수행시간 : O(1+a)

이 때, a는 적재율(load factor)이고 a = n/m(n = 테이블의 원소 개수, m = slot개수)


#### 해쉬 함수(hash function)

- 좋은 해쉬 함수는 simple uniform hasing을 만족

- 즉, 각각의 key가 중복없이 m개의 slot으로 동일한 확률로 hash

- 각각의 key는 다른 key 값의 hash 값과 관계없이 hash

- 해쉬 함수에서는 key값을 자연수로 가정(만약, 자연수가 아니라면 자연수 형태로 변형)


#### 나눗셈 방법(The division Method)

- 해쉬 함수로 나눗셈을 이용하는 방법으로 키 값 k를 m으로 나누고 나머지를 이용(Modular연산을 사용)

- 효율적인 m의 선택 방법

m = '2^p'인 경우, '2^p-1'인 경우는 피하는 것이 좋다.

2^p에 너무 가깝지 않은 소수를 선택하는 것이 좋다.


## Open-Addressing

- Collision을 피하기 위한 다른 방법으로 key를 hash table에 직접 저장

- 포인터를 사용하지 않아도 되므로 구현이 간편

- 포인터를 사용하지 않으므로 추가 메모리 공간 사용 가능


#### 선형 프로빙(Linear Probing)

```sh

# m=13, k={5, 14, 29, 25, 17, 21, 18, 32, 20, 9, 15, 27}

h(k) = k mod 13

```

- 구현은 매우 쉬우나 primary clustering의 문제

- 값이 들어있는 slot의 수가 많으면 평균 검색시간이 증가


#### 이차식 프로빙(Quadratic Probing)

- h(k,i) = (h'(k)) + c1i +c2i^2) mod m

- 이 때, h'는 보조 해쉬 함수이고 c1과 c2는 0이 아닌 상수

- 즉, 주어진 hash함수 외에 i에 대한 2차 함수꼴로 slot을 이동하면서 빈 slot을 찾는다.

```sh

# m=13, k={5, 14, 29, 25, 17, 21, 18, 32, 20, 9, 15, 27}

h(k, i) = (k + i + 3i^2) mod 13 # i=충돌 횟수

```

- 만약, 두 key의 처음 probe 값이 동일하다면 빈 slot을 찾는 과정이 동일하므로 같은 slot을 탐색

- 이런 특성을 secondary clustering이라고 함

- 즉 처음 충돌한 위치가 같다면 다음 충돌할 위치에서도 반복적으로 계속 충돌이 발생


#### 이중 해싱(Double Hashing)

- 해싱을 두번 한다.

- h(k,i) = (h1(k) + i*h2(k)) mod m

- 처음 탐색하는 위치는 T[h1(k)]

- 그 다음부터는 h2(k) mod m만큼 이동하면서 탐색

- 즉, 충돌이 발생하면 이동하는 거리가 hash함수에 의해 계산되어 무작위로 빈 slot을 찾는다.

```sh

# m=13, k={5, 14, 29, 25, 17, 21, 18, 32, 20, 9, 15, 27}

h1(k) = k mod 13

h2(k) = 1 + (k mod 11)

h(k,i) = (h1(k) + i*h2(k)) mod 13

```

- h2(k) 함수는 해쉬 테이블의 크기 m과 서로 소 관계여야 한다.

- 이것을 만족하는 가장 쉬운 방법은 m을 2의 지수승으로 두고 h2가 항상 홀수가 되도록

- 다른 방법은 m을 소수로 하고 h2를 m보다 작은 양수로 정하는 것
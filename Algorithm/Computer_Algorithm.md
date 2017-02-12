# Computer_Algorithm

- 컴퓨터를 가지고 문제를 해결하는 방법

- 효율적이고 단계적으로 문제를 해결


## About Algorithm

- 컴퓨터 언어 : 컴퓨터와 대화하기 위해 사용하는 언어

- 컴퓨터 알고리즘 : 컴퓨터를 이용하여 주어진 문제를 풀기 위한 방법, 절차

- 컴퓨터 프로그램 : 컴퓨터가 특정 작업을 수행하기 위해 짜여진 명령의 순서


## 컴퓨터 알고리즘의 분석

- 문제 정의 : 해결하고자 하는 문제?, 입출력의 형태로 정의?, 컴퓨터가 수행 가능?

- 알고리즘 설명 : 컴퓨터가 수행해야 할 내용을 하나씩 차례로 정의(Describe as Language)

- 정확성 증명 : 올바른 출력을 하는가?

- 성능 분석 : 수행시간(Runnung Time), 사용공간(Space consumption)


[수행시간 분석]

특정 기계에서 모든 알고리즘의 수행시간을 측정(현실적으로 불가능)

따라서 수행연산의 횟수를 비교하는 방식으로 성능 분석(몇 번의 연산을 통해 문제를 해결하는가)

```shell

# T(n) : 수행 시간

# n = 입력의 크기

```


## 성능 분석의 비교 대상

- 산술 연산 : Add, Multiply, Exponent, Modular..

- 데이터 입출력 : Copy, Move, Save, Load..

- 제어 연산 : If, While, Register..


## 점근적 표기법(Asympototic notation)


- 빅 오 표기 : asymptotic upper bound

![Markdown Here logo](http://cfile4.uf.tistory.com/image/2149183E589FDF9C28A3FA)

n0보다 오른쪽에 있는 모든 n에 대하여 함수 f(n)의 값은 cg(n)과 같거나 아래쪽에 있다.



- 오메가 표기 : asymtotic lower bound

![Markdown Here logo](http://cfile22.uf.tistory.com/image/2505633E589FDF9D1DFA22)

n0보다 오른쪽에 있는 모든 n에 대하여 함수 f(n)의 값은 cg(n)과 같거나 위쪽에 있다.



- 쎄타 표기 : asymtotically tight bound

![Markdown Here logo](http://cfile1.uf.tistory.com/image/2376C33E589FDF9D2305A9)

n0보다 오른쪽에 있는 모든 n에 대하여 함수 f(n)의 값은 c1g(n)과 같거나 위쪽에 있고

c2g(n)과 같거나 아래쪽에 있다.
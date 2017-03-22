# Data_Type of R

## Basic data type

#### Numeric

- integer(정수) : 2, 5, 0...

- double(실수) : 0.7, 1/2, pi...

- exponent(지수) : 2^2...

#### Logical

- TRUE(참) : T, TRUE, 1

- FALSE(거짓) : F, FALSE, 0

#### Complex

- complex number(복소수) : 2+2i, 0+1i...

#### Character

- character(문자) : "A", "a"...

- character string(문자열) : "character string", "abc"...


#### Array

- vector : 하나 이상의 값으로 구성된 1차원 데이터

- factor : 질적 자료를 다루는 벡터의 특수한 형태인 범주형 자료

- matrix : 2차원 배열형태

- array : 3차원 배열형태

- list : 다양한 속성을 가진 데이터들로 구성된 자료(vector와 유사하게 1차원), vector와 list등의 형태도 집어 넣을 수 있음

- dataframe : 테이블 형태의 2차원 배열로 이뤄진 자료


#### 기본 자료형(숫자)

```sh

10000 # 0 이 4개 까지는 그대로 표시

# 10000

100000 # 0 이 5개부터는 e로 표시

# 1e+05

1000000 # 0이 6 개라서 결과에 1 * 10^6 으로 표시

# 1e+06

1e2 # 이 말은 1 * 10^2 이라는 뜻이므로 100

# 100

3e2 # 이 말은 3 * 10^2 아는 뜻이라서 3 *100 의 결과인 300

# 300

3e-1 # -1 은 소숫점 1 자리까지 표시

# 0.3

3e-2 # -2 는 소수점 2 자리까지 표시

# 0.03

as.numeric('1') + as.numeric('2') # 숫자로 강제로 변환

# 3

```

#### 기본 자료형(문자)

```sh

'First' # 문자라서 홑따옴표로 감싸고 출력

# "First"

"Second" # 이렇게 쌍따옴표로 감싸도 됨

# "Second"

First # 그냥 사용하면 변수 이름으로 인식이 되어서 에러가 발생

# 에러: 객체 'First'를 찾을 수 없습니다

class('1') # 문자형 데이터를 검사

# "character"

class(1) # 숫자형 데이터를 검사

# "numeric"

```

## 기본 자료형(논리값)

```sh

3 & 0 # 3 곱하기 0 의 뜻으로 거짓(FALSE)

# FALSE

3 & 1 # 3 곱하기 1 의 뜻으로 참 곱하기 참이라서 참(TRUE)

# TRUE

3 & 2 # 참 곱하기 참이라서 결과도 참(TRUE)

# TRUE

3 | 0 # 참 더하기 거짓 이라서 결과는 참(TRUE)

# TRUE

3 | 1 # 참 더하기 참 이라서 결과는 참(TRUE)

# TRUE

!0 # 거짓이 아닌 것이라서 참(TRUE)

# TRUE

!1 # 참이 아닌 것이라서 거짓(FALSE)

# FALSE

!3 # 참이 아닌 것이라서 거짓(FALSE)

# FALSE


```
## 기본 자료형(Missing Value)

- NA는 일반적으로 결측값을 의미하며 제외하고 분석

```sh

vec <- c(1, 2, 3, NA)

is.na(vec)

# FALSE, FALSE, FALSE, TRUE

sum(1,2,NA) # NA 값이 연산 결과를 틀리게.(결측치에 대한 처리를 안하고 계산)

# NA

sum(1,2,NA,na.rm=T) # na.rm=T 로 NA 값을 제거하고 계산

# 3

```

## Vector

- 생성 방법

```sh

x <- c(1, 2, 3, 4, 5)

x <- 1:5

x <- 5:1

```

#### Functions

- seq() : 연속된 숫자 생성

```sh

x <- seq(from=1, to=2, length.out=10) # 1부터 2까지 10개의 수로 쪼개서 나열

# 1.000000 1.111111 1.222222 1.333333 1.444444 1.555556 1.666667 1.777778 1.888889 2.000000


```

- rep() : 수열 생성

```sh

x <- rep(c(1, 2, 3), times=3)

# 1 2 3 1 2 3 1 2 3

```

- [] : Vector의 원소 추출

```sh

a <- c("한국", "중국", "일본") 

b <- c(1, 2, 3, 4, 5) 

a[1] ; a[1:3]

# "한국"
# "한국" "중국" "일본"

b[b>3]

# 4 5

```

- append() : Vector에 원소 추가

```sh

append(a, "미국", 2) # vector a의 2번째 원소 뒤에 "미국"을 추가

```

- names() : 개별 원소에 이름 부여

```sh

b <- c(5, 6, 7, 8, 9, 10)

names(b) <- 2015:2020

b["2015"]

# 2015 # 원소의 이름이 나오게 됨
# 5

```

- paste() : 문자결합을 위한 함수(문자, 숫자를 섞어서 할당할 때 주의!)

```sh

name <- paste(2015:2019, "y" ,sep=“”)

names(b) <- name

b[“2015y”]

# 2015y
# 5


MIX <- c(1, 2, 3, 4, "아대")

class(MIX)

# "character"

as.numeric(MIX[1:4]) # 1부터 4까지만 numeric원소로 전환

[1] 1 2 3 4

MIX[1:4] <- as.numeric((MIX[1:4])) # 하지만 MIX 자체의 형태는 바뀌지 않음

> class(MIX)

# "character"

```

#### Vector Subsetting

```sh

# Subsetting with Positive Integral Sequences


v <- c("a", "b", "c", "d", "e")

J <- c(1, 3, 5)

v[J]

# "a" "c" "e"

v[1:3]

# "a" "b" "c"

v[2:length(v)]

# "b" "c" "d" "e"


# Subsetting with Negated Integral Sequences

v

# "a" "b" "c" "d" "e"

J

# 1 3 5

v[-J]

# "b" "d“

v[-1]

# "b" "c" "d" "e"

v[-length(v)]

# "a" "b" "c" "d"


# Subsetting with Logical Vector
L <- c(TRUE, FALSE, TRUE, FALSE, TRUE)

v[L]

# "a" "c" "e"

x <- seq(-3, 3);x

# -3 -2 -1 0 1 2 3

x >= 0

# FALSE FALSE FALSE TRUE TRUE TRUE TRUE

x[x >= 0]

# 0 1 2 3



# Subsetting by Names

names(x) <- paste("N", 1:length(x), sep = "");x

# N1 N2 N3 N4 N5 N6 N7
# -3 -2 -1 0 1 2 3

> names(x)[x < 0]

# "N1" "N2" "N3"

y <- c(x, NA, NA)

z <- y[!is.na(y)]

z

# N1 N2 N3 N4 N5 N6 N7
# -3 -2 -1 0 1 2 3



# A subset expression can be on the receiving end of an assignment, in which case the assignment only applies the subset and leaves the rest of the vector alone.

z <- 1:4

z[1] <- 0

z

# 0 2 3 4

z[z <= 2] <- -1 # 2보다 작거나 같은 원소에 각각 -1을 할당

z

# -1 -1 3 4

w <- c(1:3, NA, NA)

w[is.na(w)] <- 0 # 결측치에 0을 할당

w

# 1 2 3 0 0


```

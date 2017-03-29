# Vector_Of_R

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

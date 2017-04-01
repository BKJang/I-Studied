# Matrix_Of_R

## Matrix

- 한 가지 형태의 스칼라만 저장 가능. 즉, Vector와 마찬가지로 숫자와 문자를 동시에 저장할 수 없음

```sh

# [문법]

matrix(data, nrow, ncol, byrow, dimnames, matrix(data, 행수, 열수, 배열 방식(행 or 열 부터 채움), 각 차원이름)


Y <- matrix(1:12, nrow =3, ncol=4) # 1부터 12까지의 수를 3*4의 Matrix에 삽입

Y

#      [,1] [,2] [,3] [,4]
# [1,]    1    4    7   10
# [2,]    2    5    8   11
# [3,]    3    6    9   12

Y[1, 3]

# 7

Y[1,]

#  1  4  7 10

Y[, 2]

# 4 5 6

```

- dim()

```sh

x <- 1:15

dim(x) <- c(3, 5) # 1부터 15까지의 수를 3*5의 Matrix에 삽입

x

#      [,1] [,2] [,3] [,4] [,5]
# [1,]    1    4    7   10   13
# [2,]    2    5    8   11   14
# [3,]    3    6    9   12   15

```

- colnames : 열에 이름 부여

- rownmaes : 행에 이름 부여

```
# byrow=TRUE indicates that the matrix should be filled by rows. 

# byrow=FALSE indicates that the matrix should be filled by columns (default).

mat <- matrix(c(2, 3, 4, 1, 4, 4, 5, 6), ncol=2, byrow=T)

mat

#      [,1] [,2]
# [1,]    2    3
# [2,]    4    1
# [3,]    4    4
# [4,]    5    6

rownames(mat) <- c("A", "B", "C", "D")

colnames(mat) <- c("a", "b")

mat

#   a b
# A 2 3
# B 4 1
# C 4 4
# D 5 6

```

- rbind : row를 기준으로 병합

- cbind : column을 기준으로 병합


```sh

x <- 1:3

y <- 10:12

cbind(x, y)

#      x  y
# [1,] 1 10
# [2,] 2 11
# [3,] 3 12

rbind(x, y)

#    [,1] [,2] [,3]
# x    1    2    3
# y   10   11   12


mat3 <- matrix(1:9, byrow=T, nrow=3)

mat3

#       [,1] [,2] [,3]
# [1,]    1    2    3
# [2,]    4    5    6
# [3,]    7    8    9

mat4 <- rbind(mat3,c(11, 12, 13))

mat4

#       [,1] [,2] [,3]
# [1,]    1    2    3
# [2,]    4    5    6
# [3,]    7    8    9
# [4,]   11   12   13

mat5 <- cbind(mat3, c(4 , 7, 10))

mat5

#       [,1] [,2] [,3] [,4]
# [1,]    1    2    3    4
# [2,]    4    5    6    7
# [3,]    7    8    9   10

```

#### Matrix 데이터 추출

- [, ]에 추출하고자하는 원소의 행과 열을 차례로 입력

```sh

mat3 <- matrix(1:9, nrow=3)

mat3

#      [,1] [,2] [,3]
# [1,]    1    4    7
# [2,]    2    5    8
# [3,]    3    6    9

mat3[ ,1]

# 1 2 3

mat3[1, ]

# 1 4 7

mat3[1, 1]

# 1

mat3[1:2,]

#      [,1] [,2] [,3]
# [1,]    1    4    7
# [2,]    2    5    8

mat3[-2, ]

#      [,1] [,2] [,3]
# [1,]    1    4    7
# [2,]    3    6    9

mat3[, c(1, 3)]

#      [,1] [,2]
# [1,]    1    7
# [2,]    2    8
# [3,]    3    9

mat3[, -1]

#      [,1] [,2]
# [1,]    4    7
# [2,]    5    8
# [3,]    6    9

```

- sample() : Matrix가 주어진 원소가 랜덤하게 섞여 만들어짐

```sh

m <- matrix(sample(1:15, 12), nrow = 3)

m

#      [,1] [,2] [,3] [,4]
# [1,]   11   12    2    1
# [2,]   13    4   14    8
# [3,]   15    5    3    9


# subset with logical vector

m[c(F, F, T), c(F, F, T, T)]

# 3 9

```


# Array_Of_R

## Array

- ������ ���ҷθ� ������, ���� ���� �������� ������ ������

- Matrix�� 2���� �����Ͷ�� �迭(Array)�� ������ ������(2*3*4)


```sh

# [����]

array(data, dim=( , , ) dimnames=list(c( , ,), c( , ,), c( , , ))

# data : �����͸� ������ ����

# dim : �迭�� ����, �� ���� �������� ������ 1���� �迭�� ������

# dimnames : ������ �̸�

array1 <- array(1:18, dim=c(3,3,2), dimnames=list(c("a", "b", "c"),c("d", "e", "f"), c("g", "h")))

array1

# , , g

# d e f
# a 1 4 7
# b 2 5 8
# c 3 6 9


# , , h

#    d  e  f
# a 10 13 16
# b 11 14 17
# c 12 15 18

array1[1,,]

#   g  h
# d 1 10
# e 4 13
# f 7 16

array1[,-2,]

# , , g

#   d f
# a 1 7
# b 2 8
# c 3 9

# , , h

#    d  f
# a 10 16
# b 11 17
# c 12 18

array1[,,2]

#    d  e  f
# a 10 13 16
# b 11 14 17
# c 12 15 18

array1[1,2,1]

# [1] 4

```

- Removing NA values

```sh

x <- c(1, 2, NA, 4 ,NA, 5)

mean(x)

# [1] NA

bad <- is.na(x)

y <- x[!bad]

y

# [1] 1 2 4 5

mean(y)

# [1] 3

mean(x[!is.na(x)]) # mean(y)�� ���� ���

# [1] 3

```

- complete.cases() : �ϳ��� NA�� �ִٸ� ����ġ�� ���ܽ�Ų ��� ���� ����

```sh

mean(x[complete.cases(x)]) # == mean(x[!in.na(x)])

# [1] 3

x <- c(1, 2, NA, 4, NA, 5)

y <- c("a", "b", NA, "d", NA, "f" )

good <- complete.cases(x, y)

good

# [1]  TRUE  TRUE FALSE  TRUE FALSE  TRUE

x[good]

# [1] 1 2 4 5

y[good]

# [1] "a" "b" "d" "f"

```
# DataFrame_Of_R

## DataFrame

- 2개의 차원으로 이뤄진 table 형태의 자료

- 처리할 데이터를 엑셀의 스프레드 시트와 같이 정리

- 각 변수는 서로 다른 데이터를 가질 수 있음

- 단, 모든 관측 값의 길이가 같아야 함(원소의 개수)

```sh

name <- c("Anne", "Pete", "Frank", "Julia", "Cath")

age <- c(28, 30, 21, 39, 35)

child <- c(FALSE, TRUE, TRUE, FALSE, TRUE)

people <- data.frame(name, age, child)

people

#    name age child
# 1  Anne  28 FALSE
# 2  Pete  30  TRUE
# 3 Frank  21  TRUE
# 4 Julia  39 FALSE
# 5  Cath  35  TRUE

names(people) <- c("Name", "Age", "Child")

people

#    Name Age Child
# 1  Anne  28 FALSE
# 2  Pete  30  TRUE
# 3 Frank  21  TRUE
# 4 Julia  39 FALSE
# 5  Cath  35  TRUE

people <- data.frame(Name=name, Age=age, Child = child)

people

#    Name Age Child
# 1  Anne  28 FALSE
# 2  Pete  30  TRUE
# 3 Frank  21  TRUE
# 4 Julia  39 FALSE
# 5  Cath  35  TRUE

```

- Data Frame Attributes

```sh

names(people)

# [1] "Name"  "Age"   "Child"

rownames(people)

# [1] "1" "2" "3" "4" "5"

people$Age

# [1] 28 30 21 39 35

people$age

# NULL

colnames(people)

# [1] "Name"  "Age"   "Child"

```

- Subset Data Frame

```sh

people[3, 2]

# [1] 21

people[3, "Age"]

# [1] 21

people[3, ]

#    Name Age Child
# 3 Frank  21  TRUE

people[,"Age"]

# [1] 28 30 21 39 35
#  people[c(3, 5), c("Age", "Child")]
#   Age Child
# 3  21  TRUE
# 5  35  TRUE

people[2]

#   Age
# 1  28
# 2  30
# 3  21
# 4  39
# 5  35

people[,2]

# [1] 28 30 21 39 35

class(people[1])

# [1] "data.frame" # dataframe의 형태로

class(people[,1])

# [1] "factor" # factor의 형태로

people$Age

# [1] 28 30 21 39 35

people[["Age"]]

# [1] 28 30 21 39 35

people[[2]]

# [1] 28 30 21 39 35

people[c(1, 2)]

#    Name Age
# 1  Anne  28
# 2  Pete  30
# 3 Frank  21
# 4 Julia  39
# 5  Cath  35

people[c(1,2), ]

#   Name Age Child
# 1 Anne  28 FALSE
# 2 Pete  30  TRUE

people[, c(1,2)] # dataframe의 형태로

#    Name Age
# 1  Anne  28
# 2  Pete  30
# 3 Frank  21
# 4 Julia  39
# 5  Cath  35

people <- data.frame(Name, Age, Child, stringsAsFactors = FALSE) # factor타입의 자료를 Vector로

class(people[,1])

# [1] "character"

```

#### Add column and row

```sh

name <- c("Anne", "Pete", "Frank", "Julia", "Cath") # dataframe 생성

age <- c(28, 30, 21, 39, 35)

child <- c(FALSE, TRUE, TRUE, FALSE, TRUE)

people <- data.frame(name, age, child, stringsAsFactors = FALSE)

# 1. Add col

people$height <- c(163, 177, 163, 162, 157) ; people # height 속성 추가

#    name age child height
# 1  Anne  28 FALSE    163
# 2  Pete  30  TRUE    177
# 3 Frank  21  TRUE    163
# 4 Julia  39 FALSE    162
# 5  Cath  35  TRUE    157

people1 <- people

people1$birthyear <- paste0("198", 1:5);people1

# name age child height birthyear
# 1  Anne  28 FALSE    163      1981
# 2  Pete  30  TRUE    177      1982
# 3 Frank  21  TRUE    163      1983
# 4 Julia  39 FALSE    162      1984
# 5  Cath  35  TRUE    157      1985


# paste와 paste0 비교

paste('a', 'b', sep="")
[1] "ab"

paste0('a', 'b') # paste에 sep옵션을 추가하는 것과 같은 효과
[1] "ab"


weight <- c(74, 63, 68, 55, 56)

cbind(people, weight) # cbind함수를 이용해서 만들어져있는 속성을 그대로추가

#    name age child height weight
# 1  Anne  28 FALSE    163     74
# 2  Pete  30  TRUE    177     63
# 3 Frank  21  TRUE    163     68
# 4 Julia  39 FALSE    162     55
# 5  Cath  35  TRUE    157     56


# 2.Add row

people$weight <- weight

people$birthyear <-  paste0("198", 1:5)

people

#    name age child height weight birthyear
# 1  Anne  28 FALSE    163     74      1981
# 2  Pete  30  TRUE    177     63      1982
# 3 Frank  21  TRUE    163     68      1983
# 4 Julia  39 FALSE    162     55      1984
# 5  Cath  35  TRUE    157     56      1985

tom <- data.frame(name="Tom", age=37, child=FALSE, height=160, weight=42, birthyear=1986) # 기존 dataframe의 속성명과 일치시켜줘야 된다.

rbind(people, tom)

#    name age child height weight birthyear
# 1  Anne  28 FALSE    163     74      1981
# 2  Pete  30  TRUE    177     63      1982
# 3 Frank  21  TRUE    163     68      1983
# 4 Julia  39 FALSE    162     55      1984
# 5  Cath  35  TRUE    157     56      1985
# 6   Tom  37 FALSE    160     42      1986

```

#### subset()

```sh

subset(people, height>170)

#   name age child height weight birthyear
# 2 Pete  30  TRUE    177     63      1982

subset(people, child==TRUE)
 
#   name age child height weight birthyear
# 2  Pete  30  TRUE    177     63      1982
# 3 Frank  21  TRUE    163     68      1983
# 5  Cath  35  TRUE    157     56      1985

```

#### Sorting

```sh

people

#    name age child height weight birthyear
# 1  Anne  28 FALSE    163     74      1981
# 2  Pete  30  TRUE    177     63      1982
# 3 Frank  21  TRUE    163     68      1983
# 4 Julia  39 FALSE    162     55      1984
# 5  Cath  35  TRUE    157     56      1985

sort(people$age)

# [1] 21 28 30 35 39

ranks <- order(people$age) # order() : sorting된 이후의 순서를 알려준다. 

ranks

# [1] 3 1 2 5 4

people[ranks, ]

#    name age child height weight birthyear
# 3 Frank  21  TRUE    163     68      1983
# 1  Anne  28 FALSE    163     74      1981
# 2  Pete  30  TRUE    177     63      1982
# 5  Cath  35  TRUE    157     56      1985
# 4 Julia  39 FALSE    162     55      1984

[1] 3 1 2 5 4

rank <- order(people$age, decreasing = TRUE) # 내림차순

people[rank, ]

#    name age child height weight birthyear
# 4 Julia  39 FALSE    162     55      1984
# 5  Cath  35  TRUE    157     56      1985
# 2  Pete  30  TRUE    177     63      1982
# 1  Anne  28 FALSE    163     74      1981
# 3 Frank  21  TRUE    163     68      1983

```

#### Extracting ALl Components

```sh

mean(people$age) # 중간 값

# [1] 30.6

cor(people$weight, people$height) # 상관관계

# [1] 0.2022121

attach(people)

# The following objects are masked _by_ .GlobalEnv:

#     age, child, name, weight

mean(age)

# [1] 30.6

cor(weight, height)

# [1] 0.2022121

detach(people)

```

#### Utility Function

```sh

head(people, n=2)

#   name age child height weight birthyear
# 1 Anne  28 FALSE    163     74      1981
# 2 Pete  30  TRUE    177     63      1982

tail(people, n=2)

#    name age child height weight birthyear
# 4 Julia  39 FALSE    162     55      1984
# 5  Cath  35  TRUE    157     56      1985

View(people, "title")

# title이라는 이름으로 테이블 생성

ncol(people) # column 개수

# [1] 6

nrow(people) # row 개수

# [1] 5

names(people) # column 이름 출력

# [1] "name"      "age"       "child"     "height"   "weight"    "birthyear"

rownames(people) # row 이름 출력 == row.names()

# [1] "1" "2" "3" "4" "5"

colnames(people) # column 이름 출력 == col.names()

# [1] "name"      "age"       "child"     "height"   "weight"    "birthyear"

```

#### 데이터 타입 판별 함수

- class() : 객체의 클래스

- str() : 객체의 구조

- is.factors() : 객체가 factor인가

- is.numeric() : 객체가 숫자를 저장한 vector인가

- is.character() : 객체가 문자를 저장한 vector인가

- is.matrix() : 객체가 matrix인가

- is.array() : 객체가 array인가

- is.data.frame() : 객체가 dataframe인가


#### 데이터 타입 변환 함수

- as.factor()

- as.numeric()

- as.character()

- as.matrix()

- as.array()

- as.data.frame()

```sh

x <- c("m", "f")

as.factor (x)

# [1] m f
# Levels : f m

as.numeric ( as.factor (x))

# [1] 2 1

factor (c("m", "f"), levels =c("m", "f"))

# [1] m f
# Levels : m f

```

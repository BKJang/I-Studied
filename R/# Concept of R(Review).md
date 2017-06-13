# Concept of R(Review)

## Loop

1. while

- 조건이 참일 때 블록 안의 문장을 수행

```sh

> count <- 0
> while(count < 10){
+   print(count)
+   count <- count + 1
+ }

# [1] 0
# [1] 1
# [1] 2
# [1] 3
# [1] 4
# [1] 5
# [1] 6
# [1] 7
# [1] 8
# [1] 9


> z <-5
> while(z >= 3 && z <= 10){
+   print(z)
+   coin <- rbinom(1, 1, 0.5) ## random walk
+   if(coin == 1){
+     z <- z+1
+   }else {
+     z <- z-1
+   }
+ }

# [1] 5
# [1] 4
# [1] 5
# [1] 4
# [1] 3
# [1] 4
# [1] 5
# [1] 4
# [1] 3

```

2. repeat

- 블록 안의 문장을 반복해서 수행한다. repeat은 다른 언어의 do-while에 해당

```sh

> i<-1
> repeat {
+   print(i^2)
+   i <- i+1
+   if(i>10)
+     break
+ }

# [1] 1
# [1] 4
# [1] 9
# [1] 16
# [1] 25
# [1] 36
# [1] 49
# [1] 64
# [1] 81
# [1] 100

```

3. next

- 현재 수행 중인 반복문 블록의 수행을 중단하고 다음 반복을 수행

```sh

> for(i in 1:10){
+   if(i%%2 == 0){
+     next
+   }
+   print(i)
+ }

# [1] 1
# [1] 3
# [1] 5
# [1] 7
# [1] 9

```

## Function

1. make function

```sh

> prod1 <- function(x) {
+   b <- 1
+     for (i in 1:length(x)) {
+       b <- b * x[i]
+     }
+   b ## same as return(b)
+ }
> 
> a1 <- c(2,4,7)
> b1 <- prod1(a1) ; b1

# [1] 56

> b2 <- prod1(1:5) ; b2

# [1] 120

```

2.

- square : return(x*x)

- cube : return(x^3)

- pow : return(x^n)


3. Scoping

- 전역 변수

```sh

x <- 10
test <- function(x) {
x <<- x + 10 # 전역 변수의 값 변경
cat(x)
}
test(x) #prints 10
cat(x) #prints 20

```

4. apply

- apply : 배열 또는 행렬에 주어진 함수를 적용한 뒤 그 결과를 벡터, 배열 또는 리스트로 변환

```sh

> maxMin <- function(x) {
+ max(x) - min(x)
+ }
> A <- matrix(1:9, nrow = 3, ncol = 3)
> v <- apply(A, 1, maxMin) ## 1 means row
> v
[1] 6 6 6
> v <- apply(A, 1, maxMin) ## 2 means column
> v
[1] 2 2 2

```

- lapply : 벡터, 리스트 또는 표현식에 함수를 적용하여 그 결과를 리스트로 반환

```sh
>test <- data.frame(a=1:3,b=2:4,c=3:5)

>test
a b c
1 1 2 3
2 2 3 4
3 3 4 5

> mean(test)
[1] NA
Warning message:
In mean.default(test) : argument is not numeric or logical: returning NA

> lapply(test,mean)
$a
[1] 2
$b
[1] 3
$c
[1] 4

> class(lapply(test,mean))
[1] "list" # list로 출력
```

- sapply : lapply와 유사하지만 결과를 벡터, 행렬 또는 배열 또는 리스트로 반환

```sh
> x <- list(a = 1:5, b=1:10)

> lapply(x, mean)
$a
[1] 3
$b
[1] 5.5

> spply(x, mean)
  a b
3.0 5.5


>test <- data.frame(a=1:3,b=2:4,c=3:5)

>test
a b c
1 1 2 3
2 2 3 4
3 3 4 5

> lapply(test,mean)
$a
[1] 2
$b
[1] 3
$c
[1] 4

> sapply(test,mean)
a b c
2 3 4

> class(sapply(test,mean))
[1] numeric

```

- tapply : 벡터에 있는 데이터를 특정 기준에 따라 그룹으로 묶은 뒤 각 그룹마다 주어진 함수를 적용하고 그 결과를 반환

```sh

> tapply(iris$Sepal.Length, iris$Species, mean)

#     setosa versicolor  virginica 
#      5.006      5.936      6.588 

```

- mapply : sapply의 확장버전으로, 여러 개의 벡터 또는 리스트를 인자로 받아 함수에 각 데이터의 첫째 요소들을 적용한 결과, 둘째 요소들을 적용한 결과, 셋째 요소들을 적용한 결과 등을 반환

```sh

> mapply(rep, 1:4, 4:1)
[[1]]
[1] 1 1 1 1

[[2]]
[1] 2 2 2

[[3]]
[1] 3 3

[[4]]
[1] 4

> list(rep(1, 4), rep(2, 3), rep(3, 2), rep(4, 1))
[[1]]
[1] 1 1 1 1

[[2]]
[1] 2 2 2

[[3]]
[1] 3 3

[[4]]
[1] 4

```

## Useful Functions

- abs() : 절대 값으로 변환

- round() : 반올림

- sum() : 합계

- mean() : 중간 값

- sort() : 정렬

- seq() : 연속

```sh

> seq(1, 10, by = 3)
[1]  1  4  7 10

> seq(8, 2, by = -2)
[1] 8 6 4 2

> sort(rep(c(8, 6, 4, 2), times = 2))
[1] 2 2 4 4 6 6 8 8

```
- rep() : 반복

```sh

> rep(c(8, 6, 4, 2), times = 2)
[1] 8 6 4 2 8 6 4 2
> rep(c(8, 6, 4, 2), each = 2)
[1] 8 8 6 6 4 4 2 2

```
- sort() : 정렬

```sh

> sort(c(8, 6, 4, 2, 8, 6, 4, 2))
[1] 2 2 4 4 6 6 8 8

> sort(c(8, 6, 4, 2, 8, 6, 4, 2), decreasing = TRUE)
[1] 8 8 6 6 4 4 2 2

> sort(rep(seq(8, 2, by = -2), times = 2))
[1] 2 2 4 4 6 6 8 8


```

```sh

> li <- list(log = TRUE,
+            ch = "hello",
+            int_vec = sort(rep(seq(8, 2, by = -2), times = 2)))

> li
$log
[1] TRUE

$ch
[1] "hello"

$int_vec
[1] 2 2 4 4 6 6 8 8


> sort(rep(seq(8, 2, by = -2), times = 2))
[1] 2 2 4 4 6 6 8 8

```
- str() : 구조(structure)

- is.*(), as.*()

```sh

> li
$log
[1] TRUE

$ch
[1] "hello"

$int_vec
[1] 2 2 4 4 6 6 8 8

> is.list(li)
[1] TRUE

> is.list(c(1, 2, 3))
[1] FALSE

> li2 <- as.list(c(1, 2, 3))

> is.list(li2)
[1] TRUE

> unlist(li)
     log       ch int_vec1 int_vec2 int_vec3 
  "TRUE"  "hello"      "2"      "2"      "4" 
int_vec4 int_vec5 int_vec6 int_vec7 int_vec8 
     "4"      "6"      "6"      "8"      "8"

```
- append(), rev()

```sh

> rev(li)
$int_vec
[1] 2 2 4 4 6 6 8 8

$ch
[1] "hello"

$log
[1] TRUE

> append(li, rev(1i))
$log
[1] TRUE

$ch
[1] "hello"

$int_vec
[1] 2 2 4 4 6 6 8 8

[[4]]
[1] 0+1i

> str(rev(li))
List of 3
 $ int_vec: num [1:8] 2 2 4 4 6 6 8 8
 $ ch     : chr "hello"
 $ log    : logi TRUE
> str(append(li, rev(li)))
List of 6
 $ log    : logi TRUE
 $ ch     : chr "hello"
 $ int_vec: num [1:8] 2 2 4 4 6 6 8 8
 $ int_vec: num [1:8] 2 2 4 4 6 6 8 8
 $ ch     : chr "hello"
 $ log    : logi TRUE

```
- grepl()

```sh

> animals <- c("cat", "moose", "impala", "ant", "kiwi")

> grepl(pattern = "a", x = animals)
[1]  TRUE FALSE  TRUE  TRUE FALSE

> grepl(pattern = "^a", x = animals) # 앞에 a가 있냐
[1] FALSE FALSE FALSE  TRUE FALSE

> grepl(pattern = "a$", x = animals) # 맨 뒤에 a가 있냐
[1] FALSE FALSE  TRUE FALSE FALSE

```
- grep()

```sh

> animals <- c("cat", "moose", "impala", "ant", "kiwi")

> grepl(pattern = "a", x = animals)
[1]  TRUE FALSE  TRUE  TRUE FALSE

> grep(pattern = "a", x = animals) # a가 들어있는 원소의 위치
[1] 1 3 4

> which(grepl(pattern = "a", x = animals))
[1] 1 3 4

> grep(pattern = "^a", x = animals)
[1] 4

```

- sub(), gsub()

```sh

> animals <- c("cat", "moose", "impala", "ant", "kiwi")

> sub(pattern = "a", replacement = "o", x = animals)
[1] "cot"    "moose"  "impola" "ont"   
[5] "kiwi"  

> gsub(pattern = "a", replacement = "o", x = animals)
[1] "cot"    "moose"  "impolo" "ont"   
[5] "kiwi" 

> gsub(pattern = "a|i", replacement = "_", x = animals)
[1] "c_t"    "moose"  "_mp_l_" "_nt"   
[5] "k_w_"  

> gsub(pattern = "a|i|o", replacement = "_", x = animals)
[1] "c_t"    "m__se"  "_mp_l_" "_nt"   
[5] "k_w_"

```

- date objects

```sh

> my_date <- as.Date("1971-05-14")

> my_date
[1] "1971-05-14"

> class(my_date)
[1] "Date"

> my_date <- as.Date("1971-14-05")
Error in charToDate(x) : 문자열이 표준서식을 따르지 않습니다

> my_date <- as.Date("1971-14-05", format = "%Y-%d-%m")


> my_date
[1] "1971-05-14"

> my_time <- as.POSIXct("1971-05-14 11:25:15")

> my_time
[1] "1971-05-14 11:25:15 KST"

> my_date
[1] "1971-05-14"

> my_date + 1
[1] "1971-05-15"

> my_date2 <- as.Date("1998-09-29")

> my_date2 - my_date
Time difference of 10000 days


> my_time2 <- as.POSIXct("1974-07-14 21:11:55 CET")

> my_time2
[1] "1974-07-14 21:11:55 KST"

> my_time
[1] "1971-05-14 11:25:15 KST"

> my_time2 - my_time
Time difference of 1157.407 days


> my_date
[1] "1971-05-14"

> unclass(my_date) # 498 days from January 1, 1970
[1] 498

> my_time
[1] "1971-05-14 11:25:15 KST"

> unclass(my_time) 
[1] 43035915 # 43MM seconds from January 1, 1970, 00:00:00
attr(,"tzone")
[1] ""

```

## Text Mining

- 자연어로 구성된 비정형 텍스트 데이터에서 패턴, 관계 등과 같은 고급 정보를 추출하는 과정

- 고급 정보 : 통계적인 패턴 학습 등의 도구를 통해 패턴이나 트렌드를 파악하는 것

- 텍스트 분류, 텍트스 클러스터링, 문서 요약, 감성 분석 등

- 텍스트를 데이터로 변환하는 과정에서 자연어 처리가 필수적

- 일반적인 데이터와는 달리 텍스트는 각 언어별로 어휘적, 문법적 독특성이 있고 그 표현의 형태가 매우 다양하고 복잡하여 일괄된 규칙으로 규정하기 힘듬

### Text mining 방법론

- WordCount : 문서 내에 단어가 몇 번이나 출현하는지 개수를 세는 것

- WordCloud : WordCount한 데이터를 사용하여 시각화하는 방법 중 하나

- 토픽모델링 : 작성된 문서들의 주제를 추론하는 통계적 기법

- 토픽 트렌드 : 문서의 주제가 시간의 흐름에 따라 나타는 변화를 분석

- 계층적 군집분석 : 주어진 텍스트 집단을 내용의 유사성에 따라 소집단으로 분할하는 방법

- 연관 분석 : 데이터에 빈발하는 속성을 찾아내고 그 안에서 연관이 있는 규칙을 발견하는 기법

- 나이브 베이즈 분류 : 지도학습을 사용한 문서 분류(ex), 스팸 메일 분류 등

- 감성 분석 : 텍스트에 나타난 사람들의 태도, 의견, 성향과 같은 주관적인 데이터를 분석하는 자연어 처리 기술

- 사회연결망 분석 : 객체들이 이루고 있는 사회의 형태, 객체 사이의 연결, 정보의 교환 등을 분석

- Word2Vec : 기계 학습을 사용한 자연어 처리 방법으로 단어의 의미를 벡터 방식으로 표현하는 기법


### 토픽 모델링

- 토픽이란, 단어들의 확률 분포로 정의

- 이러한 토픽들의 확률적 혼합체가 문헌

- 이 모든 과정을 역으로 밟아 숨겨져 있는 주제들을 찾는 통계적 추론기법이 토픽 모델링

- 기본 가정 : 각 단어가 서로 독립적이지 않다.

- 대표적으로 활용되는 분석 기법 : LDA(Latent Dirichlet Allocation)

- 토픽모델링에서 발견된 토픽은 토픽이 발생된 시간과 결합되어 분석이 가능

- 이는 해당 주제의 시간 경과에 따른 변화와 이를 활용한 다양한 분석이 가능하다는 것을 알 수 있음

- 토픽 모델링

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA2MTRfNzcg/MDAxNDk3Mzc4NDI2MjU4.7F3_5JKQ5UP4DsdzT-k-OOmTvN3ApNMJkWacambwgy0g.-HW9bLmqWcZJzoJ5Ln4PuCs4Fmq8MB4HS27CRfijP6gg.PNG.jp302119/1.png)

- 토픽 트렌드

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA2MTRfMjEz/MDAxNDk3Mzc4NDI2NDc5.-8c5wNx3rjM0UPt1ppnv3YvNrgqRVcznJ2H82lB7jUUg.0tsWtgEVToJBR0ff3x0_CicCFKEIFoQ4bjeX5NiBwP4g.PNG.jp302119/2%ED%86%A0%ED%94%BD_%ED%8A%B8%EB%A0%8C%EB%93%9C.png)


### 계층적 클러스터링(군집 분석)

- 클러스터링 : 개인 또는 여러 개체를 유사한 속성을 지닌 대상들끼리 그룹 짓는 기법

- 각 변수들의 유사성을 모두 계산하여 계층적으로 분석

- 군집이 형성되는 과정을 정확하게 파악할 수 있음

- 거리측정을 위한 방법

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA2MTRfMTEz/MDAxNDk3Mzc4NDI2NjMw.-th8UbTH112xbBKQYqWuo_7mdPZHe50CHuPLAyUMJxsg.yEGXMbRaK2NI8yyjmXfP2Id-xfpq_3FNp9bNQkAeGTEg.PNG.jp302119/3.png)


### 연관 분석

- 데이터들의 발생 빈도를 기반으로 각 데이터 간의 연관관계를 도출하는 기법

- 먼저 빈발항목집합을 구하고 그 안에서 연관 규칙을 생성

- 지지도 : 기준이 되는 키워드(A)가 전체 문서에서 출현한 비율

- 최소신뢰도 : 기준이 되는 키워드가 출현한 뒤에 따라나올 키워드가 출현한 비율

- 향상도 : 임의로 B가 출현한 경우에 비해 연관 규칙에 의해 B가 출현한 비율(일반적으로 1보다 크면 연관성이 있음)

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA2MTRfMTIw/MDAxNDk3Mzc4NDI2Nzkz.ZyOvO_bikYxLMrATLKYwwjA3Pe6oI7Ok-4Qt63R6qAMg.4JBWEYa-AiCovOgrpRUCFB9cE2Pd8wk0yGhKHlE-UTQg.PNG.jp302119/4.png)


### 감성 분석

- 텍스트에 나타난 사람들의 태도, 의견, 성향과 같은 주관적인 데이터를 분석하는 자연어 처리

- 텍스트에서 감정 단어를 추출하여 점수화

- 방법 : 사전 기반 분석, 기계학습

- 오바마가 대선 때 선거 전략 수립에 사용했던 방법

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA2MTRfMjAx/MDAxNDk3Mzc4NDI3MTY0.Pc-SvX_SZwuPJRa54sgQg6SqKz-nmkx7OkGlI5J7AN8g.2n56M6cXeYW6Wwv2wsxO7xgIEbi_tBH-bRLnRSHBtq8g.PNG.jp302119/5.png)


### 사회 연결망 분석

- 개인과 집단들 간의 관계를 분석하여 구조와 확산 과정을 계량적으로 분석하는 방법론

- 여러 집단들 속에 중심점이 되는 개인과, 다른 집단과 연결점이 되는 개인을 파악 기능

- 사회과학뿐만 아니라 경영학과 응용과학 등 다양한 분양에서 응용되고 있음

- SNS

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA2MTRfMjc5/MDAxNDk3Mzc4NDI3MzI2.o_7QDbuKSEmAMizWWsYtTsFY0q2fQo5A3ByJeG3JwFkg.fN_CVJz2Dq6HsLhoZojKdb7FmsKshul1Gu8VVBo3JdQg.PNG.jp302119/6.png)


### Word2Vec

- 기계학습을 이용한 자연어 처리 기법

- 단어의 의미를 벡터 형태로 표현하는 기법

- 단어의 순서가 근접하여 자주 출현할 수록 두 단어의 Vector 값이 유사하도록 학습

- 단어의 개념 표현을 넘어 추론까지도 손쉽게 구현 가능

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA2MTRfMjE1/MDAxNDk3Mzc4NDI3NTMz.sC2wRO3I_HSHWXKgWZDw7o00vdhrpv-O0ew368QyAEEg.9j06Lm3KqUFmOvFFDSetc2IOIeQKXuAavR7Fw_2aJKsg.PNG.jp302119/7.png)


## 그래프

### plot()

- type = "o" : 점과 선을 중첩해서 그린 그래프

- type = "s" : 왼쪽 값을 기초로 계단 모양으로 연결한 그래프

- type = "l" : 꺾은 선 그래프(점 중첩 x)

- axes = F : x축을 그리지 않는다

- ann = F : y축을 그리지 않는다

- axis(1,at=1:5,lab=c("Mon","TUE","WED","WHU","FRI")) : x축을 1부터 5까지 그리고 범주 값을 월~금으로 설정

- axis(2, ylim = c(0,200) : y축을 200을 최대값으로 설정해서 그린다

- title(main = "Fruit", col.main = "red", fon.main = 4) : 제목을 Fruit으로하고 색상은 빨간색, 글씨체는 4로 설정

- title(xlab="DAY",col.lab="blue") : x축 이름을 DAY로 설정하고 색상은 파란색

- title(ylab="PRICE",col.lab="green") :y축 이름을 PRICE로 설정하고 색상은 초록색

- mfrow = c(1,3) : row는 하나, col은 세 개로 화면 분할

- par(new=T) : 이전의 그래프와 중첩(default = F)

- lines : 중첩했을 때 y축의 값이 겹치는걸 방지(or y축의 값을 넉넉하게 주면 됨)

- legend(4.5,10,c("V1","V2","V3"),cex=0.9,col=c("red","blue","yellow"),lty=1) : 범주의 위치(4.5,10), 글씨 굵기(0.9), 실선으로 표시 

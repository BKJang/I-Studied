# Function Of R

## Declaring functions within functions

```sh

> square.plus.cube <- function(y) {

+   square <- function(x){return(x*x)}

+   cube <- function(x){return(x^3)}

+   return(square(y) + cube(y))

+ }

> square.plus.cube(4)
[1] 80

```

## 가변 길이 인자

- '...'와 같이 표시된 argument로서 개수를 알 수 있는 임의의 argument를 표시하거나, 내부에서 호출하는 다른 함수에 넘겨줄 argument를 표시할 때 사용 가능

```sh

> f <- function(...){
+   args <- list(...)
+   for(a in args){
+     print(a)
+   }
+ }
 
> f('3', '4')

[1] "3"
[1] "4"

> f <- function(...){
+   args <- c(...)  # 벡터로 받으면 하나의 type로 return
+   for(a in args){
+     print(a)
+   }
+ }

> f('3', 4)

[1] "3"
[1] "4

```

```sh
> f <- function(x,y){
+   print(x)
+   print(y)
+ }
 
> g <- function(z, ...){
+   print(z)
+   f(...)
+ }
 
> g(1, 2, 3)

[1] 1
[1] 2
[1] 3

```

## Function as subroutines

```sh

source("the file") # 이미 정의 되어있는 파일을 불러서 사용 가능(다른 사람이 만들어놓은 함수 이용할 때)

```

## Tips for writing functions

- Avoid rewriting the same code -> use functions

- Modularize as much as possible

- Test your function

- Provide documentation, including deatailed comments

- Use meaningful variable and function names


## Variable Scoping

- Variables that are bound to an R primitive or object outside  a function are called global variables, and are accessible everywhere in an R program.

- R functions have no side effects -- they can't change the value of global values.

```sh

> x <- 5 # 전역 변수

> test <- function(){
+   cat(x + 5)
+ }

> test();
10


> x <- 10

> test <- function(){
+   x<- 5 # 지역 변수
+   cat(x+20)
+ }

> test()
25

> cat(x+20)
30


> x <- 10

> test <- function(x){
+   x <- x+10
+   cat(x)
+ }

> test(x)
20

> cat(x)
10 # Avoiding side effects 


x <- 10

> test <- function(x){
+   x <<- x+10
+   cat(x)
+ }

> test(x)
10

> cat(x)
20

# 전역변수는 test() function을 호출한 후 전역변수의 값이 20으로 변경

```

## Defined Functions in apply

- apply함수는 주어진 Matrix을 처리

```sh

> maxMin <- function(x){
+   max(x) - min(x)
+ }

> A <- matrix(1:9, nrow=3, ncol=3)

> v <- apply(A, 1, maxMin) # 1은 행(row)를 의미
> v
[1] 6 6 6

> v <- apply(A, 2, maxMin) # 2는 열(column)을 의미
> v
[1] 2 2 2

> v <- apply(A, 1, mean)
> v
[1] 4 5 6

> v <- apply(A, 2, mean)
> v
[1] 2 5 8

```

## Implicit loops

- lapply : Loop over a list and evaluate a function on each element, Returns the results as a list

```sh

# 1.
> cities <- c("New York", "Paris", "London", "Tokyo",
+             "Rio de Janeiro", "Cape Town")

> num_chars <- c()

> for(i in 1:length(cities)) {
+   num_chars[i] <- nchar(cities[i])
+ }

> num_chars
[1]  8  5  6  5 14  9

# unlist를 쓰는 이유 : lapply를 쓰면 무조건 list 형태로 변환하여 출력

unlist(lapply(cities, nchar)) # for문을 안쓰고 lapply함수로 처리
[1]  8  5  6  5 14  9


# 2.
>oil_prices <- list(2.37, 2.49, 2.18, 2.22, 2.47, 2.32)

> multiply <- function(x, factor){
+   x * factor
+ }

> times3 <- lapply(oil_prices, multiply, factor=3)

> unlist(times3)
[1] 7.11 7.47 6.54 6.66 7.41 6.96

> times4 <- lapply(oil_prices, multiply, factor=4)

> unlist(times4)
[1] 9.48 9.96 8.72 8.88 9.88 9.28

```

- sapply : Same as lapply but try to simplify the result(Simplify)

```sh

# 1.
> cities <- c("New York", "Paris", "London", "Tokyo",
+             "Rio de Janeiro", "Cape Town")

> sapply(cities, nchar)
      New York          Paris 
             8              5 
        London          Tokyo 
             6              5 
Rio de Janeiro      Cape Town 
            14              9 

> sapply(cities, nchar, USE.NAMES = F)
[1]  8  5  6  5 14  9

#2.
> first_and_last <- function(name){
+   name <- gsub(" ", "", name)
+   letters <- strsplit(name, split = "")[[1]] # [[1]]는 리스트를 벡터로 넣기 위해서 
+   c(first = min(letters), last = max(letters))
+ }

> first_and_last("New York")
first  last 
  "e"   "Y" 

> sapply(cities,first_and_last) # Matrix로 결과 산출
      New York Paris London Tokyo
first "e"      "a"   "d"    "k"  
last  "Y"      "s"   "o"    "y"  
      Rio de Janeiro Cape Town
first "a"            "a"      
last  "R"            "w"  

```

- apply : Apply a function over the margins of an array

```sh

# apply함수는 주어진 Matrix을 처리

> maxMin <- function(x){
+   max(x) - min(x)
+ }

> A <- matrix(1:9, nrow=3, ncol=3)

> rowSums <- apply(A, 1, maxMin) # 1은 행(row)를 의미
> rowSums
[1] 6 6 6

> colSums <- apply(A, 2, maxMin) # 2는 열(column)을 의미
> colSums
[1] 2 2 2

> rowMeans <- apply(A, 1, mean)
> rowMeans
[1] 4 5 6

> colMeans <- apply(A, 2, mean)
> colMeans
[1] 2 5 8

```
- tapply : Apply a function over subsets of a vector

```sh

> tapply(iris$Sepal.Length, iris$Species, mean) # Sepal.Length의 평균을 구하고 싶은데 iris$Species를 기준으로
    setosa versicolor  virginica 
     5.006      5.936      6.588

```
- mapply : Multivariate version of lapply

```sh

> list(rep(1, 4), rep(2, 3), rep(3, 2), rep(4, 1))
[[1]]
[1] 1 1 1 1

[[2]]
[1] 2 2 2

[[3]]
[1] 3 3

[[4]]
[1] 4

> mapply(rep, 1:4, 4:1)
[[1]]
[1] 1 1 1 1

[[2]]
[1] 2 2 2

[[3]]
[1] 3 3

[[4]]
[1] 4

```
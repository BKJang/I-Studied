# Concept of R(Review)

## Loop

1. while

- ������ ���� �� ��� ���� ������ ����

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

- ��� ���� ������ �ݺ��ؼ� �����Ѵ�. repeat�� �ٸ� ����� do-while�� �ش�

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

- ���� ���� ���� �ݺ��� ����� ������ �ߴ��ϰ� ���� �ݺ��� ����

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

- ���� ����

```sh

x <- 10
test <- function(x) {
x <<- x + 10 # ���� ������ �� ����
cat(x)
}
test(x) #prints 10
cat(x) #prints 20

```

4. apply

- apply : �迭 �Ǵ� ��Ŀ� �־��� �Լ��� ������ �� �� ����� ����, �迭 �Ǵ� ����Ʈ�� ��ȯ

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

- lapply : ����, ����Ʈ �Ǵ� ǥ���Ŀ� �Լ��� �����Ͽ� �� ����� ����Ʈ�� ��ȯ

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
[1] "list" # list�� ���
```

- sapply : lapply�� ���������� ����� ����, ��� �Ǵ� �迭 �Ǵ� ����Ʈ�� ��ȯ

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

- tapply : ���Ϳ� �ִ� �����͸� Ư�� ���ؿ� ���� �׷����� ���� �� �� �׷츶�� �־��� �Լ��� �����ϰ� �� ����� ��ȯ

```sh

> tapply(iris$Sepal.Length, iris$Species, mean)

#     setosa versicolor  virginica 
#      5.006      5.936      6.588 

```

- mapply : sapply�� Ȯ���������, ���� ���� ���� �Ǵ� ����Ʈ�� ���ڷ� �޾� �Լ��� �� �������� ù° ��ҵ��� ������ ���, ��° ��ҵ��� ������ ���, ��° ��ҵ��� ������ ��� ���� ��ȯ

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

- abs() : ���� ������ ��ȯ

- round() : �ݿø�

- sum() : �հ�

- mean() : �߰� ��

- sort() : ����

- seq() : ����

```sh

> seq(1, 10, by = 3)
[1]  1  4  7 10

> seq(8, 2, by = -2)
[1] 8 6 4 2

> sort(rep(c(8, 6, 4, 2), times = 2))
[1] 2 2 4 4 6 6 8 8

```
- rep() : �ݺ�

```sh

> rep(c(8, 6, 4, 2), times = 2)
[1] 8 6 4 2 8 6 4 2
> rep(c(8, 6, 4, 2), each = 2)
[1] 8 8 6 6 4 4 2 2

```
- sort() : ����

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
- str() : ����(structure)

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

> grepl(pattern = "^a", x = animals) # �տ� a�� �ֳ�
[1] FALSE FALSE FALSE  TRUE FALSE

> grepl(pattern = "a$", x = animals) # �� �ڿ� a�� �ֳ�
[1] FALSE FALSE  TRUE FALSE FALSE

```
- grep()

```sh

> animals <- c("cat", "moose", "impala", "ant", "kiwi")

> grepl(pattern = "a", x = animals)
[1]  TRUE FALSE  TRUE  TRUE FALSE

> grep(pattern = "a", x = animals) # a�� ����ִ� ������ ��ġ
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
Error in charToDate(x) : ���ڿ��� ǥ�ؼ����� ������ �ʽ��ϴ�

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

- �ڿ���� ������ ������ �ؽ�Ʈ �����Ϳ��� ����, ���� ��� ���� ��� ������ �����ϴ� ����

- ��� ���� : ������� ���� �н� ���� ������ ���� �����̳� Ʈ���带 �ľ��ϴ� ��

- �ؽ�Ʈ �з�, ��Ʈ�� Ŭ�����͸�, ���� ���, ���� �м� ��

- �ؽ�Ʈ�� �����ͷ� ��ȯ�ϴ� �������� �ڿ��� ó���� �ʼ���

- �Ϲ����� �����Ϳʹ� �޸� �ؽ�Ʈ�� �� ���� ������, ������ ��Ư���� �ְ� �� ǥ���� ���°� �ſ� �پ��ϰ� �����Ͽ� �ϰ��� ��Ģ���� �����ϱ� ����

### Text mining �����

- WordCount : ���� ���� �ܾ �� ���̳� �����ϴ��� ������ ���� ��

- WordCloud : WordCount�� �����͸� ����Ͽ� �ð�ȭ�ϴ� ��� �� �ϳ�

- ���ȸ𵨸� : �ۼ��� �������� ������ �߷��ϴ� ����� ���

- ���� Ʈ���� : ������ ������ �ð��� �帧�� ���� ��Ÿ�� ��ȭ�� �м�

- ������ �����м� : �־��� �ؽ�Ʈ ������ ������ ���缺�� ���� ���������� �����ϴ� ���

- ���� �м� : �����Ϳ� ����ϴ� �Ӽ��� ã�Ƴ��� �� �ȿ��� ������ �ִ� ��Ģ�� �߰��ϴ� ���

- ���̺� ������ �з� : �����н��� ����� ���� �з�(ex), ���� ���� �з� ��

- ���� �м� : �ؽ�Ʈ�� ��Ÿ�� ������� �µ�, �ǰ�, ����� ���� �ְ����� �����͸� �м��ϴ� �ڿ��� ó�� ���

- ��ȸ����� �м� : ��ü���� �̷�� �ִ� ��ȸ�� ����, ��ü ������ ����, ������ ��ȯ ���� �м�

- Word2Vec : ��� �н��� ����� �ڿ��� ó�� ������� �ܾ��� �ǹ̸� ���� ������� ǥ���ϴ� ���


### ���� �𵨸�

- �����̶�, �ܾ���� Ȯ�� ������ ����

- �̷��� ���ȵ��� Ȯ���� ȥ��ü�� ����

- �� ��� ������ ������ ��� ������ �ִ� �������� ã�� ����� �߷б���� ���� �𵨸�

- �⺻ ���� : �� �ܾ ���� ���������� �ʴ�.

- ��ǥ������ Ȱ��Ǵ� �м� ��� : LDA(Latent Dirichlet Allocation)

- ���ȸ𵨸����� �߰ߵ� ������ ������ �߻��� �ð��� ���յǾ� �м��� ����

- �̴� �ش� ������ �ð� ����� ���� ��ȭ�� �̸� Ȱ���� �پ��� �м��� �����ϴٴ� ���� �� �� ����

- ���� �𵨸�

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA2MTRfNzcg/MDAxNDk3Mzc4NDI2MjU4.7F3_5JKQ5UP4DsdzT-k-OOmTvN3ApNMJkWacambwgy0g.-HW9bLmqWcZJzoJ5Ln4PuCs4Fmq8MB4HS27CRfijP6gg.PNG.jp302119/1.png)

- ���� Ʈ����

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA2MTRfMjEz/MDAxNDk3Mzc4NDI2NDc5.-8c5wNx3rjM0UPt1ppnv3YvNrgqRVcznJ2H82lB7jUUg.0tsWtgEVToJBR0ff3x0_CicCFKEIFoQ4bjeX5NiBwP4g.PNG.jp302119/2%ED%86%A0%ED%94%BD_%ED%8A%B8%EB%A0%8C%EB%93%9C.png)


### ������ Ŭ�����͸�(���� �м�)

- Ŭ�����͸� : ���� �Ǵ� ���� ��ü�� ������ �Ӽ��� ���� ���鳢�� �׷� ���� ���

- �� �������� ���缺�� ��� ����Ͽ� ���������� �м�

- ������ �����Ǵ� ������ ��Ȯ�ϰ� �ľ��� �� ����

- �Ÿ������� ���� ���

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA2MTRfMTEz/MDAxNDk3Mzc4NDI2NjMw.-th8UbTH112xbBKQYqWuo_7mdPZHe50CHuPLAyUMJxsg.yEGXMbRaK2NI8yyjmXfP2Id-xfpq_3FNp9bNQkAeGTEg.PNG.jp302119/3.png)


### ���� �м�

- �����͵��� �߻� �󵵸� ������� �� ������ ���� �������踦 �����ϴ� ���

- ���� ����׸������� ���ϰ� �� �ȿ��� ���� ��Ģ�� ����

- ������ : ������ �Ǵ� Ű����(A)�� ��ü �������� ������ ����

- �ּҽŷڵ� : ������ �Ǵ� Ű���尡 ������ �ڿ� ���󳪿� Ű���尡 ������ ����

- ��� : ���Ƿ� B�� ������ ��쿡 ���� ���� ��Ģ�� ���� B�� ������ ����(�Ϲ������� 1���� ũ�� �������� ����)

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA2MTRfMTIw/MDAxNDk3Mzc4NDI2Nzkz.ZyOvO_bikYxLMrATLKYwwjA3Pe6oI7Ok-4Qt63R6qAMg.4JBWEYa-AiCovOgrpRUCFB9cE2Pd8wk0yGhKHlE-UTQg.PNG.jp302119/4.png)


### ���� �м�

- �ؽ�Ʈ�� ��Ÿ�� ������� �µ�, �ǰ�, ����� ���� �ְ����� �����͸� �м��ϴ� �ڿ��� ó��

- �ؽ�Ʈ���� ���� �ܾ �����Ͽ� ����ȭ

- ��� : ���� ��� �м�, ����н�

- ���ٸ��� �뼱 �� ���� ���� ������ ����ߴ� ���

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA2MTRfMjAx/MDAxNDk3Mzc4NDI3MTY0.Pc-SvX_SZwuPJRa54sgQg6SqKz-nmkx7OkGlI5J7AN8g.2n56M6cXeYW6Wwv2wsxO7xgIEbi_tBH-bRLnRSHBtq8g.PNG.jp302119/5.png)


### ��ȸ ����� �м�

- ���ΰ� ���ܵ� ���� ���踦 �м��Ͽ� ������ Ȯ�� ������ �跮������ �м��ϴ� �����

- ���� ���ܵ� �ӿ� �߽����� �Ǵ� ���ΰ�, �ٸ� ���ܰ� �������� �Ǵ� ������ �ľ� ���

- ��ȸ���лӸ� �ƴ϶� �濵�а� ������� �� �پ��� �о翡�� ����ǰ� ����

- SNS

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA2MTRfMjc5/MDAxNDk3Mzc4NDI3MzI2.o_7QDbuKSEmAMizWWsYtTsFY0q2fQo5A3ByJeG3JwFkg.fN_CVJz2Dq6HsLhoZojKdb7FmsKshul1Gu8VVBo3JdQg.PNG.jp302119/6.png)


### Word2Vec

- ����н��� �̿��� �ڿ��� ó�� ���

- �ܾ��� �ǹ̸� ���� ���·� ǥ���ϴ� ���

- �ܾ��� ������ �����Ͽ� ���� ������ ���� �� �ܾ��� Vector ���� �����ϵ��� �н�

- �ܾ��� ���� ǥ���� �Ѿ� �߷б����� �ս��� ���� ����

![Markdown Here logo](http://blogfiles.naver.net/MjAxNzA2MTRfMjE1/MDAxNDk3Mzc4NDI3NTMz.sC2wRO3I_HSHWXKgWZDw7o00vdhrpv-O0ew368QyAEEg.9j06Lm3KqUFmOvFFDSetc2IOIeQKXuAavR7Fw_2aJKsg.PNG.jp302119/7.png)


## �׷���

### plot()

- type = "o" : ���� ���� ��ø�ؼ� �׸� �׷���

- type = "s" : ���� ���� ���ʷ� ��� ������� ������ �׷���

- type = "l" : ���� �� �׷���(�� ��ø x)

- axes = F : x���� �׸��� �ʴ´�

- ann = F : y���� �׸��� �ʴ´�

- axis(1,at=1:5,lab=c("Mon","TUE","WED","WHU","FRI")) : x���� 1���� 5���� �׸��� ���� ���� ��~������ ����

- axis(2, ylim = c(0,200) : y���� 200�� �ִ밪���� �����ؼ� �׸���

- title(main = "Fruit", col.main = "red", fon.main = 4) : ������ Fruit�����ϰ� ������ ������, �۾�ü�� 4�� ����

- title(xlab="DAY",col.lab="blue") : x�� �̸��� DAY�� �����ϰ� ������ �Ķ���

- title(ylab="PRICE",col.lab="green") :y�� �̸��� PRICE�� �����ϰ� ������ �ʷϻ�

- mfrow = c(1,3) : row�� �ϳ�, col�� �� ���� ȭ�� ����

- par(new=T) : ������ �׷����� ��ø(default = F)

- lines : ��ø���� �� y���� ���� ��ġ�°� ����(or y���� ���� �˳��ϰ� �ָ� ��)

- legend(4.5,10,c("V1","V2","V3"),cex=0.9,col=c("red","blue","yellow"),lty=1) : ������ ��ġ(4.5,10), �۾� ����(0.9), �Ǽ����� ǥ�� 

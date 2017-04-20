# Control Structure of R

## if, ifelse

```sh

x <- 1:10

is.numeric(x)

# [1] TRUE

if(is.numeric(x)) print(x)

# [1]  1  2  3  4  5  6  7  8  9 10


test <- c(T, F, T, F)

yes <- 1:4

no <- 0

ifelse(test, yes, no)

# [1] 1 0 3 0

x <- c(1, 4, 5, 7)

y <- c(2, 3, 4, 8)

ifelse(x>y, x, y)

# [1] 2 4 5 8

```

## for

```sh

for(i in 1:10){
+   print(i)
+ }

# result

[1] 1
[1] 2
[1] 3
[1] 4
[1] 5
[1] 6
[1] 7
[1] 8
[1] 9
[1] 10


x <- c("a", "b", "c", "d")

for(i in 1:4){
+   print(x[i])
+ }

# result

[1] "a"
[1] "b"
[1] "c"
[1] "d"

for(letter in x){
+   print(letter)
+ }

# result

[1] "a"
[1] "b"
[1] "c"
[1] "d"

for(i in 1:4) print(x[i])

# result

[1] "a"
[1] "b"
[1] "c"
[1] "d"

for(i in 1:10)
+   print(i)

# result

[1] 1
[1] 2
[1] 3
[1] 4
[1] 5
[1] 6
[1] 7
[1] 8
[1] 9
[1] 10

print("next")

# [1] "next"

print(i+1)

# [1] 11

for(i in c(1, 2, 4))
+   print(i)

# result

[1] 1
[1] 2
[1] 4

for(i in c("test", "for", "for()"))
+   print(i)

# result

[1] "test"
[1] "for"
[1] "for()"


x <- matrix(1:6, 2, 3)

for(i in seq_len(nrow(x))){ # 1:nrow(x)
+   for(j in seq_len(ncol(x))){ # 1:ncol(x)
+     print(x[i, j])
+   }
+ }

# result

[1] 1
[1] 3
[1] 5
[1] 2
[1] 4
[1] 6

```

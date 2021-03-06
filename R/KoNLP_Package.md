#KoNLP_Package

##Intro

R에서 한국어를 보다 쉽게 사용하기 위해 "전희원"이 만든 Package.

한국어 관련 작업에서 대부분 다 사용.

[Reference] : Search in Google as "KoNLP in r"

```shell

install.packages("KoNLP")

library(KoNLP)


# install.packages : package를 설치

# library() : 설치된 패키지를 Loading

```

## extractNoun

- extractNoun : 한글을 입력 받아 명사를 추출해주는 함수(Hannanum analyzer를 사용)

```shell

v1 <- ("봄이 지나면 여름이고 여름이 지나면 가을입니다. 그리고 겨울이죠")

# [Grammer]변수 <- 데이터 : 변수에 데이터를 저장

v1

# 출력 : [1]"봄이 지나면 여름이고 여름이 지나면 가을입니다. 그리고 겨울이죠"

extract(v1)

# 출력 : [1] "여름" "여름" "가을" "겨울"

v2 <- ("봄이지나 면여름이고 여름이지나면가을 입니다")

extractNoun(v2)

# 출력 : "면여름이고" "여름"       "이지"       "나면"       "가을"    

# extractNoun는 공백을 기준으로 단어를 판단함.

```

## sapply

- sapply : 여러 줄로 된 데이터를 처리해야 할 경우 사용

```shell

v3 <- ("봄이 지나면 여름이고 여름이 지나면 가을입니다",

+ "그리고 겨울이죠")

extractNoun(v3)

# error : extractNoun 함수는 한 줄만 처리 가능

v4 <- sapply(v3,extractNoun,USE.NAMES=F)

v4

# 출력 : [[1]] [1] "여름" "여름" "가을" [[2]] [1] "겨울"

```

## Refer

[R라뷰 by 서진수]

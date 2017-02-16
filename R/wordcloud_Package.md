# wordcloud_Package

[Result Example]

![Markdown Here logo](http://cfile24.uf.tistory.com/image/2414F74C589F2AAA234D07)

[Reference] : Search in Google as "wordcloud in r"

```shell

install.packages("wordcloud")

library(wordcloud)

useSejongDic()


# useSejongDIc() : 한글이 저장되어 있는 세종사전을 사용함을 명시

```

## Options

- words : 출력할 단어

- freq : 언급된 빈도 수

- scale : 글자 크기

- min.freq : 최소 언급 횟수 지정 - 이 값 이상 언급된 단어만 출력

- max.words : 최대 언급 횟수 지정 - 이 값 이상 언급된 단어는 삭제

- random.order : 출력되는 순서를 임의로 지정

- random.color : 글자 색상을 임의로 지정

- rot.per : 단어배치를 90도 각도로 출력

- colors : 출력될 단어들의 색상 지정
 
- ordered.colors : TRUE일 경우, 각 글자별로 색상을 순서대로 지정

- use.r.layout : FALSE일 경우, R에서 C++ 사용 가능

[Example]

```shell

# example1

wordcloud(words,freq,scale=c(4,.5),min.freq=3,max.words=lnf,random.order=TRUE,

random.color=FALSE,rot.per=.1,colors="black",ordered.colors=FALSE,

use.r.layout=FALSE,fixed.asp=TRUE, ...)

```

```shell

# example2

# 색상 없이 wordcloud 생성

wordcloud(c(letters,LETTERS,0:9), seq(1,1000,len=62)

```

```shell

# example3

# 색상을 사용하여 wordcloud 생성

library(RColorBrewer)

palete <- brewer.pal(9, "SET1")

wordcloud(c(letters,LETTERS,0:9),seq(1,1000,len=62).colors=palete)

# RcolorBrewer : 다양한 색상을 가진 RColorBrewer Library 사용

```

## Refer

[R라뷰 by 서진수]

# Compressing in Linux

## gzip, bzip2

- gzip : 해당 파일을 gz형식으로 압축

- bzip2 : 해당 파일을 bz2형식으로 압축


1. 용량이 줄어든다.

2. 원본유지가 안된다.

3. 단일 파일만 압축할 수 있다.


[문법]

```sh

# 압축

gzip / bzip2 [파일명]

# 압축 풀기

gzip / bzip2 -d [파일명]

```

![Markdown Here logo](http://cfile28.uf.tistory.com/image/237723365795ECD531AA47)


- gzip 방식과 bzip2방식의 효율 비교

![Markdown Here logo](http://cfile26.uf.tistory.com/image/256BF2455796016418C8EB)


## tar

- tar : 해당 파일을 보관파일로 바꿔준다.


1. 용량이 늘어난다

2. 원본유지가 가능하다.

3. 다중파일이 가능하다.


[Option]

- c : 새로운 보관파일 생성한다.

- x : 보관파일을 풀어준다.

- v : 파일이 묶이거나 풀리는 과정을 보여준다.

- f : 보관 파일명을 지정해준다.

- z : gzip방식 추가

- j : bzip2 방식 추가


[Example]

- 단일 파일로 보관

![Markdown Here logo](http://cfile4.uf.tistory.com/image/227794505795F1F61C278C)


- 보관 파일 내의 내용 보기

![Markdown Here logo](http://cfile25.uf.tistory.com/image/24032B4C5795F266209630)


- 보관 파일 풀기

![Markdown Here logo](http://cfile22.uf.tistory.com/image/2573144A5795F49E349968)


- 다중 파일을 하나의 파일로 보관 후 이를 압축

![Markdown Here logo](http://cfile26.uf.tistory.com/image/275CF14F5795F343214D63)

위의 방식은 보관 파일로 만든 뒤 압축을 진행하는 방식

이를 더 간단히 하기 위해 z(gzip방식) 옵션과 j(bzip2방식) 옵션을 사용


- z나 j옵션 사용

![Markdown Here logo](http://cfile27.uf.tistory.com/image/2364113C5796037B33CFD5) 

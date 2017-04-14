# IO_Of_R

## Input

#### scan() 

- 기초적인 입력 명령어

- File도 읽어올 수 있다.

- scan("")을 입력하면 키보드에서 값을 입력받을 수 있다.(거의 쓸 일 없음)

```sh

a <- scan("", what = "character") # what = type
1: "sdfsdf" "ggg" 3
4: 5 6
6: nghn
7: 

a

# [1] "sdfsdf" "ggg"    "3"      "5"      "6"   "nghn"


setwd("C:/users/Adminisrators\Documents") # workdirectory 설정

a <- scan("file.txt", what = "character")

a

# [1] "hello" "world"

```

#### readline()

- 한 줄 단위로 입력을 받는 명령어

- 입력 값은 항상 character로 받는다.

```sh

b <- readline("수를 입력 : ")
수를 입력 : 12

class(b)

# [1] "character"

```

## Output

#### print()

- 기초적인 출력명령어

- 변수 이름만 실행해도 출력이 되지만, 나중에 배울 for문이나 함수 안에서는 출력명령어를 써주지 않을 경우 출력이 되지 않음

- 한번에 하나의 객체만 출력 가능함

cat()

- 기초적인 출력명령어

- 여러 객체 값을 출력할 수 있음

- \t,\n등의 연산자 적용가능

- 출력할 때 한 칸씩 띄어쓰기가 적용됨

- sep=“”으로 개체간 구분자 설정 가능


## Load Dataset

- R은 통계를 위한 언어로 R의 기능을 테스트하기 위한 R 자체에서 제공하는 내부 dataset이 존재

- 그 외에도 많은 통계 패키지 또는 머신러닝 패키지들이 데모 목적의 데이터세트을 함께 제공

- 이들 데이터는 R 자체 내장 데이터세트가 아닌 Package를 설치하여 사용해야 하는 dataset

```sh
install.packages("MASS")

library(MASS) # MASS 라이브러리에서 작업

data() # 사용가능한 데이터 목록 제공

?Boston # Help창(R-studio 기준)에 제공

```

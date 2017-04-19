# IO_Of_R

## Input

#### scan() 

- 기초적인 입력 명령어

- File도 읽어올 수 있다.

- scan("")을 입력하면 키보드에서 값을 입력받을 수 있다.(거의 쓸 일 없음)

[Option]

- file : 파일을 불러올 경로를 입력

- what : 데이터의 유형을 지정

- sep : 데이터 구분 기호를 입력(default : 공백)

- skip : 데이터를 불러오는 과정에서 제외할 최대 행의 수를 지정, 예를 들어 2를 입력하면 세번 째 행부터 입력 시작

- nlines : 불러들일 최대 행의 수를 지정

- na.strings : R에서 결측값으로 인식할 데이터의 형태를 입력

```sh

a <- scan("", what = "character") # what = type
1: "sdfsdf" "ggg" 3
4: 5 6
6: nghn
7: 

a

# [1] "sdfsdf" "ggg"    "3"      "5"      "6"   "nghn"


setwd("C:/users/Adminisrators\Documents") # workdirectory 설정 / getwd() : working directory 확인

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

## read.csv()

- read.table()에서 가져온 거지만 sep = ","로 default 설정 되어있는 function
[Option]

- file = : 읽어올 file 경로를 포함한 이름 값 넘겨주기

- header = : 파일의 첫 행을 열 이름으로 가져올 것인지 여부

- sep = : 행을 구분 짓는 기준을 정함

- stingAsFactors = : 이 값을 False로 주지 않으면 모든 character 값들이 factor 값으로 들어오게 됨

- na.strings = : NA값을 처리할 string들을 처리해줄 수 있음

- fileEncoding = : 불러읽어들일 파일의 인코딩을 지정(UTF, 유니코드 ...)

- row.names : 불러들일 file의 선택한 위치의 열을 행 이름으로 지정

- col.names : 불러들일 file의 선택한 위치의 행을 열이름으로 지정

#### csv?

- A comma-separated values(CSV) file stores tabular data(numbers and text) in plain text.

- Each line of the files is a data record.

- Each record consists of one or more fields, separated by comma.

- The use of the comma as a field separator is the source of the name for this file format.

- Comma Separated Value의 약자로 ','를 기준으로 열을 구분하는 파일로 보통 엑셀을 활용하여 파일을 읽거나 생성

- 일반 메모장에서도 파일을 열 수 있으며, database 등과도 포맷 변환이 가능

- ','는 데이터를 구분하기 위한 구분자(delimiter) 또는 separator로서 csv 포맷은 ','로 구분되나 텍스트 파일에서 데이터를 구분하기 위한 구분자로, space(" "), tab 등 다양한 구분자 사용 가능


## read.table()


```sh

df <- read.csv("lala_review_sample.csv", header = T, stringsAsFactors = F) # read.csv()

df1 <- read.table("lala_review_sample.csv", sep = ",", header = T, stringsAsFactors = F) # read.table() : read.csv()에 sep = ","을 추가

```

## read.xlsx()

- 엑셀 파일을 읽기 위한 명령어

- "xlsx"라는 package를 설치해야 실행 가능

- read.xlsx("파일명", sheetIndex="", sheetName="")

- 일반적으로 sheetIndex나 sheetName 둘 중 하나를 사용하여 load

- 둘 다 지정을 안 해 줄 경우, 에러가 발생하고 파일을 읽지 못함


## read.HTMLTable()

- XML 패키지에 있음

- readHTMLTable("홈페이지 주소")로 사용하면 해당 페이지의 표에 들어있는 정보를 크롤링

- 웹 페이지에 있는 모든 표를 Data Frame으로 가져오고 각각의 표를 List에 담아 제공

- 따라서 첫 번째 표를 출력하고 싶으면 [[1]]

```sh

install.packages("XML")

library(XML)

world_pop <- readHTMLTable("http://www.worldometers.info/world-population/")

wp <- world_pop[[2]]

save(wp, file="wp.RData") # wp.RData로 저장

load("wp.RData")

```

## write.table()

- table 형태의 2차원 데이터를 파일을 생성해서 저장

- txt, csv, tsv 등의 format 기능

- wirte.table(variable, "filename", sep="", row.names=F)

[Option]

- variable : 데이터를 가지고 있는 변수

- filename : 생성하고자 하는 파일 이름

- sep ="" : csv나 tsv로 만들고자 할 경우, 열을 구분하는 기준을 설정

- row.names= : rowname을 파일에 저장할건지 정하는 인수, T면 저장 F면 저장 안함

- quote : 문자열의 따옴표을 없애주는 옵션으로 T는 넣는 것, F는 빼는 것

```sh

write.csv(wp, "xp.csv", row.names=F)

rm(wp) # 메모리에 있는 특정 객체 삭제 

rm(list=ls()) # 메모리에 있는 모든 객체 삭제


```


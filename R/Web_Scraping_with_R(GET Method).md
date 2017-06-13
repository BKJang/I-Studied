# Web Scraping with R (GET Method)

- Web에서 원하는 데이터들을 긁어모으는 것(Web Crawling)

- Price Scraping : Scraping Prices of e-commerce products

- Content Scraping : Focus on unique content

- Classified Listing : Property listing


## How to begin Web scraping

- Hand : 정보가 필요한 웹페이지를 직접 마우스로 긁어서 엑셀에 저장

- Software : Chrome 확장 프로그램 중 "Scraper" or "import.io"이용

- Programming : R의 rvest패키지 또는 Python의 Beautifulsoup등 패키지를 이용


## HTTP

- Using GET : URL에 argument가 같이 넘어감(Embedding data in URL)

```sh

#[Example]

http://www.ajou.com/send.php?Var1=value1&Var2=value2&Var3=value3

```

- Using POST : argument는 숨어서 넘어감

```sh

#[Example]

https://eungdapso.seoul.go.kr/Shr/Shr01/Shr01_lis.jsp

```

## R packages for Web scraping

- rvest : get방식의 http주소를 사용하는 경우

- httr : post방식으로 데이터를 요철해서 가져오는 경우 추가로 사용

- Rselenium : 웹페이지가 자바스크리브나 ajax 등을 이용해 동적으로 구성된 경우


### rvest(GET방식)

- 예제 : http://movie.daum.net/main/new


#### Step1 : 영화 '더 킹'리뷰 첫 페이지에서 영화 리뷰 가져오기(사용자명, 리뷰점수, 리뷰내용)

- 원하는 page의 주소 패턴 파악

- 대상 page에서 원하는 부분의 tag구조 파악(원하는 웹 페이지에서 F12)-Css Selector에 대한 이해

E : E 요소를 선택

E.Class : E 요소의 Class로 지정된 요소 선택

E#id : E 요소의 id로 지정된 요소 선택

E:first-child : E 요소의 첫 번째 자식 요소

E:nth-child(n) : E 요소의 n번째 자식 요소

```sh

install.packages("rvest")

library(rvest)

# 웹페이지 주소가 결정되면 URL을 변수에 저장

url <- "http://movie.daum.net/moviedb/grade?movieId=98333&type=netizen"

htxt <- read_html(url) # 저장된 URL을 이용해 내용을 읽어옴

user <- html_nodes(htxt,'em.link_profile') # 사용자명 Selector : em.link_profile

rate <- html_nodes(htxt,'em.emph_grade') # 리뷰 점수 Selector : em.emph_grade

review <- html_nodes(htxt,'p.desc_review') # 리뷰 내용 Selector : p.desc_review


# html_text : Text만 추출

user <- html_text(user)

rate <- html_text(rate)

review <- html_text(review)


# 정제하기(str_trim())

library(stringr)

review <- str_trim(review)

review <- gsub("\r", "", review)


# 저장하기

# 데이터를 컬럼 별로 묶어 dataframe 생성

page <- data.frame(user, rate, review)

write.csv(page,"theking1page.csv", row.names=F)

```

#### Step2 : 여러 페이지를 가져와 Step1 반복

```sh

# 페이지에 대한 주소 규칙은?

# http://movie.daum.net/moviedb/grade?movieId=98333&type=netizen&page=

url_base <- "http://movie.daum.net/moviedb/grade?movieId=98333&type=netizen&page="

total_review <- NULL # 각 페이지의 리뷰를 전부 합칠 변수를 초기화

for(i in 1:248){ # 최대 페이지 수만큼 반복
  url <- paste(url_base, i, sep="")
 
	 # 1단계 반복
	 # ...

  total_review = rbind(total_review, page) # 전체리뷰를 통합
  
}

write.csv(total_review, "theking_review.csv", row.names = F)

```

#### Step3 : 원하는 데이터를 가져오기(실시간 예매순위 상위 20게 영화의 전체리뷰)

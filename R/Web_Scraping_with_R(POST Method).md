# Web Scraping with R (POST Method)

- 웹브라우저가 제공하는 개발자 도구 이용(F12)

- Network tab 이용

- 전송내역을 확인

- Name tab에서 마우스 오른쪽 버튼을 누르고 Method 추가

- 주소창의 내용과 Method를 확인하여 POST방식의 요청을 확인

- Name을 클릭하고 Headers를 클릭하여 내용 확인

- 맨 아래의 Form Data의 내용 확인

```sh

library(httr)

library(rvest)

# URL대신, 주소창의 주소와 form data의 내용 입력 

estate <- POST('http://www.realtyprice.kr/notice/search/gsSearchList.search',
	body=list(
	  search_gbn=0,	  	page_no=1,
	  reg_name='서울특별시 강동구 강일동',
	  search_cd=0,    	sreg=11740,
	  seub=11000,	  	year=2016,
	  old_reg='00000',	old_eub='00000'
	  gbn=0
	)
)

h <- read_html(estate)

c <- html_nodes(h, 'tbody > tr') %>% html_text() # table에서 각 행별로 데이터 추출

library(stringr)

c <- str_trim(c)

c <- gsub("\r", "", c)

c <- gsub("\t", "", c)

c <- gsub("\n", "", c)

```
# Web Scraping with R (POST Method)

- ���������� �����ϴ� ������ ���� �̿�(F12)

- Network tab �̿�

- ���۳����� Ȯ��

- Name tab���� ���콺 ������ ��ư�� ������ Method �߰�

- �ּ�â�� ����� Method�� Ȯ���Ͽ� POST����� ��û�� Ȯ��

- Name�� Ŭ���ϰ� Headers�� Ŭ���Ͽ� ���� Ȯ��

- �� �Ʒ��� Form Data�� ���� Ȯ��

```sh

library(httr)

library(rvest)

# URL���, �ּ�â�� �ּҿ� form data�� ���� �Է� 

estate <- POST('http://www.realtyprice.kr/notice/search/gsSearchList.search',
	body=list(
	  search_gbn=0,	  	page_no=1,
	  reg_name='����Ư���� ������ ���ϵ�',
	  search_cd=0,    	sreg=11740,
	  seub=11000,	  	year=2016,
	  old_reg='00000',	old_eub='00000'
	  gbn=0
	)
)

h <- read_html(estate)

c <- html_nodes(h, 'tbody > tr') %>% html_text() # table���� �� �ະ�� ������ ����

library(stringr)

c <- str_trim(c)

c <- gsub("\r", "", c)

c <- gsub("\t", "", c)

c <- gsub("\n", "", c)

```
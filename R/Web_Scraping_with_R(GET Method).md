# Web Scraping with R (GET Method)

- Web���� ���ϴ� �����͵��� �ܾ������ ��(Web Crawling)

- Price Scraping : Scraping Prices of e-commerce products

- Content Scraping : Focus on unique content

- Classified Listing : Property listing


## How to begin Web scraping

- Hand : ������ �ʿ��� ���������� ���� ���콺�� �ܾ ������ ����

- Software : Chrome Ȯ�� ���α׷� �� "Scraper" or "import.io"�̿�

- Programming : R�� rvest��Ű�� �Ǵ� Python�� Beautifulsoup�� ��Ű���� �̿�


## HTTP

- Using GET : URL�� argument�� ���� �Ѿ(Embedding data in URL)

```sh

#[Example]

http://www.ajou.com/send.php?Var1=value1&Var2=value2&Var3=value3

```

- Using POST : argument�� ��� �Ѿ

```sh

#[Example]

https://eungdapso.seoul.go.kr/Shr/Shr01/Shr01_lis.jsp

```

## R packages for Web scraping

- rvest : get����� http�ּҸ� ����ϴ� ���

- httr : post������� �����͸� ��ö�ؼ� �������� ��� �߰��� ���

- Rselenium : ���������� �ڹٽ�ũ���곪 ajax ���� �̿��� �������� ������ ���


### rvest(GET���)

- ���� : http://movie.daum.net/main/new


#### Step1 : ��ȭ '�� ŷ'���� ù ���������� ��ȭ ���� ��������(����ڸ�, ��������, ���䳻��)

- ���ϴ� page�� �ּ� ���� �ľ�

- ��� page���� ���ϴ� �κ��� tag���� �ľ�(���ϴ� �� ���������� F12)-Css Selector�� ���� ����

E : E ��Ҹ� ����

E.Class : E ����� Class�� ������ ��� ����

E#id : E ����� id�� ������ ��� ����

E:first-child : E ����� ù ��° �ڽ� ���

E:nth-child(n) : E ����� n��° �ڽ� ���

```sh

install.packages("rvest")

library(rvest)

# �������� �ּҰ� �����Ǹ� URL�� ������ ����

url <- "http://movie.daum.net/moviedb/grade?movieId=98333&type=netizen"

htxt <- read_html(url) # ����� URL�� �̿��� ������ �о��

user <- html_nodes(htxt,'em.link_profile') # ����ڸ� Selector : em.link_profile

rate <- html_nodes(htxt,'em.emph_grade') # ���� ���� Selector : em.emph_grade

review <- html_nodes(htxt,'p.desc_review') # ���� ���� Selector : p.desc_review


# html_text : Text�� ����

user <- html_text(user)

rate <- html_text(rate)

review <- html_text(review)


# �����ϱ�(str_trim())

library(stringr)

review <- str_trim(review)

review <- gsub("\r", "", review)


# �����ϱ�

# �����͸� �÷� ���� ���� dataframe ����

page <- data.frame(user, rate, review)

write.csv(page,"theking1page.csv", row.names=F)

```

#### Step2 : ���� �������� ������ Step1 �ݺ�

```sh

# �������� ���� �ּ� ��Ģ��?

# http://movie.daum.net/moviedb/grade?movieId=98333&type=netizen&page=

url_base <- "http://movie.daum.net/moviedb/grade?movieId=98333&type=netizen&page="

total_review <- NULL # �� �������� ���並 ���� ��ĥ ������ �ʱ�ȭ

for(i in 1:248){ # �ִ� ������ ����ŭ �ݺ�
  url <- paste(url_base, i, sep="")
 
	 # 1�ܰ� �ݺ�
	 # ...

  total_review = rbind(total_review, page) # ��ü���並 ����
  
}

write.csv(total_review, "theking_review.csv", row.names = F)

```

#### Step3 : ���ϴ� �����͸� ��������(�ǽð� ���ż��� ���� 20�� ��ȭ�� ��ü����)


### POST ���
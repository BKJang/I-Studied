# Factor_Of_R

## Factor

- 범주형 자료의 데이터 형태, ex)학과, 시, 도...

```sh

# [문법]

factor(x, levels = 범주, labels = 이름 , ordered = T 순서형 전환) 
 

blood <- c("B", "AB", "O", "A", "O", "A") # 변수 설정

blood # 변수 값 출력

# "B"  "AB" "O"  "A"  "O"  "A" 

blood_factor <- factor(blood) # factor 변수 설정

blood_factor # factor 변수 값 출력

# B  AB O  A  O  A 
# Levels: A AB B O

levels(blood_factor) # 범주 출력

# "A"  "AB" "B"  "O" 

nlevels(blood_factor) # 범주 갯수 출력

# 4

table(blood_factor) # blood_factor라는 factor의 변수값과 범주 갯수를 테이블 형태로 출력

# blood_factor
#  A AB  B  O 
#  2  1  1  2

```

#### Order levels differently

```sh

blood <- c("B", "AB", "O", "A", "O", "A")

blood_factor2 <- factor(blood, levels = c("O","A","B","AB")) # use levels option

blood_factor2

# B  AB O  A  O  A 
# Levels: O A B AB

str(blood_factor2) # levels option used

# Factor w/ 4 levels "O","A","B","AB": 3 4 1 2 1 2

str(blood_factor) # levels option not used

# Factor w/ 4 levels "A","AB","B","O": 3 2 4 1 4 1

# levels 옵션을 사용하면 지정한 범주의 순서대로 지정된다.

```

#### Rename factor levels

```sh

bf1 <- factor(blood, levels =  c("O", "A", "B", "AB")) # levels는 실제 값을 불러옴

bf1

# B  AB O  A  O  A 
# Levels: O A B AB

bf2 <- factor(blood, labels = c("BT_A", "BT_B", "BT_AB", "BT_O")) # labels는 실제 값이 아닌 label을 붙여줌


bf2

# BT_AB BT_B  BT_O  BT_A  BT_O  BT_A 
# Levels: BT_A BT_B BT_AB BT_O

bf1 <- factor(blood, levels =  c("BT_A", "BT_B", "BT_AB", "BT_O"))

bf1

# <NA> <NA> <NA> <NA> <NA> <NA>
# Levels: BT_A BT_B BT_AB BT_O


# 실제 blood의 값에는 ("BT_A", "BT_B", "BT_AB", "BT_O") 값들이 없기 때문에 <NA>로 표시

```

#### Ordered factor

```sh

tshirt <- c("M", "L", "S", "S", "L", "M", "L", "M")

tshirt_factor <- factor(tshirt, ordered = TRUE, levels = c("S", "M", "L")) # ordered의 값이 TRUE이면, 작은 범주 값 부터 순서대로 배열

tshirt_factor

# M L S S L M L M
# Levels: S < M < L

tshirt_factor[1] < tshirt_factor[2]

# TRUE

```

- Excercise

```sh
job <- c(1, 3, 2, 4, 3, 2, 1, 4 , 2, 1, 1, 4, 4)

factor.name <- c("학생", "취준생", "회사원", "백수")

job.f <- factor(job, levels=c(1, 2, 3, 4), labels = factor.name)

job.f

# 학생   회사원 취준생 백수   회사원 취준생 학생 백수   취준생 학생   학생   백수   백수  
# Levels: 학생 취준생 회사원 백수

job.f <- factor(job, ordered = T, levels=c(1, 2, 3, 4), labels = factor.name)

job.f

# 학생   회사원 취준생 백수   회사원 취준생 학생 백수   취준생 학생   학생   백수   백수  
# Levels: 학생 < 취준생 < 회사원 < 백수

table(job.f)

# job.f
#  학생 취준생 회사원   백수 
#     4      3      2      4 

job.f[4] < job.f[1]

# FALSE

```
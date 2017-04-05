# List_Of_R

## List

- 여러 가지 유형을 가진 객체들의 집합

- 리스트를 이루는 각 객체들을 성분(component)라고 함

- 서로 다른 유형을 가진 데이터들로 구성 가능

- 서로 다른 길이, 차원으로 구성 가능

- list()함수를 이용하여 생성

```sh

# [문법]

list(key1 = value1, key2 = value2, ...)



# <1>

Lst <- list(name = "Joe", height = "182", no.children = 3, child.ages = c(5,7,10))

Lst

# $name
# [1] "Joe"

# $height
# [1] "182"

# $no.children
# [1] 3

# $child.ages
# [1]  5  7 10

Lst[4] # x[n] : 리스트 x에서 n번쨰 데이터의 서브리스트

# $child.ages
# [1]  5  7 10

Lst[[4]] #x[[n]] : 리스트 x에서 n번째 저장되는 값

# [1]  5  7 10

Lst$height # x$key : 리스트 x에서 키 값 key에 해당하는 값

# [1] "182"



# <2>

similar_song <- list(title = "R you on time?", duration = 230)

song <- list(title = "Rsome times", duration = 190, trak = 5, similar = similar_song)

song

# $title
# [1] "Rsome times"

# $duration
# [1] 190

# $trak
# [1] 5

# $similar
# $similar$title
# [1] "R you on time?"

# $similar$duration
# [1] 230

str(song)

# List of 4
#  $ title   : chr "Rsome times"
#  $ duration: num 190
#  $ trak    : num 5
#  $ similar :List of 2
#   ..$ title   : chr "R you on time?" # ..: similar 하위에 속한 값들
#   ..$ duration: num 230

str(song[4])

# List of 1
#  $ similar:List of 2
#   ..$ title   : chr "R you on time?"
#   ..$ duration: num 230

str(song[[4]])

# List of 2
#  $ title   : chr "R you on time?"
#  $ duration: num 230

song[[4]][1]

# $title
# [1] "R you on time?"

song[[4]][[1]]

# [1] "R you on time?"

song[[c(4, 1)]]

# [1] "R you on time?"

song[c(1, 2)]

# $title
# [1] "Rsome times"

# $duration
# [1] 190

song[1][2] # song[c(1, 2)]와 다른 의미!!

# $<NA>
# NULL

```

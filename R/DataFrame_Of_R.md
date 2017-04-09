# DataFrame_Of_R

## DataFrame

- 2���� �������� �̷��� table ������ �ڷ�

- ó���� �����͸� ������ �������� ��Ʈ�� ���� ����

- �� ������ ���� �ٸ� �����͸� ���� �� ����

- ��, ��� ���� ���� ���̰� ���ƾ� ��(������ ����)

```sh

name <- c("Anne", "Pete", "Frank", "Julia", "Cath")

age <- c(28, 30, 21, 39, 35)

child <- c(FALSE, TRUE, TRUE, FALSE, TRUE)

people <- data.frame(name, age, child)

people

#    name age child
# 1  Anne  28 FALSE
# 2  Pete  30  TRUE
# 3 Frank  21  TRUE
# 4 Julia  39 FALSE
# 5  Cath  35  TRUE

names(people) <- c("Name", "Age", "Child")

people

#    Name Age Child
# 1  Anne  28 FALSE
# 2  Pete  30  TRUE
# 3 Frank  21  TRUE
# 4 Julia  39 FALSE
# 5  Cath  35  TRUE

people <- data.frame(Name=name, Age=age, Child = child)

people

#    Name Age Child
# 1  Anne  28 FALSE
# 2  Pete  30  TRUE
# 3 Frank  21  TRUE
# 4 Julia  39 FALSE
# 5  Cath  35  TRUE

```

- Data Frame Attributes

```sh

names(people)

# [1] "Name"  "Age"   "Child"

rownames(people)

# [1] "1" "2" "3" "4" "5"

people$Age

# [1] 28 30 21 39 35

people$age

# NULL

colnames(people)

# [1] "Name"  "Age"   "Child"

```

- Subset Data Frame

```sh

people[3, 2]

# [1] 21

people[3, "Age"]

# [1] 21

people[3, ]

#    Name Age Child
# 3 Frank  21  TRUE

people[,"Age"]

# [1] 28 30 21 39 35
#  people[c(3, 5), c("Age", "Child")]
#   Age Child
# 3  21  TRUE
# 5  35  TRUE

people[2]

#   Age
# 1  28
# 2  30
# 3  21
# 4  39
# 5  35

people[,2]

# [1] 28 30 21 39 35

class(people[1])

# [1] "data.frame" # dataframe�� ���·�

class(people[,1])

# [1] "factor" # factor�� ���·�

people$Age

# [1] 28 30 21 39 35

people[["Age"]]

# [1] 28 30 21 39 35

people[[2]]

# [1] 28 30 21 39 35

people[c(1, 2)]

#    Name Age
# 1  Anne  28
# 2  Pete  30
# 3 Frank  21
# 4 Julia  39
# 5  Cath  35

people[c(1,2), ]

#   Name Age Child
# 1 Anne  28 FALSE
# 2 Pete  30  TRUE

people[, c(1,2)] # dataframe�� ���·�

#    Name Age
# 1  Anne  28
# 2  Pete  30
# 3 Frank  21
# 4 Julia  39
# 5  Cath  35

```
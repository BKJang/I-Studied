# Factor_Of_R

## Factor

- ������ �ڷ��� ������ ����, ex)�а�, ��, ��...

```sh

# [����]

factor(x, levels = ����, labels = �̸� , ordered = T ������ ��ȯ) 
 

blood <- c("B", "AB", "O", "A", "O", "A") # ���� ����

blood # ���� �� ���

# "B"  "AB" "O"  "A"  "O"  "A" 

blood_factor <- factor(blood) # factor ���� ����

blood_factor # factor ���� �� ���

# B  AB O  A  O  A 
# Levels: A AB B O

levels(blood_factor) # ���� ���

# "A"  "AB" "B"  "O" 

nlevels(blood_factor) # ���� ���� ���

# 4

table(blood_factor) # blood_factor��� factor�� �������� ���� ������ ���̺� ���·� ���

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

# levels �ɼ��� ����ϸ� ������ ������ ������� �����ȴ�.

```

#### Rename factor levels

```sh

bf1 <- factor(blood, levels =  c("O", "A", "B", "AB")) # levels�� ���� ���� �ҷ���

bf1

# B  AB O  A  O  A 
# Levels: O A B AB

bf2 <- factor(blood, labels = c("BT_A", "BT_B", "BT_AB", "BT_O")) # labels�� ���� ���� �ƴ� label�� �ٿ���


bf2

# BT_AB BT_B  BT_O  BT_A  BT_O  BT_A 
# Levels: BT_A BT_B BT_AB BT_O

bf1 <- factor(blood, levels =  c("BT_A", "BT_B", "BT_AB", "BT_O"))

bf1

# <NA> <NA> <NA> <NA> <NA> <NA>
# Levels: BT_A BT_B BT_AB BT_O


# ���� blood�� ������ ("BT_A", "BT_B", "BT_AB", "BT_O") ������ ���� ������ <NA>�� ǥ��

```

#### Ordered factor

```sh

tshirt <- c("M", "L", "S", "S", "L", "M", "L", "M")

tshirt_factor <- factor(tshirt, ordered = TRUE, levels = c("S", "M", "L")) # ordered�� ���� TRUE�̸�, ���� ���� �� ���� ������� �迭

tshirt_factor

# M L S S L M L M
# Levels: S < M < L

tshirt_factor[1] < tshirt_factor[2]

# TRUE

```

- Excercise

```sh
job <- c(1, 3, 2, 4, 3, 2, 1, 4 , 2, 1, 1, 4, 4)

factor.name <- c("�л�", "���ػ�", "ȸ���", "���")

job.f <- factor(job, levels=c(1, 2, 3, 4), labels = factor.name)

job.f

# �л�   ȸ��� ���ػ� ���   ȸ��� ���ػ� �л� ���   ���ػ� �л�   �л�   ���   ���  
# Levels: �л� ���ػ� ȸ��� ���

job.f <- factor(job, ordered = T, levels=c(1, 2, 3, 4), labels = factor.name)

job.f

# �л�   ȸ��� ���ػ� ���   ȸ��� ���ػ� �л� ���   ���ػ� �л�   �л�   ���   ���  
# Levels: �л� < ���ػ� < ȸ��� < ���

table(job.f)

# job.f
#  �л� ���ػ� ȸ���   ��� 
#     4      3      2      4 

job.f[4] < job.f[1]

# FALSE

```
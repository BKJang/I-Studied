#-*- coding: utf-8 -*-
# while
i=1
while i<=10 :
    print(i, "번 출력!!")
    i += 1

"""
1 번 출력!!
2 번 출력!!
3 번 출력!!
4 번 출력!!
5 번 출력!!
6 번 출력!!
7 번 출력!!
8 번 출력!!
9 번 출력!!
10 번 출력!!
"""

# break
j=1
while j<=10 : 
    if j==5 :
        break
    print(j, "번 출력!!")
    j += 1
"""
1 번 출력!!
2 번 출력!!
3 번 출력!!
4 번 출력!!
"""

# continue
a=1
while a<=10:
    a += 1
    if a % 2 == 1 : continue
    print(a, "번 출력!!")
"""
2 번 출력!!
4 번 출력!!
6 번 출력!!
8 번 출력!!
10 번 출력!!
"""

# for : python에서 for문은 list를 기반으로 반복한다.
lst = [1, 2, 3, 4 ,5]
for i in lst :
    print(i)

"""
1
2
3
4
5
"""

lst2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
for i in lst2 :
    if i % 2 == 1 : continue
    if i == 6 : break
    print(i, "번 출력!!")

"""
2번 출력!!
4번 출력!!
"""

# range
for i in range(5) :
    print(i)
"""
0
1
2
3
4
"""
lst = [1, 2, 3, 4, 5]
for i in range(len(lst)) :
    if i % 2 == 0 :
        lst[i] *= 2
    else :
        lst[i] *= -2
    print(lst[i], end = " \n")

# 2 -4 6 -8 10

# Loop 중첩(구구단 출력)
# using while
i=2
while i<=9 :
    j=1
    while j<=9 :
        print(i, " * ", j, " = ", i*j)
        j += 1
    i += 1

# using for
for i in range(2, 10) :
    for j in range(1, 10) :
        print(i, " * ", j, " = ", i * j)

"""
2  *  1  =  2
2  *  2  =  4
2  *  3  =  6
...
9  *  7  =  63
9  *  8  =  72
9  *  9  =  81
"""
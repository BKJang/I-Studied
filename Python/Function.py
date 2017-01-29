#-*- coding: utf-8 -*-
def absolute(n) : #절대값을 출력해주는 function
    if n < 0 :
        n = -n
    return n
print(absolute(-1)) # 1
print(absolute(1)) # 1

def total(a, b) :  #합계를 출력해주는 function
    return a+b
print(total(1, 5)) # 6
print(total(2000, 2130)) # 4130

# 2개 이상의 값 반환
def div_remain(i, j) : # 몫 과 나머지를 출력하는 function
    return int(i / j), i % j
print(div_remain(100, 4))
print(div_remain(218, 3))

# Scoping rule : 이름을 검색하는 규칙은 지역, 전역, 내장 순서로 검색(LGB 규칙)
n = 10
def func() :
    global n
    n = n* 10
func()
print(n) # 100

#가변 인자 목록 : 인자의 개수가 정해지지 않은 가변 인자를 전달
def func(*varl):
    i = 1
    for i in varl :
        print(i, end = " ")
print(func(1, 2)) # 1, 2
print(func(4, 5, 6)) # 4, 5, 6
print(func(4)) # 4

#기본 인자 값 : 인자가 전달 되지 않으면 기본 반환 값을 따른다
def func(a, b=100) :
    return a * b
print(func(10)) # 1000
print(func(10, 200)) # 2000

"""
기본 값을 지정한 인자 뒤에 기본 값을 지정하지 않은 인자는 올 수 없다.
def mul(a=10, b) :
    return a * b

SyntaxError: non-default argument follows default argument
"""
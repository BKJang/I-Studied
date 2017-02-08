#-*- coding: utf-8 -*-

#tuple은 List와 다르게 요소의 변경이 불가능하다. 
#즉, 읽을 수는 있지만 쓸 수는 없는 것과 같다

tuple = (1, 2, 3, 4 ,5)
print(type(tuple)) # <class 'tuple'>

#tuple을 통한 변수 교환
a, b = 10, 20 
print(a, b) # 10 20
a, b = b, a
print(a, b) # 20 10

#In Java
# int a = 10, b = 20;
# a ^= b;
# b ^= a;
# a ^= b;

#Indexing and Slicing
tuples = (0, 1, 2, 3, 4, 5, 6)
print(tuples[1]) # 1
print(tuples[-2]) # 5

print(tuples[1:3])# (1, 2)
print(tuples[3:]) # (3, 4, 5, 6)

#Operators in Tuple
tuples2 = ('a', 'b', 'c')
print (tuples2) # ('a', 'b', 'c')

operator1 = tuples2 + ('d', 'e', 'f')
print (operator1) # ('a', 'b', 'c', 'd', 'e', 'f')

operator2 = tuples2 * 3
print(operator2) # ('a', 'b', 'c', 'a', 'b', 'c', 'a', 'b', 'c')
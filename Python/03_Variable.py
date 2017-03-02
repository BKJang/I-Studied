#-*- coding: utf-8 -*-

x=3
y=5
z=5

print(id(x), id(y), id(z), id(3), id(5))# 객체의 주소 값 반환
# 출력 : id(x)=id(3), id(y)=id(z)=id(5)

#type 함수 : 자료형 반환
print(type(33)) #class'int'
print(type(3.14)) #class'float'
print(type(['1', '2', '3'])) #class'list'
print(type(1322141342135)) #class'int'
print(type(3.4E-10)) #class'float'
print(type("Hello python")) #class'str'
#복소수(complex)
H=7-3j
print(type(H))#class 'complex'

#문자열(string)
print("안녕하세요 \n 저는 \t BkJANG입니다. \n \0") #\n:줄바꿈, \t:tab, \0:NULL 출력
print("\'파이썬은 \'")#\':단일 인용부호(') 출력
print("\"사랑\" 입니다\\'")#\" : 이중 인용부호("), \\:\ 출력
print("안녕" + " 바보야")
print("파이썬!!" *3)

#인뎃싱(Index)
var="파이썬  is Love"
print(var[0], var[5], var[6], var[1]) #인덱싱을 통해서 문자열의 변경은 안됨

#슬라이싱(Slicing)
print(var[0:5]) 
print(var[-5:-1])
print(var[2:])

temp="123456789"
print(temp[::3])
print(temp[::-1])
print(temp[::-2])

#Formatting
print("저는  %d 이며, JAVA, JSP, %s을 좋아합니다." %(25, 'Spring, 파이썬'))
#저는  25 이며, JAVA, JSP, Spring, 파이썬을 좋아합니다.
weight = 62.53
print("몸무게:", format(weight, '.1f')) # 몸무게: 62.5
print("돈:", format(123456789, ',d')) # 돈: 123,456,789
print('{} {}'.format('BK Jang', 25)) # BK Jang 25
print('{0} {1} {2}'.format(12, 34, 56)) # 12 34 56
print('{2} {2} {1} {0}'.format(12, 34, 56)) # 56 56 34 12
print('{} / {} = {:.2f}'.format(5, 2, 5 / 2)) # 5 / 2 = 2.50
print('{0} / {1} = {2:.4f}'.format(13, 3, 13 / 3)) # 13 / 3 = 4.3333

#문자열 메서(Method)
s="aBvdb"
print(s.upper()) #ABVDB
print(s.lower()) #abvdb

a="파이썬  ha hello"
print(a.find('hello')) # 8
print(a.find('파이썬')) # 0

s1="Hello Worhd"
print(s1.replace('h', 'l')) #Hello World

s2="H e l l o"
print(s2.split(" ")) #['H', 'e', 'l', 'l', 'o']
lst = s2.split(" ")
print(lst[3]) #l
print(lst[4]) #o
join1="--"
print(join1.join(lst)) #H--e--l--l--o

#-*- coding: utf-8 -*-

#Dictionary는 Tuple이나 List와는 다르게 Indexing이 되지 않는다.
dic = {'name':'Smith', 'rank':1, 'average':97.5}
print(type(dic)) # <class 'dict'>
print(dic) # {'average': 97.5, 'rank': 1, 'name': 'Smith'}

#키를 통해 값을 뽑아 올 수 있다.
print(dic['name']) # Smith
# print(dic[0]) => print(dic[0]) KeyError: 0 -> List처럼 위치를 통해 값을 불러오지 못한다.

dic = {'key1':'value1', 'key2':'value2'}
print(dic) # {'key2': 'value2', 'key1': 'value1'}
dic['key1'] = 'value3' #키를 통해 값 변경이 가능하다.
dic['key2'] = 'value4' 
print(dic) # {'key2': 'value2', 'key1': 'value1'}
del dic['key1'] # del함수를 이용하여 키 삭제
print(dic) # {'key2': 'value4'}

dic = {'name':'Bong', 'phone':'01131313131', 'age':25}
#keys()함수
print(dic.keys()) # dict_keys(['phone', 'age', 'name']) 

for i in dic.keys():
    print(i) # phone
             # age
             # name
            
#values()함수            
print(dic.values()) # dict_values(['01131313131', 'Bong', 25])

#items()함수 : 여러 개의 Tuple을 List로 돌려준다.
print(dic.items()) # dict_items([('age', 25), ('name', 'Bong'), ('phone', '01131313131')])

#clear()함수
print(dic) # {'age': 25, 'name': 'Bong', 'phone': '01131313131'}
dic.clear()
print(dic) # {}

#get함수 : 값을 반환하는 함수
dic = {'name':'Bong', 'phone':'01131313131', 'age':25}
print(dic.get('name')) # Bong
print(dic.get('phone')) # 01131313131

#in : Dictionary안에 키 존재 여부에 대해 True or False로 반환해준다.
print('name' in dic) # True
print('job' in dic ) # False
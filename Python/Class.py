#-*- coding: utf-8 -*-
class Student:
    name = "BKJang"
    def info(self):
        print("제 이름은 " + self.name + "입니다.")

inst = Student()
print(type(inst)) # <class '__main__.Student'>
print(inst.name) # BKJang
inst.info() # 제 이름은 BKJang입니다.

# Constructor
class Book:
    def __init__(self, BookName):
        self.name = BookName
        print("책의 이름은 " + BookName)
# Make Object
objectBook = Book("Python") # 책의 이름은 Python

class Student:
    def __init__(self, Name, age):
        self.name = Name
        self.age = age
    def aboutStd(self):
        print("학생의 이름은 " + self.name + "이고 나이는 " + str(self.age) + "입니다.")
# Make Object
objectStudent = Student('BKJang', 24)
objectStudent.aboutStd()
# 학생의 이름은 BKJang이고 나이는 24입니다.

# Destructor
class IceCream :
    def __init__(self, icecreamname, price):
        self.icecreamname = icecreamname
        self.price = price
        print("아이스크림 이름은 " + self.icecreamname + "이고 가격은 " + str(self.price) + "원 입니다.")
    def __del__(self): #Destructor 생성
        print(self.icecreamname + " 객체가 소멸합니다.")
# Make Object
objectIceCream = IceCream("초코나무숲", 2700) # 아이스크림 이름은 초코나무숲이고 가격은 2700원 입니다.
del objectIceCream # 초코나무숲 객체가 소멸합니다.
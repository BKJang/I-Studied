#-*- coding: utf-8 -*-
class Person:
    def __init__(self, name, age, gender):
        self.Name = name
        self.Age = age
        self.Gender = gender

    def aboutMe(self):
        print("저의 이름은 " + self.Name + "이구요, 제 나이는 " + self.Age + "살 입니다.")

class Employee(Person): # Person class를 상속
    def __init__(self, name, age, gender, salary, hiredate):
        Person.__init__(self, name, age, gender) # Person class's Constructor
        self.Salary = salary
        self.Hiredate = hiredate

    def aboutMe(self):
        Person.aboutMe(self)
        print("제 급여는 " + self.Salary + "원 이구요, 제 입사일은 " + self.Hiredate + " 입니다.")

objectEmployee = Employee("BKJang", "24", "남", "4500", "2012년 3월 2일")
objectEmployee.aboutMe()

"""
저의 이름은 BKJang이구요, 제 나이는 24살 입니다.
제 급여는 4500원 이구요, 제 입사일은 2012년 3월 2일 입니다.
"""

# Mutiple Inheritance
class ParentOne:
    def func(self):
        print("아버지!!")

class ParentTwo:
    def func(self):
        print("어머니!!")

class Child(ParentOne, ParentTwo):
    def childFunc(self):
        ParentOne.func(self)
        ParentTwo.func(self)

objectChild = Child() # 아버지!!
objectChild.childFunc() # 어머니!!
objectChild.func() # 아버지!!
# objectChild.func()에서 아버지!! 가 출력되는 이유는 상속받을 클래스의 이름을 나열할때 순서에 따라 이름을 찾기 때문.

# Diamond Mutiple Inheritance
class A:
    def __init__(self):
        print("A Constructor!")

class B(A): # A class 상속
    def __init__(self):
        print("B Constructor!")
        super().__init__()

class C(A): # A class 상속
    def __init__(self):
        print("C Constructor!")
        super().__init__()

class D(B, C): # B, C class 상속
    def __init__(self):
        print("D Constructor!")
        super().__init__()

objectD = D()
"""
D Constructor!
B Constructor!
C Constructor!
A Constructor!
"""
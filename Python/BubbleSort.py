#-*- coding: utf-8 -*-
def Bubble(Arr):#거품정렬 함수 정의
    for i in range(len(Arr)-1):
        for j in range(len(Arr)-(i+1)):
            if Arr[j]>Arr[j+1]:
                temp=Arr[j]
                Arr[j]=Arr[j+1];
                Arr[j+1]=temp;
   
            
x = [int(a) for a in input("정렬할 정수를 입력해주세요: \n").split()]
#input을 split / String 형식의 a를 int형으로 변환하여 배열에 저장

Bubble(x)
print(x)

#와 매우 짧네~!!
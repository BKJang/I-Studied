#-*- coding: utf-8 -*-

lst = [1, 2, 5, 'p', 'y']
print(lst) #[1, 2, 5, 'p', 'y']
print(type(lst)) #<class 'list'>

lst2 = ['a', 3.14, 5555, 'abcdf', ['a', 'b', 'c']]
print(lst2) #['a', 3.14, 5555, 'abcdf', ['a', 'b', 'c']]
print(type(lst2)) #<class 'list'>

print(lst2[4]) #['a', 'b', 'c']
print(lst2[4][2]) #c

#list 함수
#append 함수
school = ['elementary', 'middle', 'high']
school.append('university')
print(school) #['elementary', 'middle', 'high', 'university']

#insert 함수
abc = [1, 2, 4, 5, 6]
abc.insert(2, 3)
print(abc) #[1, 2, 3, 4, 5, 6]

#extend 함수
nums = [1, 2, 3, 4, 5, 6]
nums.extend([7, 8])
print(nums) #[1, 2, 3, 4, 5, 6, 7, 8]

#index 함수
lst3 = ['red', 'blue', 'green', 'yellow', 'white', 'black', 'blue']
print(lst3.index('blue')) #1번째 blue가 나오는 부분   
print(lst3.index('blue', 2)) #2번째 blue가 나오는 부분
print(lst3.index('yellow', 2, 4)) #위치 2, 4 사이에 있는 yellow를 출력

#count 함수
lst4 = [1, 1, 2, 3, 4, 5, 6, 6, 6, 7]
print(lst4.count(1)) #1의 개수
print(lst4.count(6)) #6의 개수

#pop 함수
lst5 = ['a', 'b', 'c', 'd', 'e']
print(lst5.pop()) # e 출력
print(lst5.pop(2)) # c 출력
print(lst5) #['a', 'b', 'd']

#remove 함수
love = [1, 2, 1, 3, 4, 1]
love.remove(1) # 가장 앞에 있는 1을 제거
print(love) #[2, 1, 3, 4, 1]

#sort 함수
c = [3, 5, 1, 2, 7]
c.sort()
print(c) #[1, 2, 3, 5, 7]

c.sort(reverse=True)
print(c) #[7, 5, 3, 2, 1]

#reverse 함수
pop = [1, 3, 5, 7, 9, 8]
pop.reverse()
print(pop) #[8, 9, 7, 5, 3, 1]
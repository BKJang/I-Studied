#-*- coding: utf-8 -*-
"""
Mode                    Description
r                    읽기 모드(default)
r+                    읽기 + 쓰기 모드
w                        쓰기 모드
a                   쓰기 + 이어쓰기 모드
t                   텍스트 모드(default)
b                       바이너리 모드
"""
f = open('t.txt', 'w')
print(f.write('abcdefgh')) # 8
f.close()

f = open('t.txt', 'r')
print(f.read()) # abcdefgh
f.close()

f = open('gugudan.txt', 'w')
for i in range(1, 10):
    data = "2 * %d = %d \n" % (i, 2 * i)
    f.write(data)
f.close()

f = open('gugudan.txt')
line = f.readline()
while line:
    print(line, end = '')
    line = f.readline()
f.close()
'''
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18
'''
f = open('hangul.txt', 'w')
print(f.write('가나다\n라마바\n사아자\n차카타\n파하')) # 18
f.close()

#seek, tell 함수
#tell() : 파일의 위치를 읽어냄
#seek() : 파일의 위치를 지정
f = open('hangul.txt', 'r')
print(f.tell()) # 0
print(f.read())
'''
가나다
라마바
사아자
차카타
파하
'''
print(f.tell()) # 36
print(f.seek(0))# 0
print(f.tell()) # 0
print(f.readline()) # 가나다 \n
print(f.tell()) # 8
f.close()

#-*- coding: utf-8 -*-

#Output
print(3.14) # 3.14
print("Hello, World!") # Hello, World!
t = 'variable'
print(t) # variable

print('Hello, ' 'World!') # Hello, World!
print('Hello, ' + 'World!') # Hello, World!
print('Hello,', 'World!') # Hello, World!
print('안녕하세요', '반갑습니다', sep='~', end='!') # 안녕하세요~반갑습니다!
print("")
print('%d*%d=%d' % (10, 20, 10*20)) # 10*20=200
print('%d/%d=%d' % (100, 30, 100/30)) # 100/30=3

#Input
inp = input('input: ')
print(inp) # input한 값
inp2 = input()
print(inp2) # input한 값
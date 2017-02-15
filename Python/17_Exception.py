#-*- coding: utf-8 -*-

# Example of Error
"""
2013 * (1229/0)
=> ZeroDivisionError: division by zero
open('notfind.txt', 'r')
=> FileNotFoundError: [Errno 2] No such file or directory: 'notfind.txt'
lst = [1, 2, 3, 4]
print(lst[5])
=> IndexError: list index out of range
"""

# try ~ except
try:
    b = 10 / 0
except ZeroDivisionError:
    print('제수는 0이 될 수 없습니다!')
'''
제수는 0이 될 수 없습니다!
'''

try:
    a = int(input("첫번째 숫자를 입력하세요: "))
    b = int(input("두번째 숫자를 입력하세요: "))
    print("a + b = ", a + b)
except ValueError:
    print('값이 적절하지 않습니다.')
'''
첫번째 숫자를 입력하세요: 1
두번째 숫자를 입력하세요: 영
값이 적절하지 않습니다.
'''

try:
    a = int(input("피제수를 입력하세요: "))
    b = int(input("제수를 입력하세요: "))
    print("a / b = ", a / b)
except (ValueError, ZeroDivisionError):
    print('제수가 0이거나 값이 적절하지 않습니다.')
'''
피제수를 입력하세요: 4
제수를 입력하세요: 영
제수가 0이거나 값이 적절하지 않습니다.
'''
"""
try:
    a = 50 / "이십"
except TypeError as e:
    print('예외 처리 결과 :', e.args[0]

=> 예외 처리 결과 : unsupported operand type(s) for /: 'int' and 'str'
"""

# else : 예외가 발생하지 않을 경우 실행
try:
    f = open('gugudan.txt', 'r')
except IOError:
    print('파일을 열지 못했습니다.')
else:
    print('gugudan.txt:\n', f.read())
    f.close()
'''
gugudan.txt:
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

# finally : 예외 발생 여부와 상관없이 무조건 실행
try:
    a = 10 / 0
except ZeroDivisionError:
    print('제수는 0이 될 수 없습니다!')
finally:
    print('무조건 실행되는 영역!')
'''
제수는 0이 될 수 없습니다!
무조건 실행되는 영역!
'''

# raise :  의도적으로 개발자가 예외를 발생시켜야 할 경우 raise 구문을 통하여 해당하는 예외를 강제로 발생
try:
    a = int(input('피제수를 입력하세요: '))
    b = int(input('제수를 입력하세요: '))
    if a <= 0 or b <= 0:
        raise ArithmeticError('피제수 혹은 제수가 0 이하일 수 없습니다.')
except ArithmeticError as e:
    print('예외 발생:', e.args[0])
'''
피제수를 입력하세요: 2
제수를 입력하세요: 0
예외 발생: 피제수 혹은 제수가 0 이하일 수 없습니다.
'''

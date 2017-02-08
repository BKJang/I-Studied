#-*- coding: utf-8 -*-
#Module : 변수, 클래스, 함수 등과 같은 여러 코드를 한곳에 모아놓은 코드의 모음
import math
print(dir(math))
# ['__doc__', '__loader__', '__name__', '__package__', '__spec__', 'acos', 'acosh', 'asin', 'asinh', 'atan', 'atan2', 'atanh', 'ceil', 'copysign', 'cos', 'cosh', 'degrees', 'e', 'erf', 'erfc', 'exp', 'expm1', 'fabs', 'factorial', 'floor', 'fmod', 'frexp', 'fsum', 'gamma', 'gcd', 'hypot', 'inf', 'isclose', 'isfinite', 'isinf', 'isnan', 'ldexp', 'lgamma', 'log', 'log10', 'log1p', 'log2', 'modf', 'nan', 'pi', 'pow', 'radians', 'sin', 'sinh', 'sqrt', 'tan', 'tanh', 'trunc']
print(math.sin(45)) # 0.8509035245341184
print(math.pow(2, 10)) # 1024.0
print(math.pi) # 3.141592653589793

'''
<Moudule that I made>
def plus(a, b):
    return a + b
def minus(a, b):
    return a - b
def div(a, b):
    return a / b
def mul(a, b):
    return a * b
'''
import arithmetic
print(dir(arithmetic)) # ['__builtins__', '__cached__', '__doc__', '__file__', '__loader__', '__name__', '__package__', '__spec__', 'div', 'minus', 'mul', 'plus']
print(arithmetic.plus(1, 2)) # 3
print(arithmetic.mul(300, 400)) # 120000

from arithmetic import plus
print(plus(100, 200)) # 300
print(plus(30, 40000)) # 40030

from arithmetic import*
print(plus(200, 300)) # 500
print(minus(40 ,20)) # 20
print(mul(40, 1000)) # 40000
print(div(500, 2)) # 250.0

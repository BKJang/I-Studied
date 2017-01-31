#-*- coding: utf-8 -*-
"""
메서드(Method)         연산자(Operator)        사용 예
__add__(self, other)     + (이항)           A + B, A += B
__pos__(self)            + (단항)               +A
__sub__(self, other)     - (이항)           A - B, A -= B
__neg__(self)	         - (단항)	            -A
__mul__(self, other)         *              A * B, A *= B
__truediv__(self, other)     /              A / B, A /= B
__floordiv__(self, other)   //              A // B, A //= B
__mod__(self, other)         %              A % B, A %= B
__pow__(self, other)     pow(), **        pow(A, B), A ** B
__lshift__(self, other)     <<              A << B, A <<= B
__rshift__(self, other)     >>              A >> B, A >>= B
__and__(self, other)        &               A & B, A &= B
__xor__(self, other)        ^               A ^ B, A ^= B
__or__(self, other)         |               A | B, A |= B
__invert__(self)            ~                      ~A
__abs__(self)             abs()                 abs(A)
"""

class NumBox:
    def __init__(self, num):
        self.Num = num

    def __add__(self, num):
        self.Num += num

    def __sub__(self, num):
        self.Num -= num

n = NumBox(40)
n + 100
print(n.Num) # 140
n - 110
print(n.Num) # 30
'''
110 + n : 객체가 오른쪽으로 이동하면 __add__ 함수가 호출되는게 아니라 __radd__ 함수가 호출되기 때문
따라서 radd 함수도 같이 정의를 해줘야 한다.

Traceback (most recent call last):
  File "D:/PyCharm/Operator Overloading.py", line 37, in <module>
    110 + n
TypeError: unsupported operand type(s) for +: 'int' and 'NumBox'
'''
'''
__add__ = __radd__
__sub__ = __rsub__
__mul__ = __rmul__
'''
# radd 함수 정의
class NumBox:
    def __init__(self, num):
        self.Num = num

    def __add__(self, num):
        self.Num += num

    def __radd__(self, num):
        self.Num += num

n = NumBox(100)
120 + n
print(n.Num) # 220
300 + n
print(n.Num) # 520
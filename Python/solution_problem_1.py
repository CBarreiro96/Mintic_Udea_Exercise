#!/usr/bin/python3
from vector import Vector
from random import randint

"""
Solution exercise MINTIC UDEA
"""


def solution():
    # Varaibles
    a = randint(15, 30)
    v = Vector(a)
    s = 0

    for i in range(1, a + 1):
        v.V[i] = randint(1, 9999)

        # Counter
        v.V[0] += 1

        if is_primo(v.V[i]) or start_odd_digit(v.V[i]):
            s += v.V[i]

    return v, s


def is_primo(n):
    for d in range(2, n):
        if n % d == 0:
            return False
    return True


def start_odd_digit(n):
    d = str(n)[0]
    d = int(d)

    if d % 2 == 1:
        return True

    return False


def printVector(Vector, message="Vector without name: \t"):
    print("\n", message, end=" ")
    for i in range(1, Vector.V[0] + 1):
        if i % 30 == 0:
            print("\n ", end="")
        elif i % Vector.V[0] == 0:
            print(Vector.V[i], end="")
        else:
            print(Vector.V[i], end=", ")


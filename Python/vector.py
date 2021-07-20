#!/usr/bin/python3

import random

"""
Vector class
"""


class Vector:

    def __init__(self, n):
        """Constructor method"""
        self.n = n
        self.V = [0] * (n + 1)

    def builtVector(self, m, r):
        self.V[0] = m
        for i in range(1, m + 1):
            self.V[i] = random.randint(1, r)

    def printVector(self, message="Vector without name:\t"):
        print("\n", message, end="")
        for i in range(1, self.V[0] + 1):
            print(self.V[i], end=",")
        print()

    def addVector(self, d):
        if self.isFull():
            return
        self.V[0] = self.V[0] + 1
        self.V[self.V[0]] = d

    def allocateData(self, d, i):
        self.V[i] = d

    def returnData(self, i):
        return self.V[i]

    def exchange(self, a, b):
        aux = self.V[a]
        self.V[a] = self.V[b]
        self.V[b] = aux

    def selection(self):
        for i in range(1, self.V[0]):
            k = i
            for j in range(i + 1, self.V[0] + 1):
                if self.V[j] < self.V[k]:
                    k = j
            self.exchange(k, i)

    def Biggest(self):
        biggest = 1
        for i in range(1, self.V[0] + 1):
            if self.V[i] > self.V[biggest]:
                biggest = i
        return biggest

    def small(self):
        small = 1
        for i in range(1, self.V[0] + 1):
            if self.V[i] < self.V[small]:
                small = i
        return small

    def searchData(self, d):
        i = 1

        while i <= self.V[0] and self.V[i] != d:
            i = i + 1
        if i<= self.V[0]:
            return i
        return -1

    def eraserDatainPosition(self, i):
        if i <= 0 or i > self.V[0]:
            print("\nParámetro i inválido")
            return
        for j in range(i, self.V[0]):
            self.V[j] = self.V[j + 1]
        self.V[0] = self.V[0] - 1

    def eraserData(self, d):
        i = self.searchData(d)
        if i!= -1:
            self.eraserDatainPosition(i)

    def usedPosition(self):
        return self.V[0]

    def isEmpty(self):
        return self.V[0] == 0

    def isFull(self):
        return self.V[0] == self.n

    def tamagno(self):
        return self.n

    def allocateElementNumber(self, m):
        self.V[0] = m

    def searchWhereInsert(self, d):
        i = 1
        while i <= self.V[0] and self.V[i] < d:
            i = i + 1
        return i

    def insert(self, d, i=0):
        if self.isFull():
            print("\nFull vector, It can't be inserted")
            return
        if i == 0:
            i=self.searchWhereInsert(d)
        for j in range(self.V[0], i-1,-1):
            self.V[j+1] = self.V[j]
        self.V[i] = d
        self.V[0] = self.V[0] + 1

    def sumData(self):
        s = 0
        for i in range(1,self.V[0] + 1):
            s = s + self.V[i]
        return s

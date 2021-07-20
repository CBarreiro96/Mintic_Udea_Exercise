#!/usr/bin/python3
"""
================================== Game Triqui =================================================
**** Information
- \t ------> Tabulator
- \n ------> Sapce
"""


class Triqui:
    """
    Implement class triqui
    """

    def __init__(self, m, n):
        self.m = m
        self.n = n
        self.mat = [] * (m + 1) # Create empty vector
        for i in range(m+1):
            a = [0] * (n+1)
            self.mat.append(a)


    def printRowMatrix(self, message="Matrix whithout name:"):
        print("\n", message)
        for i in range(1, self.m + 1):
            for j in range(1, self.n + 1):
                print(self.mat[i][j], "\t", end="")
            print()

    def play(self, row, column, piece):
        # If the position is zero, you can game
        if self.mat[row][column] == 0:
            self.mat[row][column] = piece
        else:
            print("square occupied")

    def evaluate_RowTriqui(self, piece):
        for i in range(1, self.m + 1):
            if self.mat[i][1] == piece and self.mat[i][2] == piece and self.mat[i][3] == piece:
                return "triqui en " + piece
            elif i == self.m:
                return "No hay triqui"

    def evaluate_ColumnTriqui(self, piece):
        for i in range(1, self.m + 1):
            if self.mat[1][i] == piece and self.mat[2][i] == piece and self.mat[3][i] == piece:
                return "triqui en " + piece
            elif i == self.m:
                return "No hay triqui"

    def evaluate_DiagonalsTriqui(self, piece):
        for i in range(1, self.m + 1):
            if self.mat[1][i+((i-1)*3)] == piece and self.mat[2][i] == piece and self.mat[3][i**(i+1)] == piece:
                return "triqui en " + piece
            elif i == self.m:
                return "No hay triqui"


triqui=Triqui(3, 3)
triqui.printRowMatrix("Triqui")

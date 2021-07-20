
from vector import Vector

import random

n = int(input("Entre tamaño del vector: "))
vec = Vector(n)
vec.V[0] = n // 2
for i in range(1, n // 2 + 1):
    vec.V[i] = random.randint(1, 100)
vec.printVector("Vector de prueba creado\n")
vec.addVector(13)
vec.printVector("Vector con dato agregado\n")
vec.selection()
vec.printVector("Vector ordenado ascendentemente\n")
vec.searchWhereInsert(39)
vec.insert(39, i)
vec.printVector("Vector con dato 39 insertado\n")
vec.insert(44)
vec.printVector("Vector con dato 44 insertado\n")
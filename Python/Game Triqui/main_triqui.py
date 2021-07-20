from triqui import Triqui

triqui = Triqui(3,3)
triqui.play(1,1,"X")
triqui.play(2,1,"A")
triqui.play(2,2,"A")
triqui.play(2,3,"A")
triqui.printRowMatrix("Triqui")
print(triqui.evaluate_RowTriqui("A"))
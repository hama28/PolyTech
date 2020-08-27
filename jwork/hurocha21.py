import random

l = list()
for i in range(1,101):
    l.append(random.randint(1, 1000))
print("配列の作成（1~1000のランダムな数値が100個）")
print(l)
print(" ")

l_min = sorted(l)
print("小さい順（重複あり）")
print(l_min)
print(" ")

l_set = list(set(l_min))
l_set = sorted(l_set)
print("小さい順（重複なし）")
print(l_set)
print(" ")

l_max = sorted(l_set, reverse=True)
print("重複なしの大きい順")
print(l_max)
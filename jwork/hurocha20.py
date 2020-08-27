tensu = [
    [0,0,0],
    [0,0,0],
    [0,0,0],
    [0,0,0],
    [0,0,0],
    [0,0,0],
    [0,0,0],
    [0,0,0],
    [0,0,0],
    [0,0,0]
]

for i in range(0,10):
    print("{}人目の点数".format(i+1))
    tensu[i] = int(input("国語の点数を入力：")), int(input("英語の点数を入力：")), int(input("数学の点数を入力："))


kokugo = [0,0,0,0,0,0,0,0,0,0]
eigo = [0,0,0,0,0,0,0,0,0,0]
sugaku = [0,0,0,0,0,0,0,0,0,0]

for i in range(0,10):
    kokugo[i] = tensu[i][0]
    eigo[i] = tensu[i][1]
    sugaku[i] = tensu[i][2]

kokugo_ave = sum(kokugo) / len(kokugo)
eigo_ave = sum(eigo) / len(eigo)
sugaku_ave = sum(sugaku) / len(sugaku)

print("国語の合計点は", sum(kokugo))
print("国語の平均点は", kokugo_ave)
print("英語の合計点は", sum(eigo))
print("英語の平均点は", eigo_ave)
print("数学の合計点は", sum(sugaku))
print("数学の平均点は", sugaku_ave)

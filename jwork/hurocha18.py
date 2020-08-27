# n_list = list(range(1, 51))
# print(len(n_list))

n_list = [100,58,41,32,1,9,65,12,7,99,36,81,24,44]

n = int(input("数値："))

l_over = [i for i in n_list if i >= n]
for i in range(0, len(l_over)):
    print(l_over[i], "", end='')

print("")

l_under = [i for i in n_list if i < n]
for i in range(0, len(l_under)):
    print(l_under[i], "", end='')
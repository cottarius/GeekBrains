a, b = (int(i) for i in input().split())
summa = 0
if a % 2 == 0:
    a += 1
for i in range(a, b + 1, 2):
    sum += i
print(summa)

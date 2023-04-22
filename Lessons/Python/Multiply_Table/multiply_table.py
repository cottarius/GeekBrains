"""
Напишите программу, на вход которой даются четыре числа a, b, c и d, каждое в своей строке. Программа должна вывести
фрагмент таблицы умножения для всех чисел отрезка [a;b] на все числа отрезка [c;d].
"""
a = int(input("Введите число a: "))
b = int(input("Введите число b: "))
c = int(input("Введите число c: "))
d = int(input("Введите число d: "))

for j in range(c, d + 1):
    print('\t' + str(j), end='')
print()
for i in range(a, b + 1):
    print(i, end='\t')
    for j in range(c, d + 1):
        print(i * j, end='\t')
    print()

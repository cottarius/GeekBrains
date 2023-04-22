# Требуется вывести все целые степени двойки (т.е. числа вида 2 в степени k), не превосходящие числа N.

number = int(input("Введите целое натуральное число: "))
power = 0
result = 1
while result < number:
    result = 2 ** power
    if result < number:
        print(result, end = " ")
    power += 1


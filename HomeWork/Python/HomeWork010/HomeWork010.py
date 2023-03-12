# На столе лежат n монеток. Некоторые из них лежат вверх решкой, а некоторые – гербом. Определите минимальное число
# монеток, которые нужно перевернуть, чтобы все монетки были повернуты вверх одной и той же стороной. Выведите
# минимальное количество монет, которые нужно перевернуть.
from random import randint

n = int(input("Введите число монеток: "))
numbers = []
digitOne = 0
digitZero = 0

for i in range(n):
    numbers.append(randint(0, 1))

print(numbers)

for i in range(len(numbers)):
    if numbers[i] == 1:
        digitOne += 1
    elif numbers[i] == 0:
        digitZero += 1
    else:
        print("Что-то пошло не так...")

if digitOne > digitZero:
    print(digitZero)
else:
    print(digitOne)



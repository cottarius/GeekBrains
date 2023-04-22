# На столе лежат n монеток. Некоторые из них лежат вверх решкой, а некоторые – гербом. Определите минимальное число
# монеток, которые нужно перевернуть, чтобы все монетки были повернуты вверх одной и той же стороной. Выведите
# минимальное количество монет, которые нужно перевернуть.
from random import randint

input_number = int(input("Введите число монеток: "))
numbers = []
coin_heads = 0
coin_tails = 0

for i in range(input_number):
    numbers.append(randint(0, 1))

print(numbers)

for i in range(len(numbers)):
    if numbers[i] == 1:
        coin_heads += 1
    elif numbers[i] == 0:
        coin_tails += 1
    else:
        print("Что-то пошло не так...")

if coin_heads > coin_tails:
    print(coin_tails)
else:
    print(coin_heads)



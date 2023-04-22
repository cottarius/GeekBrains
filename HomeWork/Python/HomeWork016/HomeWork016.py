from random import randint
""""
Требуется вычислить, сколько раз встречается некоторое число X в массиве A[1..N]. Пользователь в первой строке вводит
натуральное число N – количество элементов в массиве. В последующих  строках записаны N целых чисел Ai. Последняя
строка содержит число X
"""


def create_array(length):
    numbers = [randint(0, 10) for i in range(length)]
    return numbers


def count_elements(arr, numb):
    count = 0
    for i in range(len(arr)):
        if arr[i] == numb:
            count += 1
    return count


numbers_length = int(input('Введите размер массива: '))
array = create_array(numbers_length)
print(array)
number = int(input('Введите искомое число: '))
cnt = count_elements(array, number)
print(f" Число {number} повторяется {cnt} раза")


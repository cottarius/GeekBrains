""""
Требуется найти в массиве A[1..N] самый близкий по величине элемент к заданному числу X. Пользователь в первой строке
вводит натуральное число N – количество элементов в массиве. В последующих  строках записаны N целых чисел Ai.
Последняя строка содержит число X
"""
from random import randint


def create_array(array_length):
    numbers = [randint(0, 20) for i in range(array_length)]
    return numbers


def find_nearby(array, n):
    index = 0
    minimal = abs(n - array[0])
    for i in range(1, len(array)):
        count = abs(n - array[i])
        if count < minimal:
            minimal = count
            index = i
    return array[index]


length = int(input("Введите размер массива: "))
arr = create_array(length)
print(arr)
element = int(input("Введите число для поиска ближайщего к нему элемента массива: "))
nearby = find_nearby(arr, element)
print(f"Самый близкий по величине элемент к заданному числу {element} - {nearby}")

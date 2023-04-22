"""
Даны два неупорядоченных набора целых чисел (может быть, с повторениями). Выдать без повторений в порядке возрастания
все те числа, которые встречаются в обоих наборах.
"""


def list_input(length):
    some_list = set()
    for i in range(length):
        some_list.add(int(input("Введите элемент: ")))
    return some_list


length_1 = int(input("Введите количество элементов первого списка: "))
list_1 = list_input(length_1)
length_2 = int(input("Введите количество элементов второго списка: "))
list_2 = list_input(length_2)

final_list = sorted(list_1.intersection(list_2))
print(final_list)

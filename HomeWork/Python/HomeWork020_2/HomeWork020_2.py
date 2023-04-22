"""
Напишите программу, которая принимает на вход две строки и определяет, являются ли они анаграммами. Знаки препинания,
пробелы и регистр при этом игнорируются
"""


def is_anagramma(string1, string2):
    punctuations = '., "!?:;'
    string1 = string1.lower()
    for p in punctuations:
        string1 = string1.replace(p, '')
    string2 = string2.lower()
    for p in punctuations:
        string2 = string2.replace(p, '')
    return sorted(string1) == sorted(string2)


str1 = input('Введите первую строку: ')
str2 = input('Введите вторую строку: ')
print('YES' if is_anagramma(str1, str2) else 'NO')

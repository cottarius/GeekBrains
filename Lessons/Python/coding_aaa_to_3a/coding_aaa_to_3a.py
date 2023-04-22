"""
'aaaabbсaa' преобразуется в 'a4b2с1a2', то есть группы одинаковых символов исходной строки заменяются на этот
символ и количество его повторений в этой позиции строки.
"""
str_1 = input()
count = 1
for i in range(len(str_1) - 1):

   if str_1[i] == str_1[i + 1]:
       count += 1
   elif str_1[i] != str_1[i + 1]:
       print(str_1[i] + str(count), end='')
       count = 1

print(str_1[-1] + str(count), end='')

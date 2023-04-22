"""
Пользователь вводит текст(строка). Словом считается последовательность непробельных символов идущих подряд, слова
разделены одним или большим числом пробелов. Определите, сколько различных слов содержится в этом тексте
"""

string_1 = "She sells sea shells on the sea shore The shells that she sells are sea shells I'm sure.So if she sells " \
           "sea shells on the sea shore I'm sure that the shells are sea shore shells"

string_1 = string_1.lower().split(' ')
string_1 = set(string_1)
print(len(string_1))

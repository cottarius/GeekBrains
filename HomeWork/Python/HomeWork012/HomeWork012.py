#  Петя и Катя – брат и сестра. Петя – студент, а Катя – школьница. Петя помогает Кате по математике. Он задумывает
#  два натуральных числа X и Y (X,Y≤1000), а Катя должна их отгадать. Для этого Петя делает две подсказки. Он
#  называет сумму этих чисел S и их произведение P.

sum_of_numbers = int(input("Введите сумму двух чисел: "))
mult_of_numbers = int(input("Введите произведение двух чисел: "))
limit = 1000
flag = True
for i in range(limit):
    for j in range(limit):
        if i * j == mult_of_numbers and i + j == sum_of_numbers:
            print(f"Первое число: {i}, второе число: {j}")
            flag = False
            break
    if not flag:
        break

if flag:
    print("Таких пар чисел нет")



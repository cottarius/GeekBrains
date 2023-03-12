# Найдите сумму цифр трехзначного числа.

def intNumber():
    while True:
        number = input("Введите число: ")
        if number.isdigit():
            return number


number = int(intNumber())
result = 0
temp = 0
while number > 0:
    temp = number % 10
    result += int(temp)
    number /= 10

print(f"Сумма цифр в числе равна {result}")


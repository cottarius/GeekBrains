# Петя, Катя и Сережа делают из бумаги журавликов. Вместе они сделали S журавликов. Сколько журавликов сделал каждый
# ребенок, если известно, что Петя и Сережа сделали одинаковое количество журавликов, а Катя сделала в два раза больше
# журавликов, чем Петя и Сережа вместе?

def inputNumber():
    while True:
        number = input("Введите число: ")
        if number.isdigit():
            return number


result = int(inputNumber())

firstChild = result//6
secondChild = firstChild
thirdChild = (secondChild + firstChild) * 2

print(f"Петя сделал {int(firstChild)}, Серёжа сделал {int(secondChild)}, Маша сделала {int(thirdChild)}")


# Счастливым билетом называют такой билет с шестизначным номером, где сумма первых трех цифр равна сумме последних трех.
# Т.е. билет с номером 385916 – счастливый, т.к. 3+8+5=9+1+6. Вам требуется написать программу, которая проверяет
# счастливость билета.

inputNumber = input("Введите шестизначное число: ")
if len(inputNumber) == 6:
    length = len(inputNumber)
    halfLength = len(inputNumber)//2
    sumOfFirstHalf = 0
    sumOfSecondHalf = 0
    while halfLength > 0:
        sumOfFirstHalf += int(inputNumber[halfLength - 1])
        halfLength -= 1
        sumOfSecondHalf += int(inputNumber[length - 1])
        length -= 1

    print("Yes" if sumOfFirstHalf == sumOfSecondHalf else "No")

else:
    print("Вы ввели не шестизначное число!")



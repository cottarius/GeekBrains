//С функцией
string Max(int a, int b) => (a > b) ? $"max = {a}, min = {b}" : $"max = {b}, min = {a}"; 

int number, number2;
System.Console.Write("Введите первое число: ");
while(!Int32.TryParse(Console.ReadLine(), out number))
{
    Console.Write("Ошибка!! Вы вводите не цифру!! Повторите ещё раз: ");
}
System.Console.Write("Введите второе число: ");
while(!Int32.TryParse(Console.ReadLine(), out number2))
{
    Console.Write("Ошибка!! Вы вводите не цифру!! Повторите ещё раз: ");
}
System.Console.WriteLine(Max(number, number2));

System.Console.WriteLine();

//Без функции
int numberA, numberB;
System.Console.Write("Введите первое число: ");
while(!Int32.TryParse(Console.ReadLine(), out numberA))
{
    Console.Write("Ошибка!! Вы вводите не цифру!! Повторите ещё раз: ");
}
System.Console.Write("Введите второе число: ");
while(!Int32.TryParse(Console.ReadLine(), out numberB))
{
    Console.Write("Ошибка!! Вы вводите не цифру!! Повторите ещё раз: ");
}
if(numberA > numberB)
{
    System.Console.WriteLine($"max = {numberA}");
    System.Console.WriteLine($"min = {numberB}");
}
else if(numberB > numberA)
{
    System.Console.WriteLine($"max = {numberB}");
    System.Console.WriteLine($"min = {numberA}");
}
else
{
    System.Console.WriteLine("Числа равны");
}

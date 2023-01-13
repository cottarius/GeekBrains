//самый лаконичный вариант
/*string MaxAndMin(int a, int b) => (a > b) ? $"max = {a}" : $"max = {b}"; 

System.Console.Write("Введите первое число: ");
int numberA = Convert.ToInt32(Console.ReadLine());
System.Console.Write("Введите второе число: ");
int numberB = Convert.ToInt32(Console.ReadLine());
System.Console.WriteLine(MaxAndMin(numberA, numberB));

System.Console.WriteLine();
*/
//простой вариант
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
}
else if(numberB > numberA)
{
    System.Console.WriteLine($"max = {numberB}");
}
else
{
    System.Console.WriteLine("Числа равны");
}
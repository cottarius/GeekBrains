//С функцией
int MaxNumber(List<int> list) => list.Max();

List<int> list = new List<int>();

Console.Write("Введите первое число: ");
list.Add(Convert.ToInt32(Console.ReadLine()));
Console.Write("Введите второе число: ");
list.Add(Convert.ToInt32(Console.ReadLine()));
Console.Write("Введите третье число: ");
list.Add(Convert.ToInt32(Console.ReadLine()));

Console.WriteLine(MaxNumber(list));

//Без функции
Console.Write("Введите первое число: ");
int numberA = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите второе число: ");
int numberB = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите третье число: ");
int numberC = Convert.ToInt32(Console.ReadLine());
int max = numberA;

if(numberB > max)
{
    max = numberB;
}
if(numberC > max)
{
    max = numberC;
}
System.Console.WriteLine(max);
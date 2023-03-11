//С функцией:
string Even(int numb) => (numb % 2 == 0) ? "Чётное" : "Нечётное";

int number;
System.Console.Write("Введите целое число: ");
while(!Int32.TryParse(Console.ReadLine(), out number))
{
    System.Console.Write("Некорректный ввод! Введите целое число: ");
}
System.Console.WriteLine(Even(number));

System.Console.WriteLine();

//Без функции:
int numb;
System.Console.Write("Введите целое число: ");
while(!Int32.TryParse(Console.ReadLine(), out numb))
{
    System.Console.Write("Некорректный ввод! Введите целое число: ");
}
if(numb % 2 == 0)
{
    System.Console.WriteLine("Чётное");
}
else
{
    System.Console.WriteLine("Нечётное");
}

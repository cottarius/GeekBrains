void FindThirdDigit(int number)
{    
    int result;
    number = Math.Abs(number);
    if (number > 99)
    {
        while (number > 999)
        {
            number /= 10;
        }
        result = number % 10;
        System.Console.WriteLine($"Третья цифра в числе: {result}");
    }
    else
    {
        System.Console.WriteLine("Третьей цифры нет");
    }
}

int number;
System.Console.Write("Введите любое целое число: ");
    while (!int.TryParse(Console.ReadLine(), out number))
    {
        System.Console.Write("Умоляю! Пожалуйста, введите челое число: ");
    }

FindThirdDigit(number);



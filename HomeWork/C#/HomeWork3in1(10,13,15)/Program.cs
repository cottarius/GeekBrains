internal class Program
{
    static int stateMenu;
    private static void Main(string[] args)
    {
        Console.Clear();
        Menu();
        while (stateMenu != 0)
        {
            switch (stateMenu)
            {
                case 1: 
                {
                    Console.Clear();
                    System.Console.WriteLine("На вход принимается трёхзначное число и показывается вторая цифра этого числа");
                    double number;
                    System.Console.Write("Введите трёхзначное число: ");
                    while(!double.TryParse(Console.ReadLine(), out number))
                    {
                        System.Console.Write("Неправильный ввод данных! Введите число: ");
                    }
                    number = Math.Abs(number);
                    if(((int)number / 100 > 0) && ((int)number / 1000 == 0))
                    {
                        FindSecondDigit(number);
                    }
                    else
                    {
                        System.Console.WriteLine("Не верный ввод числа!");
                        System.Console.WriteLine("Нажмите любую клавишу...");
                        Console.ReadKey();
                        Menu();
                        break;
                    }
                }
                System.Console.WriteLine();
                System.Console.WriteLine("Нажмите любую клавишу...");
                Console.ReadKey();                
                Menu();
                break;

                case 2:
                {                    
                    Console.Clear();
                    System.Console.WriteLine("Необходимо вывести третью цифру заданного числа или сообщить, что третьей цифры нет.");
                    double number;
                    System.Console.Write("Введите любое число: ");
                    while(!double.TryParse(Console.ReadLine(), out number))
                    {
                        System.Console.Write("Неправильный ввод данных! Введите число: ");
                    }
                    FindThirdDigit(number);                    
                }
                System.Console.WriteLine();
                System.Console.WriteLine("Нажмите любую клавишу...");
                Console.ReadKey();                
                Menu();
                break;

                case 3:
                {
                    Console.Clear();
                    System.Console.WriteLine("Проверка на выходной день.");
                    System.Console.Write("Введите номер дня недели: ");
                    int number;
                    while(!int.TryParse(Console.ReadLine(), out number))
                    {
                        System.Console.Write("Неправильный ввод данных! Введите число: ");
                    }
                    IfHolliday(number);
                }
                System.Console.WriteLine();
                System.Console.WriteLine("Нажмите любую клавишу...");
                Console.ReadKey();                
                Menu();
                break;    

                default:
                {
                    System.Console.Write("Выбран неверный пункт меню! Повторите попытку!");
                }
                System.Console.WriteLine();
                System.Console.WriteLine("Нажмите любую клавишу...");
                Console.ReadKey();                
                Menu();
                break;                        
            }
            
        }
    }
    static void Menu()
    {
        Console.Clear();
        System.Console.WriteLine("*****Список домашних заданий*****");
        System.Console.WriteLine("---------------------------------");
        System.Console.WriteLine("1. Домашнее задание 10");
        System.Console.WriteLine("2. Домашнее задание 13");
        System.Console.WriteLine("3. Домашнее задание 15");
        System.Console.WriteLine("0. Выход из программы");
        System.Console.WriteLine();
        System.Console.Write("Выберите пункт меню: ");
        while (!int.TryParse(Console.ReadLine(), out stateMenu))
        {
            System.Console.Write("Некорректно введён пункт выбора! Попробуйте еще раз: ");
        }
    }
    static void FindThirdDigit(double number)
    {
        int result;
        number = Math.Abs(number);
        if (number > 99)
        {
            while (number > 999)
            {
                number /= 10;
            }
            result = (int)number % 10;
            System.Console.WriteLine($"Третья цифра в числе: {result}");
        }
        else
        {
            System.Console.WriteLine("Третьей цифры нет");
        }
    }
    static void FindSecondDigit(double number)
    {
        int result;
        //Math.Abs(number);
        if(number > 99 && number < 1000)
        {
            number = (int)number / 10;
            result = (int)number % 10;
            System.Console.WriteLine($"Вторая цифра трёхзначного числа: {result}");
        }
        else 
        {
            System.Console.WriteLine("Число не трёхзначное!!");
        }
    }
    static void IfHolliday(int dayNumber)
    {
        if(dayNumber >= 1 && dayNumber <= 5) 
        {
            System.Console.WriteLine("Будний день");
        }
        else if(dayNumber >= 6 && dayNumber <= 7)
        {
            System.Console.WriteLine("Выходной день");
        }
        else
        {
            System.Console.WriteLine("Нет такого дня недели!");
        }
    }
}
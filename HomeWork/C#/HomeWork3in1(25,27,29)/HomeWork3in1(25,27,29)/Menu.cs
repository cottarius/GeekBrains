using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HomeWork3in1_25_27_29_
{
    class Menu
    {
        int stateMenu;
        ConvertToArray convertToArray = new ConvertToArray();
        SumOfDigits sumOfDigits = new SumOfDigits();
        Power power = new Power();
        public Menu() { }

        public void Run()
        {
            Console.Clear();
            Console.WriteLine("******Меню******");
            Console.WriteLine("1. Возведение числа А в степень В");
            Console.WriteLine("2. Сума цифр в числе");
            Console.WriteLine("3. Создание массива из N элементов");
            Console.WriteLine("0. Выход");
            Console.Write("Выберите пункт меню: ");
            while (!int.TryParse(Console.ReadLine(), out stateMenu) || !(stateMenu >= 0 && stateMenu <= 3))
            {
                Console.Write("Хватит косячить! Введите целое число от 0 до 3: ");
            }

            while (stateMenu != 0)
            {
                switch (stateMenu)
                {
                    case 1:
                        {
                            Console.Clear();
                            power.Exponantion();
                            power.PrintResult();
                        }
                        Console.WriteLine("Нажмите любую клавишу...");
                        Console.ReadKey();
                        Console.Clear();
                        Run();
                        break;

                    case 2:
                        {
                            Console.Clear();
                            sumOfDigits.CalculateSum();
                            sumOfDigits.PrintSumOfDigits();
                        }
                        Console.WriteLine("Нажмите любую клавишу...");
                        Console.ReadKey();
                        Console.Clear();
                        Run();
                        break;

                    case 3:
                        {
                            Console.Clear();
                            convertToArray.Convert();
                            convertToArray.PrintArray();
                        }
                        Console.WriteLine("Нажмите любую клавишу...");
                        Console.ReadKey();
                        Console.Clear();
                        Run();
                        break;

                    default:
                        {
                            Console.Clear();
                            Console.WriteLine("Это невозможно, но ты поломал программу(((");
                        }
                        break;
                }
            }
        }
    }
}

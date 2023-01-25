using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HomeWork3in1_25_27_29_
{
    class SumOfDigits
    {
        int Number { get; set; }
        int sum;

        public SumOfDigits() { }        

        public int CalculateSum()
        {
            int number, absNumber;
            Console.Write("Введите целое число: ");
            while (!int.TryParse(Console.ReadLine(), out number))
            {
                Console.Write("Ошибка! Введите целое число: ");
            }
            absNumber = Math.Abs(number);
            Number = number;

            int temp;
            sum = 0;
            while (absNumber > 0)
            {
                temp = absNumber % 10;
                absNumber /= 10;
                sum += temp;
            }
            return sum;
        }

        public void PrintSumOfDigits()
        {
            Console.WriteLine($"Сумма цифр в числе {Number} = {sum}");
        }
    }
}

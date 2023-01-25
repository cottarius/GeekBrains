using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HomeWork3in1_25_27_29_
{
    class Power
    {
        double NumberA { get; set; }
        double NumberB { get; set; }
        double result;

        public Power() { }
        
        public double Exponantion()
        {
            double numberA;
            Console.Write("Введите целое число: ");
            while (!double.TryParse(Console.ReadLine(), out numberA))
            {
                Console.Write("Ошибка! Введите целое число: ");
            }
            NumberA = numberA;

            double numberB;
            Console.Write("Введите степень: ");
            while (!double.TryParse(Console.ReadLine(), out numberB))
            {
                Console.Write("Ошибка! Введите целое число: ");
            }
            double count = NumberA;
            result = NumberA;

            NumberB = numberB;
            if (numberB == 0)
            {
                return result = 1;
            }
            else if (numberB < 0)
            {
                for (int i = 1; i < Math.Abs(NumberB); i++)
                {
                    result *= count;
                }
                return result = 1 / result;                
            }
            else
            {
                for (int i = 1; i < NumberB; i++)
                {
                    result *= count;
                }
                return result;
            }
        }

        public void PrintResult()
        {
            Console.WriteLine($"При возведении числа {NumberA} в степень {NumberB} получился результат: {result}");
        }
    }
}

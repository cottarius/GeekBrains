using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HomeWork3in1_25_27_29_
{
    class ConvertToArray
    {
        int[] array { get; set; }
        
        public ConvertToArray() { }

        public int[] Convert()
        {
            Console.WriteLine("Создаём массив...");
            Console.Write("Введите размер массива: ");
            int N;

            while (!int.TryParse(Console.ReadLine(), out N) || N <= 0)
            {
                Console.Write("Ошибка! Введите целое не нулевое положительное число: ");
            }
            array = new int[N];
            Console.WriteLine("Заполняем массив: ");
            for (int count = 0; count < N; count++)
            {
                Console.Write($"Введите {count}-й элемент массива: ");
                while (!int.TryParse(Console.ReadLine(), out array[count]))
                {
                    Console.Write("Ошибка ввода! Введите целое число: ");
                }                
            }
            return array;
        }

        public void PrintArray()
        {
            Console.Write("Массив cостоит из: ");
            for (int i = 0; i < array.Length; i++)
            {
                Console.Write(array[i]);
                if (i < array.Length - 1)
                {
                    Console.Write(", ");
                }
            }
            Console.WriteLine();
        }
    }
}

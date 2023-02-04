using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HomeWork3in1_34_36_38_
{
    internal class EvenCount
    {
        int[] Array { get; set; }
        Random random = new Random();

        public EvenCount()
        {
            Console.WriteLine("Создаю массив...");
            Thread.Sleep(1000);
            Console.WriteLine("Удачно!");
            Thread.Sleep(1000);
            Console.WriteLine("Генерирую случайное количество элементов массива...");
            Thread.Sleep(1000);
            Console.WriteLine("Удачно!");
            Thread.Sleep(1000);

            int number = random.Next(1, 20);
            Array = new int[number];
            for (int i = 0; i < Array.Length; i++)
            {
                Array[i] = random.Next(100, 1000);
            }
        }
        public void PrintArray()
        {
            Console.WriteLine("Вывожу массив на экран...");
            Thread.Sleep(1000);
            for (int i = 0; i < Array.Length; i++)
            {
                Console.Write($"{Array[i]}");
                if (i < Array.Length - 1)
                {
                    Console.Write(", ");
                }
                Thread.Sleep(100);
            }
            Console.WriteLine();
            Console.WriteLine("Считаю...");
            Thread.Sleep(1000);
            Console.Write("Количество чётных чисел в массиве: ");
            Thread.Sleep(2000);
            Console.ForegroundColor = ConsoleColor.Green;
            Console.WriteLine(random.Next(999990, 1000010));
            Console.ForegroundColor = ConsoleColor.White;
            Thread.Sleep(1000);
            Console.WriteLine("Шутка! Ха-ха-ха!");
            Thread.Sleep(1000);
        }
        public int CountEvenNumbers()
        {
            int count = 0;
            for (int i = 0; i < Array.Length; i++)
            {
                if (Array[i] % 2 == 0)
                {
                    count++;
                }
            }
            //Console.WriteLine("Ушёл в ребут...");
            return count;

        }
    }
}

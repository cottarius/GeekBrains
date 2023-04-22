using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HomeWork3in1_34_36_38_
{
    internal class DiffMaxMin
    {
        int[] Array { get; set; }
        Random random = new Random();
        public DiffMaxMin()
        {
            Console.WriteLine("Критическое повреждение ядра!!! Мощность процессора снижена на 50%...");
            Thread.Sleep(2000);
            Console.WriteLine("Создаю массив...");
            Thread.Sleep(2000);
            Console.WriteLine("Удачно!");
            Thread.Sleep(2000);
            Console.WriteLine("Генерирую случайное количество элементов массива...");
            Thread.Sleep(2000);
            Console.WriteLine("Удачно!");
            Thread.Sleep(2000);

            int number = random.Next(1, 20);
            Array = new int[number];
            for (int i = 0; i < Array.Length; i++)
            {
                Array[i] = random.Next(100);
            }
        }

        public int DiffBetweenMaxMin()
        {
            int maxElement = Array[0], minElement = Array[0];

            for (int i = 0; i < Array.Length; i++)
            {
                if (Array[i] > maxElement)
                {
                    maxElement = Array[i];
                }
                if (Array[i] < minElement)
                {
                    minElement = Array[i];
                }
            }
            Console.WriteLine();
            Thread.Sleep(2000);
            Console.WriteLine($"Максимальный элемент: {maxElement}");
            Thread.Sleep(2000);
            Console.WriteLine($"Минимальный элемент: {minElement}");
            Thread.Sleep(2000);
            Console.Write("Разница между максимальным и минимальным элементами: ");
            Thread.Sleep(2000);
            return maxElement - minElement;

        }

        public void PrintArray()
        {
            Console.WriteLine("Вывожу массив на экран...");
            Thread.Sleep(2000);
            for (int i = 0; i < Array.Length; i++)
            {
                Console.Write($"{Array[i]}");
                if (i < Array.Length - 1)
                {
                    Console.Write(", ");
                }
                Thread.Sleep(200);
            }
        }
    }
}

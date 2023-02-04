using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HomeWork3in1_34_36_38_
{
    internal class SumOfOddElements
    {
        int[] Array { get; set; }
        Random random = new Random();
        public SumOfOddElements()
        {
            Console.WriteLine("Ладно... Следующая задача...");
            Thread.Sleep(1000);
            Console.WriteLine("Создаю очередной массив...");
            Thread.Sleep(1000);
            Console.WriteLine("Удачно!");
            Thread.Sleep(1000);
            Console.WriteLine("Генерирую случайное количество элементов массива...");
            Thread.Sleep(1000);
            Console.WriteLine("Удачно!");
            Thread.Sleep(1000);

            int number = random.Next(5, 20);
            Array = new int[number];
            for (int i = 0; i < Array.Length; i++)
            {
                Array[i] = random.Next(-100, 100);
            }
        }

        public void PrintArray()
        {
            Console.WriteLine("Вывожу массив на экран...");
            Thread.Sleep(1000);
            Console.WriteLine(String.Join(", ", Array));
            //Console.WriteLine();
        }

        public int GetSumOfOdd()
        {
            int sum = 0;
            for (int i = 1; i < Array.Length; i += 2)
            {
                sum += Array[i];
            }
            Thread.Sleep(1000);
            Console.WriteLine("Считаю сумму элементов на нечётных позициях...");
            Thread.Sleep(1000);
            Console.Write("Всё... Цепи замкнуло... Перегрев процессора... Сумма элементов: ");
            Thread.Sleep(1000);
            return sum;
        }
    }
}

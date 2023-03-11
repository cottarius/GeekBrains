using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HomeWork41_43
{
    class Point
    {
        private double K { get; set; }
        private double B { get; set; }

        public Point()
        {
            double k, b;
            Console.Write("Введите k: ");
            while (!Double.TryParse(Console.ReadLine(), out k))
            {
                Console.Write("Ошибка! Введите число: ");
            }
            K = k;

            Console.Write("Введите b: ");
            while (!Double.TryParse(Console.ReadLine(), out b))
            {
                Console.Write("Ошибка! Введите число: ");
            }
            B = b;
        }
        public static void GetPoint(Point p1, Point p2)
        {

            if(p1.K == p2.K)
            {
                Console.WriteLine("Прямые параллельны");                
            }
            else
            {
                double X = (p2.B - p1.B) / (p1.K - p2.K);
                double Y = p1.K * X + p1.B;
                Console.WriteLine($"X: {X}, Y: {Y}");
            }

        }
    }
}

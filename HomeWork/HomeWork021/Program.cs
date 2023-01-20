Point point1 = new Point();
point1.SetPoint();
Point point2 = new Point();
point2.SetPoint();
double result1 = Point.Distance(point1, point2);
Point.PrintResult(result1);

System.Console.WriteLine();

Point point3 = new Point(7, -5, 0);
Point point4 = new Point(1, -1, 9);
double result2 = Point.Distance(point3, point4);
Point.PrintResult(result2);

class Point
{    
    private int X { get; set; }
    private int Y { get; set; }
    private int Z { get; set; }

    public Point() { }
    public Point(int x, int y, int z)
    {
        X = x;
        Y = y;
        Z = z;        
    }

    public static double Distance(Point p1, Point p2)
    {
        return Math.Sqrt(Math.Pow((p2.X - p1.X), 2) + Math.Pow((p2.Y - p1.Y), 2) + Math.Pow((p2.Z - p1.Z), 2));
    }

    public Point SetPoint()
    {
        Point point = new Point();
        int x;
        Console.Write("Введите координату X точки: ");
        while(!int.TryParse(Console.ReadLine(), out x))
        {
            Console.Write("Будьте внимательнее! Нужно ввести целое число: ");
        }
        X = x;

        int y;
        Console.Write("Введите координату Y точки: ");
        while (!int.TryParse(Console.ReadLine(), out y))
        {
            Console.Write("Будьте внимательнее! Нужно ввести целое число: ");
        }
        Y = y;

        int z;
        Console.Write("Введите координату Z точки: ");
        while (!int.TryParse(Console.ReadLine(), out z))
        {
            Console.Write("Будьте внимательнее! Нужно ввести целое число: ");
        }
        Z = z;
        Console.WriteLine("Успешно!");   

        return point;
    }
    public static void PrintResult(double result)
    {
        Console.WriteLine($"Расстояние между двумя точками в 3D пространстве равно: {String.Format("{0:0.##}", result)}");
    }
}


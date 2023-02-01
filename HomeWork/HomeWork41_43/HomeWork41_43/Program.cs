using HomeWork41_43;

Point point1 = new Point();
Point point2 = new Point(); 
Point.GetPoint(point1, point2);

Console.WriteLine("Введите массив чисел: ");
Console.WriteLine($"Количество положительных чисел в массиве: {FindPositive(Console.ReadLine())}");
int FindPositive(string str)
{    
    if (str == "" || str == null)
    {
        return -1;
    }
    else
    {
        int count = 0;
        double[] numbers = str.Split(' ', ',', '.', ':', ';').Select(double.Parse).ToArray();
        for (int i = 0; i < numbers.Length; i++)
        {
            if (numbers[i] > 0)
            {
                count++;
            }
        }
        return count;
    }
}







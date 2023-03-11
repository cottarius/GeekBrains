Cubing cubing1 = new Cubing(3);
cubing1.GetResult();

Console.WriteLine();

Cubing cubing2 = new Cubing();
cubing2.SetNumber();
cubing2.GetResult();


class Cubing
{
    double Number { get; set; }

    public Cubing() { }
    public Cubing(double number)
    {
        Number = number;
    }
    
    public void GetResult()
    {        
        double i = 1;

        Console.Write($"Таблица кубов чисел от 1 до {Number}: ");

        while (i <= Number)
        {
            Console.Write($"{Math.Pow(i, 3)}");            
            if(i < Number)
            {
                Console.Write(", ");
            }
            i++;
        }
        //Number = number;
    }
     public Cubing SetNumber()
     {
        Cubing cubing = new Cubing();
        double number;
        Console.Write("Введите число: ");
        while(!double.TryParse(Console.ReadLine(), out number))
        {
            Console.WriteLine("Хватит косячить! Введите натуральное число: ");
        }
        Number = number;
        return cubing;
     }
}
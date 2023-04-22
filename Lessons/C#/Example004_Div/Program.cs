double Div()
{
    double numberA = new Random().Next(10, 20);
    Console.WriteLine(numberA);
    double numberB = new Random().Next(2, 4);
    Console.WriteLine(numberB);
    return numberA / numberB;
}


Console.WriteLine(Div());

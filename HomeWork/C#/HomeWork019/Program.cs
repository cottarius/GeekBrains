
Palyndrome palyndrome1 = new Palyndrome(14212);
palyndrome1.PrintResult();

Palyndrome palyndrome2 = new Palyndrome();
palyndrome2.SetPalyndrome();
palyndrome2.PrintResult();

class Palyndrome
{
    int Number { get; set; }
    public string? Name { get; set; }

    public Palyndrome() { }
    public Palyndrome(int number)
    {
        Number = number;
        Name = number.ToString();
    }
    public void SetPalyndrome()
    {        
        System.Console.Write("Введите целое пятизначное число: ");
        int number;
        while (!int.TryParse(Console.ReadLine(), out number) || !(Math.Abs(number) > 9999) || !(Math.Abs(number) < 100000))
        {
            System.Console.Write("Ошибка! Введите целое пятизначное число: ");
        }
        Number = number;
        Name = number.ToString();        
    }
    private bool IsPalyndrome()
    {
        int digit1 = Number / 10000;

        int digit2 = Number / 1000;
        digit2 = digit2 % 10;

        int digit4 = Number / 10;
        digit4 = digit4 % 10;

        int digit5 = Number % 10;

        if (digit1 == digit5 && digit2 == digit4)
        {
            return true;
        }
        else
            return false;
    }

    public void PrintResult()
    {
        System.Console.WriteLine("Проверка на палиндромность:");
        if(IsPalyndrome())
        {
            Console.WriteLine($"Да! {Name} является палиндромом!");
        }
        else
        {
            Console.WriteLine($"Нет! {Name} не является палиндромом!");
        }
    }
}

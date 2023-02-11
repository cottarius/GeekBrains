string RecurtionNto1(int N)
{
    if (N == 0) return "1";
    if (N == 1) return $"{N}";
    return $"{N}, {RecurtionNto1(N - 1)}";
}

int RecurtionSumAtoB(int a, int b)
{
    if(b < a)
    {
        int temp = a;
        a = b;
        b = temp;
    }
    if (b == a) return b;
    return b + RecurtionSumAtoB(a, b - 1);
}

int AckermannFunc(int m, int n)
{
    if (m == 0) return n + 1;
    else if (n == 0 && m != 0) return AckermannFunc(m - 1, 1);
    else return AckermannFunc(m - 1, AckermannFunc(m, n - 1));
}

Console.WriteLine("***HomeWork064 - Натуральные числа в промежутке от N до 1***");
int N = 0;
Console.Write("Введите натуральное число: ");
while(!int.TryParse(Console.ReadLine(), out N) || N < 0)
{
    Console.Write("Ошибка! Введите целое положительное число : ");
}
Console.WriteLine($"Натуральные числа в промежутке от {N} до 1:\n{RecurtionNto1(N)}");

Console.WriteLine();

Console.WriteLine("***HomeWork066 - Сумма натуральных элементов от [А до В]***");
int A, B;
Console.Write("Введите первое натуральное число: ");
while (!int.TryParse(Console.ReadLine(), out A) || A < 0)
{
    Console.Write("Ошибка! Введите целое положительное число : ");
}
Console.Write("Введите второе натуральное число: ");
while (!int.TryParse(Console.ReadLine(), out B) || B < 0)
{
    Console.Write("Ошибка! Введите целое положительное число : ");
}
Console.WriteLine($"Сумма натуральных элементов от {A} до {B} равна {RecurtionSumAtoB(A, B)}");

Console.WriteLine();

Console.WriteLine("***HomeWork068 - Функция Аккермана***");
int m, n;
Console.Write("Введите первое натуральное число: ");
while (!int.TryParse(Console.ReadLine(), out m) || m < 0)
{    
    Console.Write("Ошибка! Введите целое положительное число : ");
}
Console.Write("Введите второе натуральное число: ");
while (!int.TryParse(Console.ReadLine(), out n) || n < 0)
{
    Console.Write("Ошибка! Введите целое положительное число : ");
}
Console.WriteLine($"Результат вычисления: {AckermannFunc(m, n)}");

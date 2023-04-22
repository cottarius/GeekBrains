double Factorial(int n)
{
    if (n == 1) return 1;
    else return n * Factorial(n - 1);
}

int Fibonacci(int n)
{
    if (n == 1 || n == 2) return 1;
    else return Fibonacci(n - 1) + Fibonacci(n - 2);
}

for (int i = 1; i < 5; i++)
{
    System.Console.WriteLine($"{i}! = {Factorial(i)}");
}

for (int i = 1; i < 11; i++)
{
    System.Console.WriteLine(Fibonacci(i));
}

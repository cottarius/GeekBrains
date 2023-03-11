//С функцией
void ListEven(int n)
{
    for(int i = 1; i <= n; i++)
    {
        if(i % 2 == 0)
        {
            System.Console.Write($"{i} ");
        }
    }
}
int N;
System.Console.Write("Введите число N: ");
while(!Int32.TryParse(Console.ReadLine(), out N))
{
    System.Console.Write("Необходимо ввести целое число! Пропробуйте ещё раз: ");
}

ListEven(N);
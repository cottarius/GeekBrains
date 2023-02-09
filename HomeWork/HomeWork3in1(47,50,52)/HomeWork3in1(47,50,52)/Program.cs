using Matrix_Constructor;

int stateMenu;

Menu();
while (stateMenu != 0)
{
    switch (stateMenu)
    {
        case 1:
            {
                Console.Clear();
                double[,] matrix = CreateRealNumbersMatrix(3, 4);
                MatrixConstructor.PrintDoubleMatrix(matrix);
            }
            Console.WriteLine("Нажмите любую клавишу...");
            Console.ReadKey();
            Console.Clear();
            Menu();
            break;
        case 2:
            {
                Console.Clear();
                int[,] matrix2 = MatrixConstructor.CreateMatrix(3, 4, 1, 9);
                MatrixConstructor.PrintIntMatrix(matrix2);
                GetIndexValue(matrix2);
            }
            Console.WriteLine("Нажмите любую клавишу...");
            Console.ReadKey();
            Console.Clear();
            Menu();
            break;
        case 3:
            {
                Console.Clear();
                int[,] matrix3 = MatrixConstructor.CreateMatrix(3, 4, 1, 10);
                Console.WriteLine("Сгенерирована рандомная матрица...");
                MatrixConstructor.PrintIntMatrix(matrix3);
                double[] array = ColumnAverage(matrix3);
                Console.WriteLine("Среднее арифметическое элементов в каждом столбце матрицы представлено в массиве: ");
                Console.WriteLine(String.Join(" ", array));
            }
            Console.WriteLine("Нажмите любую клавишу...");
            Console.ReadKey();
            Console.Clear();
            Menu();
            break;

        default:
            Console.WriteLine("Что-то пошло не так...");
            stateMenu = 0;
            break;
    }
}

void Menu()
{
    Console.WriteLine("Выберите номер задания:\n" +
        "1. Задайте двумерный массив размером M x N, заполненный случайными вещественными числами.\n" +
        "2. Возвращение элемента массива по позиции.\n" +
        "3. Среднее арифметическое элементов в каждом столбце.\n" +
        "0. Выход");
    Console.Write("Ваш выбор: ");
    while (!Int32.TryParse(Console.ReadLine(), out stateMenu) || stateMenu < 0 || stateMenu > 3)
    {
        Console.Write("Ошибка! Выберите пункт меню: ");
    }
}
double[] ColumnAverage(int[,] matrix)
{
    int getLenth0 = matrix.GetLength(0);
    int getLenth1 = matrix.GetLength(1);
    double sum = 0;
    double[] array = new double[matrix.GetLength(1)];
    for (int i = 0; i < matrix.GetLength(1); i++)
    {
        sum = 0;
        for (int j = 0; j < matrix.GetLength(0); j++)
        {
            sum += matrix[j, i];

        }
        array[i] = Math.Round(sum / matrix.GetLength(0), 1);
    }
    return array;
}
double[,] CreateRealNumbersMatrix(int rowLength, int columnLength)
{
    double[,] matrix = new double[rowLength, columnLength];
    Random random = new Random();
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            matrix[i, j] = Math.Round((random.NextDouble() * 20 - 10), 1);
        }
    }
    return matrix;
}

void GetIndexValue(int[,] matrix)
{
    int rowIndex, columnIndex;

    Console.WriteLine("Введите координаты элемента матрицы: ");
    Console.Write("Введите координату строки: ");
    while (!int.TryParse(Console.ReadLine(), out rowIndex) || rowIndex < 0)
    {
        Console.Write("Ошибка! Введите целое число: ");
    }    
    Console.Write("Введите координату столбца: ");
    while (!int.TryParse(Console.ReadLine(), out columnIndex) || rowIndex < 0)
    {
        Console.Write("Ошибка! Введите целое число: ");
    }    

    if (rowIndex > matrix.GetLength(0) - 1 || columnIndex > matrix.GetLength(1) - 1)
    {
        Console.WriteLine($"[{rowIndex},{columnIndex}] - такого числа в массиве нет");
    }
    else
    {
        Console.WriteLine($"Значение элемента массива с координатами [{rowIndex},{columnIndex}] = {matrix[rowIndex, columnIndex]}");
    }
}




using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Matrix_Constructor
{
    static class MatrixConstructor
    {
        static int[,]? IntMatrix { get; set; }
        static double[,]? DoubleMatrix { set; get; } 
        static int[,,]? Matrix3d { get; set; }
        static Random random = new Random();

        public static int[,] CreateSpiralMatrix(int rowLength, int columnLength)
        {
            IntMatrix = new int[rowLength, columnLength];
            int row = 0;
            int col = 0;
            int dx = 1;
            int dy = 0;
            int dirChanges = 0;
            int visits = columnLength;

            for (int i = 0; i < IntMatrix.Length; i++)
            {
                IntMatrix[row, col] = i + 1;
                if (--visits == 0)
                {
                    visits = columnLength * (dirChanges % 2) + rowLength * ((dirChanges + 1) % 2) - (dirChanges / 2 - 1) - 2;
                    int temp = dx;
                    dx = -dy;
                    dy = temp;
                    dirChanges++;
                }

                col += dx;
                row += dy;
            }
            return IntMatrix;
        }

        public static int[,,] CreateMatrix3d(int rowLength, int columnLength, int deepLength, int randomA, int randomB)
        {            
            Matrix3d = new int[rowLength, columnLength, deepLength];
            for(int i = 0; i < Matrix3d.GetLength(0); i++)
            {
                for(int j = 0; j < Matrix3d.GetLength(1); j++)
                {
                    for(int k = 0; k < Matrix3d.GetLength(2); k++)
                    {
                        var index = Enumerable.Range(randomA, randomB).OrderBy(n => random.Next()).ToArray();
                        Matrix3d[i, j, k] = index[i];
                    }
                }
            }
            return Matrix3d;
        }
        public static int[,] CreateMatrix(int rowLength, int columnLength, int randomA, int randomB)
        {
            IntMatrix = new int[rowLength, columnLength];
            for (int i = 0; i < IntMatrix.GetLength(0); i++)
            {
                for (int j = 0; j < IntMatrix.GetLength(1); j++)
                {
                    IntMatrix[i, j] = random.Next(randomA, randomB);
                }
            }
            return IntMatrix;
        }

        public static double[,] CreateMatrix(int rowLength, int columnLength, int index)
        {
            DoubleMatrix = new double[rowLength, columnLength];
            for (int i = 0; i < DoubleMatrix.GetLength(0); i++)
            {
                for (int j = 0; j < DoubleMatrix.GetLength(1); j++)
                {
                    DoubleMatrix[i, j] = Math.Round(random.NextDouble() * index, 2);
                }
            }
            return DoubleMatrix;
        }

        public static int[,] CreateMatrix(int randomA, int randomB)
        {
            int row, column;
            Console.Write("Введите количество строк матрицы: ");
            while (!int.TryParse(Console.ReadLine(), out row))
            {
                Console.Write("Введите целое число больше нуля: ");
            }
            Console.Write("Введите количество строк матрицы: ");
            while (!int.TryParse(Console.ReadLine(), out column))
            {
                Console.Write("Введите целое число больше нуля: ");
            }
            IntMatrix = new int[row, column];
            for (int i = 0; i < IntMatrix.GetLength(0); i++)
            {
                for (int j = 0; j < IntMatrix.GetLength(1); j++)
                {
                    IntMatrix[i, j] = random.Next(randomA, randomB);
                }
            }
            return IntMatrix;
        }

        public static int[,] CreateMatrix()
        {
            int row, column;
            Console.Write("Введите количество строк матрицы: ");
            while (!int.TryParse(Console.ReadLine(), out row))
            {
                Console.Write("Введите целое число больше нуля: ");
            }
            Console.Write("Введите количество строк матрицы: ");
            while (!int.TryParse(Console.ReadLine(), out column))
            {
                Console.Write("Введите целое число больше нуля: ");
            }
            IntMatrix = new int[row, column];
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < column; j++)
                {
                    if (int.TryParse(Console.ReadLine(), out IntMatrix[i, j])) { }
                    else Console.Write("Неверный формат числа! Записывается значение по-умолчанию (0)...");
                }
            }
            return IntMatrix;
        }

        public static void PrintMatrix(int[,,] matrix)
        {
            Matrix3d = matrix;
            for (int i = 0; i < Matrix3d.GetLength(0); i++)
            {
                for (int j = 0; j < Matrix3d.GetLength(1); j++)
                {
                    for (int k = 0; k < Matrix3d.GetLength(2); k++)
                    {
                        Console.Write($"{Matrix3d[i, j, k],-1}({i},{j},{k}) ");
                    }
                    Console.WriteLine();
                }
                //Console.WriteLine();
            }
        }

        public static void PrintMatrix(int[,] matrix)
        {
            IntMatrix = matrix;
            for (int i = 0; i < IntMatrix.GetLength(0); i++)
            {
                for (int j = 0; j < IntMatrix.GetLength(1); j++)
                {
                    Console.Write($"{IntMatrix[i, j], -3}");
                }
                Console.WriteLine();
            }
        }

        public static int FindMinOfRow(int[,] matrix)
        {
            int sum = 0;
            int[] array = new int[matrix.GetLength(0)];
            for(int i = 0; i < matrix.GetLength(0); i++)
            {
                for(int j = 0; j < matrix.GetLength(1); j++)
                {
                    sum += matrix[i, j];
                }
                array[i] = sum;
                sum = 0;
            }
            return Array.IndexOf(array, array.Min());
        }

        public static int[,] MultiplyTwoMatrix(int[,] matrixA, int[,] matrixB)
        {
            int[,] matrixC = new int[matrixA.GetLength(0), matrixA.GetLength(1)];
            for(int i = 0; i < matrixA.GetLength(0); i++)
            {
                for(int j = 0; j < matrixB.GetLength(1); j++)
                {
                    for(int k = 0; k < matrixB.GetLength(1); k++)
                    {
                        matrixC[i, j] += matrixA[i, k] * matrixB[k, j];
                    }
                }
            }
            return matrixC;
        }        

        public static void PrintMatrix(double[,] matrix)
        {
            DoubleMatrix = matrix;
            for (int i = 0; i < DoubleMatrix.GetLength(0); i++)
            {
                for (int j = 0; j < DoubleMatrix.GetLength(1); j++)
                {
                    Console.Write($"{DoubleMatrix[i, j], -5} ");
                }
                Console.WriteLine();
            }
        }

        public static int[,] SortMatrix(int[,] matrix)
        {
            IntMatrix = matrix;
            Console.WriteLine("Сортировка матрицы от начального элемента до конечного по возрастанию:");
            for (int i = 0; i < IntMatrix.GetLength(0); i++)
            {
                for (int j = 0; j < IntMatrix.GetLength(1); j++)
                {
                    for (int k = 0; k < IntMatrix.GetLength(0); k++)
                    {
                        for (int l = 0; l < IntMatrix.GetLength(1); l++)
                        {
                            if (IntMatrix[i, j] <= IntMatrix[k, l])
                            {
                                int temp = IntMatrix[i, j];
                                IntMatrix[i, j] = IntMatrix[k, l];
                                IntMatrix[k, l] = temp;
                            }
                        }
                    }
                }
            }
            return IntMatrix;
        }

        public static double[,] SortMatrix(double[,] matrix)
        {
            DoubleMatrix = matrix;
            Console.WriteLine("Сортировка матрицы от начального элемента до конечного по возрастанию:");
            for (int i = 0; i < DoubleMatrix.GetLength(0); i++)
            {
                for (int j = 0; j < DoubleMatrix.GetLength(1); j++)
                {
                    for (int k = 0; k < DoubleMatrix.GetLength(0); k++)
                    {
                        for (int l = 0; l < DoubleMatrix.GetLength(1); l++)
                        {
                            if (DoubleMatrix[i, j] <= DoubleMatrix[k, l])
                            {
                                double temp = DoubleMatrix[i, j];
                                DoubleMatrix[i, j] = DoubleMatrix[k, l];
                                DoubleMatrix[k, l] = temp;
                            }
                        }
                    }
                }
            }
            return DoubleMatrix;
        }

        public static int[,] SortMatrixByRows(int[,] matrix)
        {
            IntMatrix = matrix;
            Console.WriteLine("Сортировка матрицы отдельно по строкам:");
            for (int i = 0; i < IntMatrix.GetLength(0); i++)
            {
                for (int j = 0; j < IntMatrix.GetLength(1); j++)
                {
                    for (int k = 0; k < IntMatrix.GetLength(1) - 1; k++)
                    {
                        if (IntMatrix[i, k] > IntMatrix[i, k + 1])
                        {
                            int temp = IntMatrix[i, k];
                            IntMatrix[i, k] = IntMatrix[i, k + 1];
                            IntMatrix[i, k + 1] = temp;
                        }
                    }
                }
            }
            return IntMatrix;
        }

        public static double[,] SortMatrixByRows(double[,] matrix)
        {
            DoubleMatrix = matrix;
            Console.WriteLine("Сортировка матрицы отдельно по строкам:");
            for (int i = 0; i < DoubleMatrix.GetLength(0); i++)
            {
                for (int j = 0; j < DoubleMatrix.GetLength(1); j++)
                {
                    for (int k = 0; k < DoubleMatrix.GetLength(1) - 1; k++)
                    {
                        if (DoubleMatrix[i, k] > DoubleMatrix[i, k + 1])
                        {
                            double temp = DoubleMatrix[i, k];
                            DoubleMatrix[i, k] = DoubleMatrix[i, k + 1];
                            DoubleMatrix[i, k + 1] = temp;
                        }
                    }
                }
            }
            return DoubleMatrix;
        }

        public static int[,] SortMatrixByColumns(int[,] matrix)
        {
            IntMatrix = matrix;
            Console.WriteLine("Сортировка матрицы по столбцам:");
            for (int i = 0; i < IntMatrix.GetLength(1); i++)
            {
                for (int j = 0; j < IntMatrix.GetLength(0); j++)
                {
                    for (int k = j; k < IntMatrix.GetLength(0); k++)
                    {
                        if (IntMatrix[j, i] > IntMatrix[k, i])
                        {
                            int temp = IntMatrix[k, i];
                            IntMatrix[k, i] = IntMatrix[j, i];
                            IntMatrix[j, i] = temp;
                        }
                    }
                }
            }
            return IntMatrix;
        }

        public static double[,] SortMatrixByColumns(double[,] matrix)
        {
            DoubleMatrix = matrix;
            Console.WriteLine("Сортировка матрицы по столбцам:");
            for (int i = 0; i < DoubleMatrix.GetLength(1); i++)
            {
                for (int j = 0; j < DoubleMatrix.GetLength(0); j++)
                {
                    for (int k = j; k < DoubleMatrix.GetLength(0); k++)
                    {
                        if (DoubleMatrix[j, i] > DoubleMatrix[k, i])
                        {
                            double temp = DoubleMatrix[k, i];
                            DoubleMatrix[k, i] = DoubleMatrix[j, i];
                            DoubleMatrix[j, i] = temp;
                        }
                    }
                }
            }
            return DoubleMatrix;
        }
    }
}

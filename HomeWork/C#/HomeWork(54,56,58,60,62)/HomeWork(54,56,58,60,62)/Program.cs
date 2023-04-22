using Matrix_Constructor;


Console.WriteLine("****HomeWork54****");
int[,] matrix = MatrixConstructor.CreateMatrix(4, 4, 1, 10);

Console.WriteLine("Рандомная матрица:");
MatrixConstructor.PrintMatrix(matrix);

Console.WriteLine();

MatrixConstructor.SortMatrixByRows(matrix);
MatrixConstructor.PrintMatrix(matrix);

Console.WriteLine();

Console.WriteLine("****HomeWork56****");
int[,] matrix2 = MatrixConstructor.CreateMatrix(4, 4, 1, 10);
MatrixConstructor.PrintMatrix(matrix2);

Console.WriteLine();

int numberOfMinRow = MatrixConstructor.FindMinOfRow(matrix2);
Console.WriteLine($"{numberOfMinRow + 1}-я строка имеет наименьшую сумму элементов");

Console.WriteLine();

Console.WriteLine("****HomeWork58****");
int[,] matrixA = MatrixConstructor.CreateMatrix(2, 2, 1, 10);
Console.WriteLine("Матрица А:");
MatrixConstructor.PrintMatrix(matrixA);

Console.WriteLine();

int[,] matrixB = MatrixConstructor.CreateMatrix(2, 2, 1, 10);
Console.WriteLine("Матрица B:");
MatrixConstructor.PrintMatrix(matrixB);

Console.WriteLine();
Console.WriteLine("Произведение двух матриц:");
int[,] matrixC = MatrixConstructor.MultiplyTwoMatrix(matrixA, matrixB);
MatrixConstructor.PrintMatrix(matrixC);

Console.WriteLine();

Console.WriteLine("****HomeWork60****");
int[,,] matrix3d = MatrixConstructor.CreateMatrix3d(2, 2, 2, 1, 100);
MatrixConstructor.PrintMatrix(matrix3d);

Console.WriteLine();

Console.WriteLine("****HomeWork62****");
int[,] matrixSpiral = MatrixConstructor.CreateSpiralMatrix(4, 4);
MatrixConstructor.PrintMatrix(matrixSpiral);

using Array_Constructor;
using Matrix_Constructor;

ArrayConstructor constructor = new ArrayConstructor();
int[] array = constructor.CreateArray(10, -10, 10);
constructor.PrintArray(array);

Console.WriteLine();

MatrixConstructor matrixConstructor = new MatrixConstructor();
int[,] matrix = matrixConstructor.CreateMatrix(6,4,1,10);
matrixConstructor.PrintMatrix(matrix);
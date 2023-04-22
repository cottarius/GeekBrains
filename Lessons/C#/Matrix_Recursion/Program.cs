string[,] table = new string[2, 5];
//table[0,0] table[0,1] table[0,2] table[0,3] table[0,4]
//table[1,0] table[1,1] table[1,2] table[1,3] table[1,4]

table[1, 2] = "слово";

// for(int raws = 0; raws < 2; raws++)
// {
//     for(int columns = 0; columns < 5; columns++)
//     {
//         System.Console.WriteLine($"-{table[raws, columns]}-");
//     }
// }



void PrintMatrix(int[,] array)
{
    for (int raws = 0; raws < array.GetLength(0); raws++)
    {
        for (int columns = 0; columns < array.GetLength(1); columns++)
        {
            System.Console.Write($"{array[raws, columns]} ");
        }
        System.Console.WriteLine();
    }
}

void FillMatrix(int[,] array)
{
    for (int raws = 0; raws < array.GetLength(0); raws++)
    {
        for (int columns = 0; columns < array.GetLength(1); columns++)
        {
            array[raws, columns] = new Random().Next(1,10);
        }        
    }
}

int[,] matrix = new int[3, 4];
PrintMatrix(matrix);
System.Console.WriteLine();
FillMatrix(matrix);

PrintMatrix(matrix);
using HomeWork3in1_34_36_38_;

EvenCount evenCount = new EvenCount();
evenCount.PrintArray();
Console.WriteLine($"Количество чётных чисел в массиве: {evenCount.CountEvenNumbers()}");
Thread.Sleep(1000);


Console.WriteLine();


Thread.Sleep(1000);
SumOfOddElements sumOfOddElements = new SumOfOddElements();
sumOfOddElements.PrintArray();
Console.WriteLine(sumOfOddElements.GetSumOfOdd());


Console.WriteLine();


DiffMaxMin diffMaxMin = new DiffMaxMin();
diffMaxMin.PrintArray();
Console.WriteLine(diffMaxMin.DiffBetweenMaxMin());
Thread.Sleep(2000);
Console.WriteLine("Ушел в ребут...");


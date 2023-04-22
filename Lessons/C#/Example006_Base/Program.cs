Console.Clear();

int xa = 40, ya = 1;
int xb = 1, yb = 35;
int xc = 80, yc = 35;

Console.SetCursorPosition(xa, ya);
System.Console.WriteLine("+");
Console.SetCursorPosition(xb, yb);
System.Console.WriteLine("+");
Console.SetCursorPosition(xc, yc);
System.Console.WriteLine("+");

int x = xa, y = xb;
for (int count = 0; count < 10000; count++)
{
    int what = new Random().Next(0, 3);
    if (what == 0)
    {
        x = (x + xa) / 2;
        y = (y + ya) / 2;
    }
    if (what == 1)
    {
        x = (x + xb) / 2;
        y = (y + yb) / 2;
    }
    if (what == 2)
    {
        x = (x + xc) / 2;
        y = (y + yc) / 2;
    }
    Console.SetCursorPosition(x, y);
    System.Console.WriteLine("+");
}
Console.ReadKey();
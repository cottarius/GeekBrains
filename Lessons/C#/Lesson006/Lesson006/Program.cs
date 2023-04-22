using System.Runtime.CompilerServices;

string text = "{1,2} {2,3} {3,4} {4,5} {5,6} {6,7}"
                    .Replace("{","")
                    .Replace("}","");
Console.WriteLine(text);

var data = text.Split(" ")
               .Select(k => k.Split(','))
               .Select(e => (x: int.Parse(e[0]), y: int.Parse(e[1])))
               .Where(e => (e.x % 2 != 0 && e.y % 2 == 0))
               .Select(point => (point.x * 10, point.y))
               .ToArray();

for(int i = 0; i < data.Length;i++)
{
    Console.WriteLine(data[i]);
}
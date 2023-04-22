System.Console.Write("Введите имя пользователя: ");
string? userName = System.Console.ReadLine();
if(userName.ToLower() == "маша")
{
    System.Console.WriteLine("Ура! Это Маша!!!");
}
else
{
    System.Console.WriteLine($"Привет, {userName}");
}
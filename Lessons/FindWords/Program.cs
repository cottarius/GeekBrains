void Findwords (string alphabet, char[] word, int length = 0)
{
    if (length == word.Length)
    {
        Console.WriteLine($"{n++} {new string(word)}"); 
        return;
    }
    for (int i = 0; i < alphabet.Length; i++)
    {
        word[length] = alphabet[i];
        Findwords(alphabet, word, length + 1);
    }    
}

Findwords("аисв", new char[4]);
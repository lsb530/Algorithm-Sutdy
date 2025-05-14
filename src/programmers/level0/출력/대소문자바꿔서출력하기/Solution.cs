using System;

public class Example
{
   public static void Main(string[] args)
        {
            String s;

            Console.Clear();
            s = Console.ReadLine();
            foreach (char c in s)
            {
                if (Char.IsUpper(c))
                {
                    Console.Write(Char.ToLower(c));
                }
                else
                {
                    Console.Write(Char.ToUpper(c));
                }
            }
        }
}
using System;

public class Example
{
    public static void Main()
    {
        String[] s;

        Console.Clear();
        s = Console.ReadLine().Split(' ');

        int a = Int32.Parse(s[0]);
        int b = Int32.Parse(s[1]);

        Console.WriteLine(a + " + " + b + " = " + (a + b)); // 문자열 더하기
        Console.WriteLine("{0} + {1} = {2}", a, b, a + b); // 복합 형식 문자열(composite formatting)
        Console.WriteLine($"{a} + {b} = {a+b}"); // 문자열 보간(string interpolation)
    }
}
using System;
using System.Text;

class Program
{
    public static void Main(string[] args)
    {
        string[] input = Console.ReadLine().Split(' ');

        int N = int.Parse(input[0]);
        int K = int.Parse(input[1]);

        int result = 1;

        if (K != 0 || K != N)
        {
            for (int i = 0; i < K; i++)
            {
                result *= (N - i);
            }

            for (int i = 0; i < K; i++)
            {
                result /= (K - i);
            }
        }

        Console.WriteLine(result);
    }
}
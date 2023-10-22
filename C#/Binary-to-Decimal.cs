using System;

public static class BinaryExtensions
{
    public static int ToDecimal(this string binary)
    {
        return Convert.ToInt32(binary, 2);
    }
}

class Program
{
    static void Main()
    {
        string binaryNumber = "1101"; // Replace with your binary number
        int decimalNumber = binaryNumber.ToDecimal();
        Console.WriteLine("Binary: " + binaryNumber);
        Console.WriteLine("Decimal: " + decimalNumber);
    }
}

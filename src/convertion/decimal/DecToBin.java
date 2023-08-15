package convertion.decimal;

import java.util.*;

public class DecToBin
{
    /*
    * Decimal to binary
    * + Get decimal input
    * + convert and return result
    */
    public void decToBin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter the decimal number (Type EXIT to quit): ");
        String input = sc.next();

        if (input.equalsIgnoreCase("EXIT"))
            return;

        try
        {
            int decimal = Integer.parseInt(input);
            String binary = Integer.toBinaryString(decimal);

            System.out.println(decimal + " = " + binary + " in binary\n");
        }
        catch (Exception e)
        {
            System.out.println("There has been an error!\nError message: " + e + "\n");
        }
    }
}

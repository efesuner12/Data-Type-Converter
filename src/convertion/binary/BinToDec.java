package convertion.binary;

import java.util.*;

public class BinToDec
{
    /*
     * Binary to decimal
     * + Get binary input
     * + convert and return result
     */
    public void binToDec()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter the binary number (Type EXIT to quit): ");
        String binary = sc.nextLine();

        if (binary.equalsIgnoreCase("EXIT"))
            return;

        try
        {
            int decimal = Integer.parseInt(binary, 2);
            System.out.println(binary + " = " + decimal + " in decimal\n");
        }
        catch (Exception e)
        {
            System.out.println("There has been an error!\nError message: " + e + "\n");
        }
    }
}

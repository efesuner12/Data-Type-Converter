package convertion.ascii;

import java.util.*;

public class ASCIIToDec
{
    Scanner sc = new Scanner(System.in);

    /*
    * ASCII to Decimal
    * + get ASCII input (char)
    * + convert to decimal and return
    */
    public void asciiToDec()
    {
        System.out.print("\nPlease enter the ascii code (Type EXIT to quit): ");
        String input = sc.next();

        if (input.equalsIgnoreCase("EXIT"))
            return;

        try
        {
            char ascii = input.charAt(0);
            System.out.println(ascii + " = " + (int) ascii + " in decimal\n");
        }
        catch (Exception e)
        {
            System.out.println("There has been an error!\nError message: " + e + "\n");
        }
    }
}

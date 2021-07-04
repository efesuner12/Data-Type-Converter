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
    public int asciiToDec()
    {
        System.out.print("\nPlease enter the ascii code: ");
        char ascii = sc.next().charAt(0);

        int decimal = ascii;

        System.out.println(ascii + " = " + decimal + " in decimal");

        return decimal;
    }
}

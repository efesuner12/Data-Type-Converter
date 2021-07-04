package convertion.hexadecimal;

import java.util.*;

public class HexToASCII
{
    Scanner sc = new Scanner(System.in);

    /*
    * Hexadecimal to ASCII
    * + get hex input
    * + Convert to ASCII:
    * ++ Split the hex string into two character group
    * ++ Convert the each character group into integer using valueOf method
    * ++ Cast the integer value to char
    * + return ascii result
    */
    public String hexToAscii()
    {
        System.out.print("\nPlease enter the hexadecimal code: ");
        String hex = sc.nextLine();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < hex.length(); i = i + 2)
        {
            String s = hex.substring(i, i + 2);
            int n = Integer.valueOf(s, 16);
            builder.append((char)n);
        }

        String ascii = builder.toString();

        System.out.println(hex + " = " + ascii + " in ASCII");

        return ascii;
    }
}

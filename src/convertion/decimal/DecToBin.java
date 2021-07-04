package convertion.decimal;

import java.util.*;

public class DecToBin
{
    Scanner sc = new Scanner(System.in);

    /*
    * Decimal to binary
    * + Get decimal input
    * + convert and return result
    */
    public String decToBin()
    {
        System.out.print("\nPlease enter the decimal number: ");
        int decimal = sc.nextInt();

        String binary = Integer.toBinaryString(decimal);

        System.out.print(decimal +" = "+ binary + " in binary");

        return binary;
    }
}

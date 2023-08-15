package operation;

import convertion.ascii.ASCIIToBin;
import convertion.ascii.ASCIIToDec;
import convertion.ascii.ASCIIToHex;
import convertion.binary.BinToASCII;
import convertion.binary.BinToDec;
import convertion.binary.BinToHex;
import convertion.decimal.DecToASCII;
import convertion.decimal.DecToBin;
import convertion.decimal.DecToHex;
import convertion.hexadecimal.HexToASCII;
import convertion.hexadecimal.HexToBin;
import convertion.hexadecimal.HexToDec;
import print.Print;

import java.util.*;

public class Operation
{
    Scanner sc = new Scanner(System.in);

    /*
     * Operation selector
     * + get user input of operation
     * + switch case -> call appropriate method with class object
     */
    public void operationSelector()
    {
        boolean canGo = true;

        while (canGo)
        {
            Print printVar = new Print();
            printVar.printChoose();

            System.out.print("--> ");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    ASCIIToBin asciiVar_1 = new ASCIIToBin();
                    asciiVar_1.asciiToBin();
                    stall();
                    break;
                case 2:
                    ASCIIToDec asciiVar_2 = new ASCIIToDec();
                    asciiVar_2.asciiToDec();
                    stall();
                    break;
                case 3:
                    ASCIIToHex asciiVar_3 = new ASCIIToHex();
                    asciiVar_3.asciiToHex();
                    stall();
                    break;
                case 4:
                    BinToASCII binVar_1 = new BinToASCII();
                    break;
                case 5:
                    BinToDec binVar_2 = new BinToDec();
                    binVar_2.binToDec();
                    stall();
                    break;
                case 6:
                    BinToHex binVar_3 = new BinToHex();
                    binVar_3.binToHex();
                    stall();
                    break;
                case 7:
                    DecToASCII decVar_1 = new DecToASCII();
                    break;
                case 8:
                    DecToBin decVar_2 = new DecToBin();
                    decVar_2.decToBin();
                    stall();
                    break;
                case 9:
                    DecToHex decVar_3 = new DecToHex();
                    decVar_3.decToHex();
                    stall();
                    break;
                case 10:
                    HexToASCII hexVar_1 = new HexToASCII();
                    hexVar_1.hexToAscii();
                    stall();
                    break;
                case 11:
                    HexToBin hexVar_2 = new HexToBin();
                    hexVar_2.hexToBin();
                    stall();
                    break;
                case 12:
                    HexToDec hexVar_3 = new HexToDec();
                    hexVar_3.hexToDec();
                    stall();
                    break;
                case 99:
                    System.out.println("\nBYE!\n");
                    canGo = false;
                    break;
                default:
                    System.out.println("'" + choice + "'" + " is not a valid choice!");
                    System.out.println("Please enter a valid choice and try again.");
            }
        }
    }

    private void stall()
    {
        System.out.println("Press any key to continue...");
        try {System.in.read();}
        catch (Exception ignored) {}
    }
}

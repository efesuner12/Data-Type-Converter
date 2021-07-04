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
    /*
    * Operation selector
    * + get user input of operation
    * + switch case -> call appropriate method with class object
    * + ending loop
    */
    public void operationSelector()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("--> ");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                ASCIIToBin asciiVar_1 = new ASCIIToBin();
                asciiVar_1.asciiToBin();
                endingSelector();
                break;
            case 2:
                ASCIIToDec asciiVar_2 = new ASCIIToDec();
                asciiVar_2.asciiToDec();
                endingSelector();
                break;
            case 3:
                ASCIIToHex asciiVar_3 = new ASCIIToHex();
                asciiVar_3.asciiToHex();
                endingSelector();
                break;
            case 4:
                BinToASCII binVar_1 = new BinToASCII();

            case 5:
                BinToDec binVar_2 = new BinToDec();
                binVar_2.binToDec();
                endingSelector();
                break;
            case 6:
                BinToHex binVar_3 = new BinToHex();
                binVar_3.binToHex();
                endingSelector();
                break;
            case 7:
                DecToASCII decVar_1 = new DecToASCII();

            case 8:
                DecToBin decVar_2 = new DecToBin();
                decVar_2.decToBin();
                endingSelector();
                break;
            case 9:
                DecToHex decVar_3 = new DecToHex();
                decVar_3.decToHex();
                endingSelector();
                break;
            case 10:
                HexToASCII hexVar_1 = new HexToASCII();
                hexVar_1.hexToAscii();
                endingSelector();
                break;
            case 11:
                HexToBin hexVar_2 = new HexToBin();
                hexVar_2.hexToBin();
                endingSelector();
                break;
            case 12:
                HexToDec hexVar_3 = new HexToDec();
                hexVar_3.hexToDec();
                endingSelector();
                break;
        }
    }

    /*
    * Ending Operation Selector
    * + print info text by creating a Print Class object
    * + get user input of choice at the end
    * + 1 = conversion --> call operationSelector()
    * + 2 = end program
    */
    public void endingSelector()
    {
        Print printObject = new Print();
        printObject.printEndingChoose();

        Scanner sc = new Scanner(System.in);
        System.out.print("--> ");
        int choice = sc.nextInt();

        System.out.println();

        switch(choice)
        {
            case 1:
                printObject.printChoose();
                operationSelector();
            case 2:
                break;
        }
    }
}

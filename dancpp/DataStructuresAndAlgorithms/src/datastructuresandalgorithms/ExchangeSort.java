//Program description: Basic procedural program as an example of a bubble/exchange sort
//Program Creator: Daniel Hamilton
package datastructuresandalgorithms;

import java.util.Scanner;

public class ExchangeSort {

    public static void main(String[] args) {
        boolean swapped = true;
        int[] numberList = new int[10];
        String unSorted;
        Scanner scan = new Scanner(System.in);

        //Recieve 10 numbers for sort
        do {

            System.out.print("Please input 10 numbers (0-9): ");
            unSorted = scan.nextLine();
            if (unSorted.length() != 10) {
                System.out.println("List needs to be length of 10!\n\n");
            }
        } while (unSorted.length() != 10);

        //Probably over-complicated string to int converter
        for (int i = 0; i < 10; i++) {
            Character tempChar;
            String tempString;
            tempChar = unSorted.charAt(i);
            tempString = tempChar.toString();
            numberList[i] = Integer.parseInt(tempString);
        }

        //Start exchange sort
        while (swapped == true) {
            swapped = false;

            for (int i = 0; i < numberList.length - 1; i++) {

                if (numberList[i] > numberList[i + 1]) {
                    int swap = numberList[i];
                    numberList[i] = numberList[i + 1];
                    numberList[i + 1] = swap;

                    swapped = true;
                }
            }

        }
        
        //End sort and print result
        System.out.print("Result: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numberList[i]);
        }
        System.out.println("");


    }
}

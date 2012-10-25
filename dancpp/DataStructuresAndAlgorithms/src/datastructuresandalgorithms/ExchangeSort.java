////////////////////////////////////////////////////////////////////
//Program Description: Uses the exchange/binary sort algorithm    //
//to sort a list of 10 integers.                                  //
//Program Creator: Daniel Hamilton                                //  
//Date Created: 25-Oct-2012                                       //  
////////////////////////////////////////////////////////////////////
package datastructuresandalgorithms;

public class ExchangeSort {

    private static boolean swapped = true;
    private static int swap;

    public static int[] exchangeSort(int[] numberList) {


        //Start exchange sort
        while (swapped == true) {

            swapped = false;

            for (int i = 0; i < numberList.length - 1; i++) {

                if (numberList[i] > numberList[i + 1]) {

                    swap = numberList[i];
                    numberList[i] = numberList[i + 1];
                    numberList[i + 1] = swap;

                    swapped = true;
                }
            }

        }

        return numberList;

    }
}

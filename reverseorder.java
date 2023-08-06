import  java.util.Arrays;
import java.util.Collections;

import javax.print.attribute.PrintRequestAttribute;
public class reverseorder {
    public static void inserctionSort(Integer arr[]) {
        for (int i = 1; i <= arr.length; i++) {

            int curr = arr[i];
            int prev = i - 1;
            // finding out the correct pos to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // inserction sort
            arr[prev + 1] = curr;
        }
    }
    



    public static void revesreOrder(String args[]) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        // inserction sort( arr)
        Arrays.sort(arr, Collections.reverseOrder());
        PrintInserction(arr);
    }




    private static void PrintInserction(Integer[] arr) {
    }
}



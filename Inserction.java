import java.util.Arrays;

public class Inserction {

    public static void  insearctionSort( int arr[]){
        for( int i = 1; i<= arr.length; i++){
            int curr= arr[i];
            int prev=i-1;
            // finding out the correct pos insertion 
            while( prev>=0 && arr[ prev]> curr){
                arr[prev+1]= arr[prev];
                prev--;
            }
            //inserction
            arr[prev+1]= curr;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        Arrays.sort( arr, 0, 3);
        printarr(arr);
    }
    
}
//time complexity (big oh n2)

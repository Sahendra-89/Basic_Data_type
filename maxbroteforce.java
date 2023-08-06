public class maxbroteforce {
    // use in nested loop brute force   
    public static void printmaxSubarray(int numbers[]) {// all function same write 
        int currentSum = 0;
        int maxsum = Integer.MIN_VALUE;// substract infinite value in 
        for (int i = 0; i < numbers.length; i++) {//outer loop
            int start = i;
            for (int j = i; j < numbers.length; j++) {//innear loop
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++) {// print
                    // sum array
                    currentSum += numbers[k];

                }
                System.out.println(currentSum);//total value store 
                if (maxsum < currentSum) {
                    maxsum = currentSum;

                }

            }
        }
        System.out.println("max sum=" + maxsum);

    }

    public static void main(String args[]) {
        int number[] = { 1,-2,6,-1,3 };
        printmaxSubarray(number);
    }

}

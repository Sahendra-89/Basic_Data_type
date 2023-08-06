public class maxbrute {
    public static void maximumSubarray(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        // claculate prefix array
        for (int i = 1; i < prefix.length; i++) {// outer loop n times chalaya
            prefix[i] = prefix[i - 1] + number[i];
            // value calculate
        }
        for (int i = 0; i < number.length; i++) {// innear loop n times chalaya
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println(" max sum = " + maxSum);
        // time complexity of its array in big oh (n2)n square

    }

    public static void kadans(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {

                cs = 0;
            }

            ms = Math.max(cs, ms);
        }
        System.out.println(" our max subarray sum is: " + ms);
    }

    public static void main(String args[]) {
        int number[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadans(number);

    }

}

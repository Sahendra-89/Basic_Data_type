public class patternclass {
    public static void hollow_ractangle(int totrows, int totcolns) {
        // outer loop
        for (int i = 1; i <= totrows; i++) {
            // innear loop- colns
            for (int j = 1; j <= totcolns; j++) {
                if (i == 1 || i == totrows || j == 1 || j == totcolns) {
                    // boundary cell
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }

    public static void main(String args[]) {
        hollow_ractangle(10, 10);
    }

}

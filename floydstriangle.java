public class floydstriangle {
    public static void floid_triangle(int n) {
        // outer loop
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(counter + " ");
                counter++;
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        floid_triangle(5);
    }

}

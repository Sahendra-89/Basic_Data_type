public class hallowractangle {

    public static void inverted_half_pyramidwithNumber(int n) {
        for (int i = 1; i <= n; i++) {
            // inner -number
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);

            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        inverted_half_pyramidwithNumber(5);
    }

}

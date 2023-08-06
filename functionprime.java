public class functionprime {
    public static boolean isPrime(int n ){
         boolean  i= true;
        for (int j=2; j<=n-1; j++){
            if (n % 2==0){
               return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(isPrime(5));
    }

}

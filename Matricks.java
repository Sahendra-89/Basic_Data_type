import java.util.Scanner;

public class Matricks {
    public static void main(String args[]){
        int matricks[][]=new int[3][3];
        int n = matricks.length, m=matricks[0].length;

        Scanner sc =new Scanner(System.in);
        for( int i= 0; i<n; i++){
            for( int j=0; j<m; j++){
                matricks[i][j]=sc.nextInt();
            }
        }
        //output
        for( int i= 0; i<n; i++){
            for( int j=0; j<m; j++){
                System.out.print( matricks[i][j] + " ");
    }
    System.out.println();
}

    }
}

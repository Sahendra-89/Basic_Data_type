import java.util.*;

public class String {
    public static void printLetter( java.lang.String fullName){
        for( int i = 0; i<fullName.length(); i++){
            System.out.print(fullName.charAt(i) + " ");

        }
        System.out.println();
    }
    public static void main(String args[]) {

        //String fullName = " Tony Stark";
        //System.out.println(fullName.length());
        java.lang.String firstName= " sahendra";
        java.lang.String lastName= " kumar";
        java.lang.String fullName=firstName + " "+ lastName;
        printLetter( fullName);

    }
    public int length;
    public char charAt(int i) {
        return 0;
    }
}
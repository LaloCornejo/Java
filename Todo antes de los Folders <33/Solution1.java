import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution1 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print( "Escribe el valor de \"n\": " );
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");



        if ( n % 2 == 1 ){
        System.out.println( "Weird" );

        }
        else{

        if ( n >= 2 && n <= 5 )
        System.out.println( "Not Weird" );

        if ( n >= 6 && n <= 20 )
        System.out.println( "Weird" );

        if( n > 20 )
        System.out.println( "Not Weird" );

        }

        scanner.close();

    }
}
